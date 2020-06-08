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
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome () {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome () {
		return sobrenome;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getIdade () {
		return idade;
	}

}
