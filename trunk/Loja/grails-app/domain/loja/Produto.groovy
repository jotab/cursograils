package loja

class Produto {

	String nome
	String descricao
	BigDecimal preco
	int quantidadeEmEstoque = 1
	Categoria categoria
	
	static belongsTo = Promocao
	static hasMany = [promocoes : Promocao]
	
    static constraints = {
		nome blank:false
		descricao blank:false, widget: 'textarea'
		preco blank:false, scale:2; min:0.01
		quantidadeEmEstoque blank:false; min:0
    }
	
	String toString() {
		nome
	}
}
