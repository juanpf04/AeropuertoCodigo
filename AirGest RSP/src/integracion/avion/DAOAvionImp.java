package integracion.avion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONTokener;

import miscelanea.Utilidades;
import negocio.avion.TAvion;

public class DAOAvionImp implements DAOAvion {

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
}