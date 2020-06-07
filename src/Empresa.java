abstract public class Empresa {

	/* attributes */
	protected String nome;
	protected Endereco endereco;
	
	/* constructor */
	public Empresa(String nome, Endereco endereco) {
		this.nome;
		this.endereco;
	}

	/* methods */
	public String dados() {
		return "Dados da empresa\n"
				+ "\nNome:		"	+ this.rua
				+ "\nEndereço:	"	+ this.endereco
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
