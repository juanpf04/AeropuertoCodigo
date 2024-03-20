package negocio.modelo;

import org.json.JSONObject;

public class TModelo {

	private int id;
	private String nombre;
	private String motor;
	private boolean activo;

	public TModelo() {
	}

	public TModelo(int id, String nombre, String motor, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.motor = motor;
		this.activo = activo;
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

	@Override
	public String toString() {
		return "id: " + this.id + "\nnombre: " + nombre + "\nmotor: " + motor + "\nactivo: " + activo;
	}

	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();

		jo.put("id", this.id);
		jo.put("nombre", this.nombre);
		jo.put("motor", this.motor);
		jo.put("activo", this.activo);

		return jo;
	}
}