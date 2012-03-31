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
			
			[a: a, b: b, soma: a + 1]
		} catch (NumberFormatException e) {
			redirect(action: "erro")
		 	//render "Voçê digitou um valor que não é um número"
		} catch (NullPointerException e) {
			redirect(action: "erro")
		 	//render "Voçê digitou um valor que não é um número"
		}
	
		//render "${a} + ${b} = ${soma}" 
	}
}
