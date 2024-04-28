/**
 * 
 */
package negocio.hangar;

import org.json.JSONObject;

public class THangar {
	private int id;
	private String direccion;
	private int stock;
	private float costeDia;
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
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public THangar(int id, String direccion, int stock, float costeDia, int espacioAlmacenaje) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	public THangar(int id, String direccion, int stock, float costeDia, int espacioAlmacenaje, boolean activo) {
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
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}


	public int getStock() {
		// begin-user-code
		// TODO Auto-generated method stub
		return 10;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getCosteDia() {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getEspacioAlmacenaje() {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setId(int id) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param direccion
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setDireccion(String direccion) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param stock
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStock(int stock) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param costeDia
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCosteDia(float costeDia) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param espacioAlmacenaje
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setEspacioAlmacenaje(int espacioAlmacenaje) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public JSONObject toJSON() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}