public class EmpresaSetorSecundario extends Empresa {

	/* attributes */
	private String tipoDeLoja;
	
	/* constructor */
	public EmpresaSetorSecundario(String tipoDeLoja) {
		this.tipoDeLoja = tipoDeLoja;
	}

	/* methods */
	@Override
	public String dados(){
		return super.dados()
				+ "\nTipo de Loja:" + this.tipoDeLoja;
	}
	public String produzir() {
		return "A empresa "+ this.nome +" é do tipo "+ this.tipoDeLoja;
	}

	/* getters & setters */
	private void setTipoDeLoja (String tipoDeLoja) {
		this.tipoDeLoja = tipoDeLoja;
	}

	private String getTipoDeLoja () {
		return tipoDeLoja;
	}

}
