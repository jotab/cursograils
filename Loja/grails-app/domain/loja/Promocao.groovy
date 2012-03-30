package loja

class Promocao {

	String descricao
	Date dataDeInicio = new Date()
	Date dataDeFim = new Date() + 1
	BigDecimal porcentagemDeDesconto = 0.05
	
	static hasMany = [produtos:Produto]
	
    static constraints = {
		descricao blank:false, widget: 'textarea';
		dataDeInicio blank:false;
		dataDeFim blank:false 
		
//		validator { df, promo ->
//				df > promo.dataDeInicio
//			};
		
		porcentagemDeDesconto blank:false, min: 0.0
    }
}
