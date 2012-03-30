package twitter

import java.util.Date;

class Tweet {
	
	String mensagem
	Date dateCreated
	
	static belongsTo = [usuario: Usuario]
	
    static constraints = {
		mensagem(blank:false, widget: 'textarea', size: 5..140)
    }
	
	String toString (){
		"(${usuario} ${dateCreated.format('dd/MM/YYYY')}) ${mensagem}" 
		// Interpola��o de String sempre deve usar "" (repare que foi necess�rio o uso de aspas simples na data)
	}
}
