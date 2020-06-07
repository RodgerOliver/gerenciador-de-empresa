abstract public class Empresa {

	/* attributes */
	protected String nome;
	protected Endereco endereco;
	
	/* constructor */
	public Empresa() {

	}

	/* methods */
	public String dados() {

	}

	abstract public String produzir();

	/* getters & setters */
	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNome() {
		return nome;
	}

	protected void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	protected Endereco getEndereco() {
		return endereco;
	}

}
