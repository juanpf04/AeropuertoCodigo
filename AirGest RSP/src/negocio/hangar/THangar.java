
package negocio.hangar;

import org.json.JSONObject;

public class THangar {
	private int id;
	private String direccion;
	private int stock;
	private double costeDia;
	private int espacioAlmacenaje;
	private boolean activo;

	public THangar() {

	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @param direccion
	* @param stock
	* @param costeDia
	* @param espacioAlmacenaje
	* @param activo
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public THangar(int id, String direccion, int stock, float costeDia, int espacioAlmacenaje, boolean activo) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	public THangar(int id, String direccion, int stock, double costeDia, int espacioAlmacenaje, boolean activo) {
		this.id = id;
		this.direccion = direccion;
		this.stock = stock;
		this.costeDia = costeDia;
		this.espacioAlmacenaje = espacioAlmacenaje;
		this.activo = activo;
	}

	public int getId() {
		return this.id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getStock() {
		return this.stock;
	}

	public double getCosteDia() {
		return this.costeDia;
	}

	public int getEspacioAlmacenaje() {
		return this.espacioAlmacenaje;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param costeDia
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCosteDia(float costeDia) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void setCosteDia(double costeDia) {
		this.costeDia = costeDia;
	}

	public void setEspacioAlmacenaje(int espacioAlmacenaje) {
		this.espacioAlmacenaje = espacioAlmacenaje;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public JSONObject toJSON() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public boolean getActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return " id: " + this.id + "\n" + " direccion: " + direccion + "\n stock: " + stock + "\ncosteDia: " + costeDia
				+ "\n espacioAlmacenaje:" + espacioAlmacenaje + "\n activo: " + activo + "\n";
	}
}