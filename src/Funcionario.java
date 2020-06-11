public class Funcionario extends Pessoa {

	/* attributes */
	private String cargo;
	private double salario;
	private boolean beneficioMedico;
	private boolean ativo = true;
	
	/* constructor */
	public Funcionario(String nome, String sobrenome, int idade, String cpf, String cargo, double salario, boolean beneficioMedico, boolean ativo) {
		super(nome, sobrenome, idade, cpf);
		this.cargo = cargo;
		this.salario = salario;
		this.beneficioMedico = beneficioMedico;
		this.ativo = ativo;
	}

	/* methods */
	public String dados() {
		return "Dados do funcionário\n"
			+ "\nNome Completo: " + super
			+ "\nCargo: "         + this.cargo
			+ "\nBenefício: "     + this.beneficioMedico
			+ "\nAtivo: "         + this.ativo
			+ "\nSalário: "       + this.calculaSalario();
	}

	public double consultaMedica(double valorConsulta) {
		double desconto = 1;
		if(this.beneficioMedico == true) {
			desconto = 0.5;
		}

		return valorConsulta * desconto;
	}

	public double calculaSalario() {
		return this.salario - calculaINSS();
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
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo () {
		return cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario () {
		return salario;
	}

	public void setBeneficioMedico(boolean beneficioMedico) {
		this.beneficioMedico = beneficioMedico;
	}

	public boolean getBeneficioMedico () {
		return beneficioMedico;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean getAtivo () {
		return ativo;
	}

}
