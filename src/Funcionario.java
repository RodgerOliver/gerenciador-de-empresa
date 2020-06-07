public class Funcionario extends Pessoa {

	/* attributes */
	private String cargo;
	private double salario;
	private boolean beneficioMedico;
	private boolean ativo = true;
	
	/* constructor */
	public Funcionario(String nome, String sobrenome, String idade, String cargo, double salario, boolean beneficioMedico, boolean ativo) {
		super(nome, sobrenome, idade);
		this.cargo = cargo;
		this.salario = salario;
		this.beneficioMedico = beneficioMedico;
		this.ativo = ativo;
	}

	/* methods */
	public String consultaMedica() {

	}

	public void calculaSalario() {

	}

	public double calculaINSS() {
		double porcentagem = 0;

		if(this.salario <= 1045) {
			porcentagem = 7.5;
		} else if(this.salario <= 2089.60) {
			porcentagem = 9;
		} else if(this.salario <= 3134.40) {
			porcentagem = 12;
		} else if(this.salario <= 6101.06) {
			porcentagem = 14;
		}

		return this.salario * porcentagem / 100;
	}

	public void toggleContrato() {
		if(this.ativo == false) {
			this.ativo = true;
		} else {
			this.ativo = false;
		}
	}

	/* getters & setters */
	protected void setCargo(String cargo) {
		this.cargo = cargo;
	}

	protected String getCargo () {
		return cargo;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected double getSalario () {
		return salario;
	}

	protected void setBeneficioMedico(boolean beneficioMedico) {
		this.beneficioMedico = beneficioMedico;
	}

	protected boolean getBeneficioMedico () {
		return beneficioMedico;
	}

	protected void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	protected boolean getAtivo () {
		return ativo;
	}

}
