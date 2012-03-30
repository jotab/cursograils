package twitter

class SendController {

    def index() { }
	
	def send = {
		sendMail {
			to params.email
			from "jjbeavis@gmail.com"
			subject "Hell from grails-mail"
			body "$Valeu {params.userName} "
		}
		render "Email sent"
	}
}
