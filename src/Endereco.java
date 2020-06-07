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

	}

	/* getters & setters */
	private void setRua(String rua) {
		this.rua = rua;
	}

	private String getRua() {
		return rua;
	}

	private void setNumero (int numero) {
		this.numero = numero;
	}

	private int getNumero() {
		return numero;
	}

	private void setBairro(String bairro) {
		this.bairro = bairro;
	}

	private String getBairro () {
		return bairro;
	}

	private void setCidade(String cidade) {
		this.cidade = cidade;
	}

	private String getCidade () {
		return cidade;
	}

	private void setEstado(String estado) {
		this.estado = estado;
	}

	private String getEstado () {
		return estado;
	}

	private void setPais(String pais) {
		this.pais = pais;
	}

	private String getPais () {
		return pais;
	}

}
