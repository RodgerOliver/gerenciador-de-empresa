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
	public String produzir() {
		return "A empresa "+ this.nome +" está transformando "+ this.materiaPrima +" em "+ this.produtoFinal;
	}

	/* getters & setters */
	private void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	private String getMateriaPrima() {
		return materiaPrima;
	}

	private void setProdutoFinal(String produtoFinal) {
		this.produtoFinal = produtoFinal;
	}

	private String getProdutoFinal() {
		return produtoFinal;
	}

}
