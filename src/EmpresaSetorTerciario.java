public class EmpresaSetorTerciario extends Empresa {

	/* methods */
	private String servicoPrestado;
	
	/* constructor */
	public EmpresaSetorTerciario(String servisoPrestado) {
		this.servicoPrestado = servisoPrestado;
	}
	
	/* methods */
	public String produzir() {

	}

	/* getters & setters */
	public void setServicoPrestado (String servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}

	public String getServicoPrestado () {
		return servicoPrestado;
	}

}
