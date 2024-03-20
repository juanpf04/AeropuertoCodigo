package integracion.modelo;

import negocio.modelo.TModelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
				return new TModelo(data.getInt("id"), data.getString("nombre"), data.getString("motor"),
						data.getBoolean("activo"));
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

	public boolean modificarModelo(TModelo tModelo) {
		try {
			FileWriter archivo = new FileWriter("recursos/modelo/" + tModelo.getId() + ".json");
			archivo.write(tModelo.toJSON().toString());
			archivo.close();

			return true;
		} catch (IOException e) {
		}
		return false;
	}

	public boolean bajaModelo(int id) {
		try {
			JSONObject data = new JSONObject(new JSONTokener(new FileReader("recursos/modelo/" + id + ".json")));

			data.put("activo", false);

			FileWriter archivo = new FileWriter("recursos/modelo/" + id + ".json");

			archivo.write(data.toString());
			archivo.close();

			return true;
		} catch (IOException e) {
		}
		return false;
	}

	public List<TModelo> consultarTodosModelos() {
		File carpeta = new File("recursos/modelo");
		File[] lista = carpeta.listFiles();

		List<TModelo> modelos = new ArrayList<>();

		for (File f : lista) {
			try {
				JSONObject data = new JSONObject(new JSONTokener(new FileReader(f)));
				modelos.add(new TModelo(data.getInt("id"), data.getString("nombre"), data.getString("motor"),
						data.getBoolean("activo")));
			} catch (FileNotFoundException e) {
			}
		}

		return modelos;
	}

	/** 
	* (non-Javadoc)
	* @see DAOModelo#vincularModelo(int idModelo, int idAerolinea)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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
			return new TModelo(data.getInt("id"), data.getString("nombre"), data.getString("motor"),
					data.getBoolean("activo"));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

}