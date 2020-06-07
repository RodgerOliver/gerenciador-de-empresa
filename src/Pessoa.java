abstract public class Pessoa {

	/* attributes */
	protected String nome;
	protected String sobrenome;
	protected String idade;
	
	/* constructor */
	public Pessoa () { };
	
	/* methods */
	public String toString() {

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
