/**
 * 
 */
package integracion.aerolinea;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import integracion.Utilidades;
import negocio.aerolinea.TAerolinea;

public class DAOAerolineaImp implements DAOAerolinea {

	public TAerolinea leerAerolineaPorId(int idAerolinea) {
		try {
			JSONObject data = new JSONObject(new JSONTokener(
					new FileReader(Utilidades.ruta("aerolinea") + String.format("%05d", idAerolinea) + ".json")));
			return new TAerolinea(data.getInt("id"), data.getString("nombre"), data.getBoolean("activo"));
		} catch (FileNotFoundException e) {
			return null;
		}
	}
}