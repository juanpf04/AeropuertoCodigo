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

	public int AltaPersonal(TPersonal tPersonal) {
		File carpeta = new File(Utilidades.ruta("personal"));
		File[] lista = carpeta.listFiles();

		int id = lista.length + 1;

		tPersonal.setId(id);

		if (!this.escribirFichero(tPersonal))
			id = -1;

		return id;
	}

	public boolean BajaPersonal(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	public boolean ModificarPersonal(TPersonal tPersonal) {
		return escribirFichero(tPersonal);
	}

	public TPersonal ConsultarPersonalPorId(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public List<TPersonal> ConsultarPersonalExistente() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}