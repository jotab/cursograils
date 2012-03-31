package twitter

class PlaygroundController {

    def index() { // aqui ele renderiza o texto
		render "123... testando" 
	}
	
	def consulta () { // aqui irá procurar uma pagina chamada consulta .gsp pois não temos um render
		[usuario: params.usuario]
	}
	
	def calculadora () { // aqui irá procurar uma pagina chamada consulta .gsp pois não temos um render
		
	}
	
	def resultado () {
		def a
		def b
		
		try {
			a = params.A as Integer
			b = params.B as Integer
			
			[a: a, b: b, soma: a + b]
		} catch (NumberFormatException e) {
			flash.mensagem = "Deu erro"
		 	redirect(action: "calculadora")
			//render "Voçê digitou um valor que não é um número"
		} catch (NullPointerException e) {
			flash.mensagem = "Deu erro"
		 	redirect(action: "calculadora")
		}
	
		//render "${a} + ${b} = ${soma}" 
	}
}
