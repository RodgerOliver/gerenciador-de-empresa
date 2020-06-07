abstract public class Pessoa {

	/* attributes */
	protected String nome;
	protected String sobrenome;
	protected String idade;
	
	/* constructor */
	public Pessoa(String nome, String sobrenome, String idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	/* methods */
	public String toString() {
		return this.nome + " " + this.sobrenome;
	}

	/* getters & setters */
	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNome () {
		return nome;
	}

	protected void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	protected String getSobrenome () {
		return sobrenome;
	}

	protected void setIdade(String idade) {
		this.idade = idade;
	}

	protected String getIdade () {
		return idade;
	}

}
