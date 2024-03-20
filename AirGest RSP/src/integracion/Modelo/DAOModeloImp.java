/**
 * 
 */
package integracion.Modelo;

import negocio.Modelo.TModelo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONTokener;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOModeloImp implements DAOModelo {
	/** 
	* (non-Javadoc)
	* @see DAOModelo#leerModeloPorNombre(String nombre)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public TModelo leerModeloPorNombre(String nombre) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOModelo#altaModelo(TModelo tModelo)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int altaModelo(TModelo tModelo) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOModelo#modificarModelo(TModelo tModelo)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean modificarModelo(TModelo tModelo) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOModelo#bajaModelo(int id)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean bajaModelo(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOModelo#consultarTodosModelos()
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List consultarTodosModelos() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOModelo#vincularModelo(int idModelo, int idAerolinea)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean vincularModelo(int idModelo, int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOModelo#desvincularModelo(int idModelo, int idAerolinea)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean desvincularModelo(int idModelo, int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	public TModelo leerModeloPorId(int id) {

		JSONObject data = new JSONObject();

		try {
			data = new JSONObject(new JSONTokener(new FileReader("recursos/modelo/" + id + ".json")));
		} catch (FileNotFoundException e) {

			return null;
		}

		TModelo modelo = new TModelo();

		modelo.setId(id);
		modelo.setActivo(data.getBoolean("activo"));
		modelo.setNombre(data.getString("nombre"));
		modelo.setMotor(data.getString("motor"));

		return modelo;
	}
}