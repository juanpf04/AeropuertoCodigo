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

import integracion.Utilidades;

public class DAOModeloImp implements DAOModelo {

	public TModelo leerModeloPorNombre(String nombre) {
		File carpeta = new File(Utilidades.ruta("modelo"));
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
		File carpeta = new File(Utilidades.ruta("modelo"));
		File[] lista = carpeta.listFiles();

		try {
			int id = lista.length + 1;

			tModelo.setId(id);

			FileWriter archivo = new FileWriter(Utilidades.ruta("modelo") + String.format("%05d", id) + ".json");

			archivo.write(tModelo.toJSON().toString());
			archivo.close();

			return id;

		} catch (IOException e) {
		}
		return -1;
	}

	public boolean modificarModelo(TModelo tModelo) {
		try {
			FileWriter archivo = new FileWriter(
					Utilidades.ruta("modelo") + String.format("%05d", tModelo.getId()) + ".json");
			archivo.write(tModelo.toJSON().toString());
			archivo.close();

			return true;
		} catch (IOException e) {
		}
		return false;
	}

	public boolean bajaModelo(int id) {
		try {
			JSONObject data = new JSONObject(
					new JSONTokener(new FileReader(Utilidades.ruta("modelo") + String.format("%05d", id) + ".json")));

			data.put("activo", false);

			FileWriter archivo = new FileWriter(Utilidades.ruta("modelo") + String.format("%05d", id) + ".json");

			archivo.write(data.toString());
			archivo.close();

			return true;
		} catch (IOException e) {
		}
		return false;
	}

	public List<TModelo> consultarTodosModelos() {
		File carpeta = new File(Utilidades.ruta("modelo"));
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

	public TModelo leerModeloPorId(int id) {
		try {
			JSONObject data = new JSONObject(
					new JSONTokener(new FileReader(Utilidades.ruta("modelo") + String.format("%05d", id) + ".json")));
			return new TModelo(data.getInt("id"), data.getString("nombre"), data.getString("motor"),
					data.getBoolean("activo"));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

}