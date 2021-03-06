public class EmpresaSetorTerciario extends Empresa {

	/* attributes */
	private String servicoPrestado;
	
	/* constructor */
	public EmpresaSetorTerciario(String nome, Endereco endereco, String servisoPrestado) {
		super(nome, endereco);
		this.servicoPrestado = servisoPrestado;
	}
	
	/* methods */
	@Override
	public String dados() {
		return super.dados()
			+ "\nServiço Prestado:" + this.servicoPrestado;
	}

	public String produzir() {
		return "A empresa "+ this.nome +" presta o seguinte serviço: "+ this.servicoPrestado;
	}

	/* getters & setters */
	public void setServicoPrestado (String servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}

	public String getServicoPrestado () {
		return servicoPrestado;
	}

}
