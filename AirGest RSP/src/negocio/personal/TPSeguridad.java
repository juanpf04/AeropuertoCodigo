package negocio.personal;

public class TPSeguridad extends TPersonal {
	
	private int numPlaca;

	public int getNumPlaca() {
		return this.numPlaca;
	}

	public void setNumPlaca(int numPlacas) {
		this.numPlaca = numPlacas;
	}

	public TPSeguridad(int id, int idEmpleado, String areaAsignada, boolean activo, int numPlaca) {
		super(id, activo, idEmpleado, areaAsignada);
		
		this.numPlaca = numPlaca;
	}
}