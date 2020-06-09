public class EmpresaSetorPrimario extends Empresa {

	/* attributes */
	private String materiaPrima;
	private String produtoFinal;
	
	/* constructor */
	public EmpresaSetorPrimario(String materiaPrima, String produtoFinal) {
		this.materiaPrima = materiaPrima;
		this.produtoFinal = produtoFinal;
	}
	
	/* methods */
	@Override
	public String dados(){
		return super.dados()
			+ "\nMatéria Prima: " + this.materiaPrima
			+ "\nProduto Final: " + this.produtoFinal;
	}

	public String produzir() {
		return "A empresa "+ this.nome +" está transformando "+ this.materiaPrima +" em "+ this.produtoFinal;
	}

	/* getters & setters */
	public void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public String getMateriaPrima() {
		return materiaPrima;
	}

	public void setProdutoFinal(String produtoFinal) {
		this.produtoFinal = produtoFinal;
	}

	public String getProdutoFinal() {
		return produtoFinal;
	}

}
