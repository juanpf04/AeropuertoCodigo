package integracion.personal;

import negocio.personal.TPLimpieza;
import negocio.personal.TPSeguridad;
import negocio.personal.TPersonal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

import integracion.Utilidades;

import java.util.ArrayList;
import java.util.List;

public class DAOPersonalImp implements DAOPersonal {

	private TPersonal leerFichero(File file) {
		TPersonal transfer;
		try {
			JSONObject data = new JSONObject(new JSONTokener(new FileReader(file)));

			if (data.has("rol")) {
				transfer = new TPLimpieza(data.getInt("id"), data.getInt("idEmpleado"), data.getString("areaAsignada"),
						data.getBoolean("activo"), data.getString("rol"));
			} else {
				transfer = new TPSeguridad(data.getInt("id"), data.getInt("idEmpleado"), data.getString("areaAsignada"),
						data.getBoolean("activo"), data.getInt("numPlaca"));
			}

		} catch (FileNotFoundException e) {
			transfer = null;
		}
		return transfer;
	}

	private boolean escribirFichero(TPersonal tPersonal) {
		boolean exito = true;

		try {
			FileWriter archivo = new FileWriter(
					Utilidades.ruta("personal") + String.format("%05d", tPersonal.getId()) + ".json");

			JSONObject data = new JSONObject();

			data.put("id", tPersonal.getId());
			data.put("idEmpleado", tPersonal.getIdEmpleado());
			data.put("areaAsignada", tPersonal.getAreaAsignada());
			data.put("activo", tPersonal.getActivo());

			if (tPersonal instanceof TPSeguridad)
				data.put("numPlaca", ((TPSeguridad) tPersonal).getNumPlaca());
			else
				data.put("rol", ((TPLimpieza) tPersonal).getRol());

			archivo.write(data.toString());
			archivo.close();

		} catch (IOException e) {
			exito = false;
		}

		return exito;
	}

	@Override
	public int AltaPersonal(TPersonal tPersonal) {
		File carpeta = new File(Utilidades.ruta("personal"));
		File[] lista = carpeta.listFiles();
		int id = lista.length + 1;

		tPersonal.setId(id);

		if (!this.escribirFichero(tPersonal))
			id = -1;

		return id;
	}

	@Override
	public boolean BajaPersonal(int id) {
		TPersonal transfer = this.leerFichero(new File(Utilidades.ruta("personal") + String.format("%05d", id) + ".json"));
		if(transfer == null)
			return false;
		transfer.setActivo(false);
		
		return this.escribirFichero(transfer);
	}

	@Override
	public boolean ModificarPersonal(TPersonal tPersonal) {
		return escribirFichero(tPersonal);
	}

	@Override
	public TPersonal ConsultarPersonalPorId(int id) {
		return this.leerFichero(new File(Utilidades.ruta("personal") + String.format("%05d", id) + ".json"));
	}
	
	@Override
	public TPersonal ConsultarPersonalPorIdEmpleado(int idEmpleado) {
		File carpeta = new File(Utilidades.ruta("personal"));
		File[] lista = carpeta.listFiles();
		
		int i = 0;
		TPersonal transfer = null;
		while(i<lista.length && transfer == null) {
			transfer = leerFichero(lista[i]);
			if(transfer.getIdEmpleado() != idEmpleado)
				transfer = null;
			i++;
		}
		
		return transfer;
	}

	@Override
	public List<TPersonal> ConsultarPersonalExistente() {
		List<TPersonal> personal = new ArrayList<>();
		
		File carpeta = new File(Utilidades.ruta("personal"));
		File[] lista = carpeta.listFiles();
		
		for(File f: lista)
			personal.add(this.leerFichero(f));
		
		return personal;
	}
}