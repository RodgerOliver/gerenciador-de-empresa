public class EmpresaSetorPrimario extends Empresa {

	/* attributes */
	private String materiaPrima;
	private String produtoFinal;
	
	/* constructor */
	public EmpresaSetorPrimario() {

	}
	
	/* methods */
	public String produzir() {

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
