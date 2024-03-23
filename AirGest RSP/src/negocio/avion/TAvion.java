
package negocio.avion;

import java.util.Date;
import org.json.JSONObject;

public class TAvion {

	private int id;

	private int numAsientos;

	private Date fechaFabricacion;

	private String nombre;

	private String matricula;

	private boolean activo;

	private int idAerolinea;

	private int idModelo;

	private int idHangar;

	public TAvion() {

	}

	public TAvion(int id, int numAsientos, Date fechaFabricacion, String nombre, String matricula, boolean activo,
			int idAerolinea, int idModelo, int idHangar) {
		this.id = id;
		this.numAsientos = numAsientos;
		this.fechaFabricacion = fechaFabricacion;
		this.nombre = nombre;
		this.matricula = matricula;
		this.activo = activo;
		this.idAerolinea = idAerolinea;
		this.idModelo = idModelo;
		this.idHangar = idHangar;
	}

	public int getId() {
		return this.id;
	}

	public int getNumAsientos() {
		return this.numAsientos;
	}

	public Date getFechaFabricacion() {
		return this.fechaFabricacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public boolean getActivo() {
		return this.activo;
	}
	
	public int getIdAerolinea() {
		return this.idAerolinea;
	}

	public int getIdModelo() {
		return this.idModelo;
	}

	public int getIdHangar() {
		return this.idHangar;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public void setIdHangar(int idHangar) {
		this.idHangar = idHangar;
	}
	
	public String toString(){
		return "Id: " + this.id + "\nNúmero asientos: " + this.numAsientos + "\nFecha fabricación: " + this.fechaFabricacion + "\nNombre: " + this.nombre + 
				"\nMatrícula: " + this.matricula + "\nActivo: " + this.activo + "\nId Modelo: " + this.idModelo + "\nId Aerolínea: " + this.idAerolinea + 
				"\nIdHangar: " + this.idHangar;
	}

	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();

		jo.put("id", this.id);
		jo.put("numAsientos", this.numAsientos);
		jo.put("fechaFabricacion", this.fechaFabricacion);
		jo.put("nombre", this.nombre);
		jo.put("matricula", this.matricula);
		jo.put("activo", this.activo);
		jo.put("idModelo", this.idModelo);
		jo.put("idAerolinea", this.idAerolinea);
		jo.put("idHangar", this.idHangar);

		return jo;
	}
}