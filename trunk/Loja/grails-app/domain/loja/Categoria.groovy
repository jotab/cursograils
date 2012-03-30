package loja

class Categoria {

	String nome
	
	static hasMany = [produtos:Produto]

	static constraints = {
		nome blank:false
    }
	
	String toString() {
		nome
	}
}
