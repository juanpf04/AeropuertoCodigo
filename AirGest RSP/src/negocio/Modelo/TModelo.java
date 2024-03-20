package negocio.Modelo;

public class TModelo {

	private int id;
	private String nombre;
	private String motor;
	private boolean activo;

	public TModelo() {
	}

	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getMotor() {
		return this.motor;
	}

	public boolean getActivo() {
		return this.activo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}