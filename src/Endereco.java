public class Endereco {

	/* attributes */
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	/* constructor */
	public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	/* methods */
	public String dados() {
		return "Dados do endereço\n"
			+ "\nRua: " + this.rua
			+ "\nNúmero: " + this.numero
			+ "\nBairro: " + this.bairro
			+ "\nCidade: " + this.cidade
			+ "\nEstado: " + this.estado
			+ "\nPaís: " + this.pais;
	}

	/* getters & setters */
	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getRua() {
		return rua;
	}

	public void setNumero (int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairro () {
		return bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade () {
		return cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado () {
		return estado;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPais () {
		return pais;
	}

}
