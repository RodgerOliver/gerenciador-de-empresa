abstract public class Pessoa {

	/* attributes */
	protected String nome;
	protected String sobrenome;
	protected int idade;
	protected String cpf;
	
	/* constructor */
	public Pessoa(String nome, String sobrenome, int idade, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
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

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade () {
		return idade;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
}
