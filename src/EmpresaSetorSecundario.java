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
	public void setTipoDeLoja (String tipoDeLoja) {
		this.tipoDeLoja = tipoDeLoja;
	}

	public String getTipoDeLoja () {
		return tipoDeLoja;
	}

}
