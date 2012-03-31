package twitter

class PlaygroundController {

    def index() { // aqui ele renderiza o texto
		render "123... testando" 
	}
	
	def consulta () { // aqui ir� procurar uma pagina chamada consulta .gsp pois n�o temos um render
		[usuario: params.usuario]
	}
	
	def calculadora () { // aqui ir� procurar uma pagina chamada consulta .gsp pois n�o temos um render
		
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
			//render "Vo�� digitou um valor que n�o � um n�mero"
		} catch (NullPointerException e) {
			flash.mensagem = "Deu erro"
		 	redirect(action: "calculadora")
		}
	
		//render "${a} + ${b} = ${soma}" 
	}
}
