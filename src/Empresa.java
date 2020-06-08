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
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
