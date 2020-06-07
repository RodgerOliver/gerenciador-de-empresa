abstract public class Funcionario extends Pessoa {

	/* attributes */
	protected String cargo;
	protected double salario;
	protected boolean beneficioMedico;
	protected boolean ativo;
	
	/* constructor */
	public Funcionario () { };
	
	/* methods */
	abstract public String consultaMedica();

	public void calculaSalario() {

	}

	public void calculaINSS() {

	}

	public void encerrarContrato() {

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
