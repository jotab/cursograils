package twitter

class PlaygroundController {

    def index() {
		render "123... testando" 
	}
	
	def consulta () {
		[usuario: params.usuario]
	}
}
