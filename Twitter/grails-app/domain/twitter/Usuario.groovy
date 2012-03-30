package twitter

import java.util.Date;

class Usuario {

	String nome
	String email
	// Atributos preenchidos automaticamente
	Date dateCreated
	Date lastUpdate

	static hasMany = [tweets: Tweet]
	
    static constraints = {
		nome(blank:false)
		email(blank: false, email:true)
    }
	
	String toString() {
		nome
	}
}
