
package negocio.contrato;

public class TContrato {

	private int id;

	private int id_aerolinea;
	
	private double precio;
	
	private boolean activo;

	public TContrato() {

	}

	public TContrato(int id, int id_aerolinea, double precio, boolean activo) {
		this.id = id;
		this.id_aerolinea = id_aerolinea;
		this.precio = precio;
		this.activo = activo;
	}

	public int getId() {
		return this.id;
	}

	public int getIdAerolinea() {
		return this.id_aerolinea;
	}

	public double getPrecio() {
		return this.precio;
	}

	public boolean getActivo() {
		return this.activo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIdAerolinea(int idAerolinea) {
		this.id_aerolinea = idAerolinea;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}