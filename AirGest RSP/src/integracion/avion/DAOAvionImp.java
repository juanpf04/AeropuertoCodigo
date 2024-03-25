/**
 * 
 */
package integracion.avion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONTokener;

import negocio.avion.TAvion;

public class DAOAvionImp implements DAOAvion {

	public List<TAvion> consultarAvionesPorModelo(int idModelo) {
		File carpeta = new File("recursos/avion");
		File[] lista = carpeta.listFiles();

		List<TAvion> aviones = new ArrayList<>();

		for (File f : lista) {
			try {
				JSONObject data = new JSONObject(new JSONTokener(new FileReader(f)));
				if (data.getInt("idModelo") == idModelo) {
					aviones.add(new TAvion(data.getInt("id"), data.getInt("numAsientos"), null,
							data.getString("nombre"), data.getString("matricula"), data.getBoolean("activo"),
							data.getInt("idAerolinea"), data.getInt("idModelo"), data.getInt("idHangar")));
				}
			} catch (FileNotFoundException e) {

			}
		}

		return aviones;
	}

	public List<TAvion> consultarAvionesActivosPorModelo(int idModelo) {
		File carpeta = new File("recursos/avion");
		File[] lista = carpeta.listFiles();

		List<TAvion> aviones = new ArrayList<>();

		for (File f : lista) {
			try {
				JSONObject data = new JSONObject(new JSONTokener(new FileReader(f)));
				if (data.getInt("idModelo") == idModelo && data.getBoolean("activo")) {
					aviones.add(new TAvion(data.getInt("id"), data.getInt("numAsientos"), null,
							data.getString("nombre"), data.getString("matricula"), data.getBoolean("activo"),
							data.getInt("idAerolinea"), data.getInt("idModelo"), data.getInt("idHangar")));
				}
			} catch (FileNotFoundException e) {

			}
		}

		return aviones;
	}
}