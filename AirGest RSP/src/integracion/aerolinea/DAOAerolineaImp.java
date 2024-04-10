/**
 * 
 */
package integracion.aerolinea;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import integracion.Utilidades;
import negocio.aerolinea.TAerolinea;

public class DAOAerolineaImp implements DAOAerolinea {

	public TAerolinea leerAerolineaPorId(int idAerolinea) {
		try {
			JSONObject data = new JSONObject(new JSONTokener(
					new FileReader(Utilidades.ruta("aerolinea") + String.format("%05d", idAerolinea) + ".json")));
			return new TAerolinea(data.getInt("id"), data.getString("nombre"), data.getBoolean("activo"));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	/** 
	* (non-Javadoc)
	* @see DAOAerolinea#leerAerolineaPorNombre(String nombre)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public TAerolinea leerAerolineaPorNombre(String nombre) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAerolinea#altaAerolinea(TAerolinea tAerolinea)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int altaAerolinea(TAerolinea tAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAerolinea#modificarAerolinea(TAerolinea tAerolinea)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean modificarAerolinea(TAerolinea tAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAerolinea#bajaAerolinea(int id)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean bajaAerolinea(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAerolinea#consultarTodasAerolineas()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List consultarTodasAerolineas() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}