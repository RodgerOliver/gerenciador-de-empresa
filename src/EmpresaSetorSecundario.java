public class EmpresaSetorSecundario extends Empresa {

	/* attributes */
	private String tipoDeLoja;
	
	/* constructor */
	public EmpresaSetorSecundario(String tipoDeLoja) {
		this.tipoDeLoja = tipoDeLoja;
	}

	/* methods */
	public String produzir() {

	}

	/* getters & setters */
	private void setTipoDeLoja (String tipoDeLoja) {
		this.tipoDeLoja = tipoDeLoja;
	}

	private String getTipoDeLoja () {
		return tipoDeLoja;
	}

}
