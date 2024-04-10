package integracion.avion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONTokener;

import integracion.Utilidades;
import negocio.avion.TAComercial;
import negocio.avion.TAPrivado;
import negocio.avion.TAvion;
import negocio.modelo.TModelo;

public class DAOAvionImp implements DAOAvion {

	private JSONObject toJSON(TAvion tAvion) {
		JSONObject jo = new JSONObject();

		JSONObject fecha = new JSONObject();
		fecha.put("dia", tAvion.getFechaFabricacion().getDayOfMonth());
		fecha.put("mes", tAvion.getFechaFabricacion().getMonthValue());
		fecha.put("anyo", tAvion.getFechaFabricacion().getYear());

		jo.put("id", tAvion.getId());
		jo.put("numAsientos", tAvion.getNumAsientos());
		jo.put("fechaFabricacion", fecha);
		jo.put("nombre", tAvion.getNombre());
		jo.put("matricula", tAvion.getMatricula());
		jo.put("activo", tAvion.getActivo());
		jo.put("idModelo", tAvion.getIdModelo());
		jo.put("idAerolinea", tAvion.getIdAerolinea());
		jo.put("idHangar", tAvion.getIdHangar());

		return jo;
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

	@Override
	public int altaAvion(TAvion tAvion) {
		File carpeta = new File(Utilidades.ruta("avion"));
		File[] lista = carpeta.listFiles();

		try {
			int id = lista.length + 1;

			tAvion.setId(id);

			FileWriter archivo = new FileWriter(Utilidades.ruta("avion") + String.format("%05d", id) + ".json");

			archivo.write(toJSON(tAvion).toString());
			archivo.close();

			return id;

		} catch (IOException e) {
		}
		return -1;
	}

	@Override
	public boolean bajaAvion(int id) {
		try {
			JSONObject data = new JSONObject(
					new JSONTokener(new FileReader(Utilidades.ruta("avion") + String.format("%05d", id) + ".json")));

			data.put("activo", false);

			FileWriter archivo = new FileWriter(Utilidades.ruta("avion") + String.format("%05d", id) + ".json");

			archivo.write(data.toString());
			archivo.close();

			return true;
		} catch (IOException e) {
		}
		return false;
	}

	@Override
	public TAvion consultarAvionPorId(int id) {
		try {
			JSONObject data = new JSONObject(
					new JSONTokener(new FileReader(Utilidades.ruta("avion") + String.format("%05d", id) + ".json")));

			TAvion avion;
			
			JSONObject jo = data.getJSONObject("fechaFabricacion");

			LocalDate fecha = LocalDate.of(jo.getInt("anyo"), jo.getInt("mes"), jo.getInt("dia"));
			
			if (data.has("dueño")) 
				avion = new TAPrivado(data.getInt("id"), data.getInt("asientos"), fecha, data.getString("nombre"), data.getString("matricula"), data.getBoolean("activo"),
						data.getInt("idAerolinea"), data.getInt("idModelo"), data.getInt("idHangar"), data.getString("dueño"), data.getInt("carnet"));
			else
				avion = new TAComercial(data.getInt("id"), data.getInt("asientos"), fecha, data.getString("nombre"), data.getString("matricula"), data.getBoolean("activo"),
						data.getInt("idAerolinea"), data.getInt("idModelo"), data.getInt("idHangar"), data.getInt("trabajadores"));

			return avion;
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	@Override
	public List<TAvion> consultarTodosAviones() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	@Override
	public boolean modificarAvion(TAvion tAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	@Override
	public List<TAvion> consultarAvionesPorAerolinea(int idAerolinea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TAvion> consultarAvionesPorHangar(int idHangar) {
		// TODO Auto-generated method stub
		return null;
	}
}