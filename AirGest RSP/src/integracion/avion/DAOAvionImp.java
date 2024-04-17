package integracion.avion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONTokener;

import integracion.Utilidades;
import negocio.avion.TAvion;

public class DAOAvionImp implements DAOAvion {

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tAvion
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private JSONObject write(TAvion tAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param data
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private TAvion read(JSONObject data) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#mostrarAvionesPorModelo(int idModelo)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List mostrarAvionesPorModelo(int idModelo) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public List<TAvion> consultarAvionesPorModelo(int idModelo) {
		File carpeta = new File(Utilidades.ruta("avion"));
		File[] lista = carpeta.listFiles();

		List<TAvion> aviones = new ArrayList<>();

		for (File f : lista) {
			try {
				JSONObject data = new JSONObject(new JSONTokener(new FileReader(f)));
				if (data.getInt("idModelo") == idModelo) {

					JSONObject jo = data.getJSONObject("fechaFabricacion");

					LocalDate fecha = LocalDate.of(jo.getInt("anyo"), jo.getInt("mes"), jo.getInt("dia"));

					aviones.add(new TAvion(data.getInt("id"), data.getInt("numAsientos"), fecha,
							data.getString("nombre"), data.getString("matricula"), data.getBoolean("activo"),
							data.getInt("idAerolinea"), data.getInt("idModelo"), data.getInt("idHangar")));
				}
			} catch (FileNotFoundException e) {

			}
		}

		return aviones;
	}

	public List<TAvion> consultarAvionesActivosPorModelo(int idModelo) {
		File carpeta = new File(Utilidades.ruta("avion"));
		File[] lista = carpeta.listFiles();

		List<TAvion> aviones = new ArrayList<>();

		for (File f : lista) {
			try {
				JSONObject data = new JSONObject(new JSONTokener(new FileReader(f)));
				if (data.getInt("idModelo") == idModelo && data.getBoolean("activo")) {

					JSONObject jo = data.getJSONObject("fechaFabricacion");

					LocalDate fecha = LocalDate.of(jo.getInt("anyo"), jo.getInt("mes"), jo.getInt("dia"));

					aviones.add(new TAvion(data.getInt("id"), data.getInt("numAsientos"), fecha,
							data.getString("nombre"), data.getString("matricula"), data.getBoolean("activo"),
							data.getInt("idAerolinea"), data.getInt("idModelo"), data.getInt("idHangar")));
				}
			} catch (FileNotFoundException e) {

			}
		}

		return aviones;
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#altaAvion(TAvion tAvion)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int altaAvion(TAvion tAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#bajaAvion(int idAvion)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean bajaAvion(int idAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#consultarAvionPorId(int idAvion)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public TAvion consultarAvionPorId(int idAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#consultarTodosAviones()
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Object consultarTodosAviones() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#modificarAvion(TAvion tAvion)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean modificarAvion(TAvion tAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#mostrarAvionesPorAerolinea(int idAerolinea)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List mostrarAvionesPorAerolinea(int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#mostrarAvionesPorHangar(int idHangar)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List mostrarAvionesPorHangar(int idHangar) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#consultarAvionesActivosPorAerolinea(int idAerolinea)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void consultarAvionesActivosPorAerolinea(int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see DAOAvion#consultarAvionesActivosPorHangar(int idHangar)
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void consultarAvionesActivosPorHangar(int idHangar) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}