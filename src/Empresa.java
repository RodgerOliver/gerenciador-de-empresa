abstract public class Empresa {

	/* attributes */
	protected String nome;
	protected Endereco endereco;
	
	/* constructor */
	public Empresa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	/* methods */
	public String dados() {
		return "Dados da empresa\n"
				+ "\nNome:" + this.nome
				+ "\nEndereço: " + this.endereco.dados();
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
