package integracion.modelo;

import negocio.modelo.TModelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class DAOModeloImp implements DAOModelo {

	public TModelo leerModeloPorNombre(String nombre) {
		File carpeta = new File("recursos/modelo");
		File[] lista = carpeta.listFiles();

		int i = 0;
		while (i < lista.length) {
			JSONObject data = new JSONObject();
			try {
				data = new JSONObject(new JSONTokener(new FileReader(lista[i])));
			} catch (FileNotFoundException e) {
			}

			if (data.getString("nombre").equals(nombre)) {
				return new TModelo(data.getInt("id"), data.getBoolean("activo"), data.getString("nombre"),
						data.getString("motor"));
			}

			i++;
		}

		return null;
	}

	public int altaModelo(TModelo tModelo) {
		File carpeta = new File("recursos/modelo");
		File[] lista = carpeta.listFiles();

		try {
			int id = 1;
			if (lista.length != 0) {
				JSONObject data = new JSONObject(new JSONTokener(new FileReader(lista[lista.length - 1])));
				id = data.getInt("id") + 1;
			}
			
			tModelo.setId(id);

			FileWriter archivo = new FileWriter("recursos/modelo/" + id + ".json");

			archivo.write(tModelo.toJSON().toString());
			archivo.close();

			return id;

		} catch (IOException e) {
		}
		return -1;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see DAOModelo#modificarModelo(TModelo tModelo)
	 * @generated "UML to Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean modificarModelo(TModelo tModelo) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see DAOModelo#bajaModelo(int id)
	 * @generated "UML to Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean bajaModelo(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see DAOModelo#consultarTodosModelos()
	 * @generated "UML to Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List consultarTodosModelos() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see DAOModelo#vincularModelo(int idModelo, int idAerolinea)
	 * @generated "UML to Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean vincularModelo(int idModelo, int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see DAOModelo#desvincularModelo(int idModelo, int idAerolinea)
	 * @generated "UML to Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean desvincularModelo(int idModelo, int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	public TModelo leerModeloPorId(int id) {
		try {
			JSONObject data = new JSONObject(new JSONTokener(new FileReader("recursos/modelo/" + id + ".json")));
			return new TModelo(data.getInt("id"), data.getBoolean("activo"), data.getString("nombre"),
					data.getString("motor"));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

}