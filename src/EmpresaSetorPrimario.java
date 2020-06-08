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
