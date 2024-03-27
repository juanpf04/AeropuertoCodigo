
package integracion.modeloAerolinea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import miscelanea.Utilidades;
import negocio.modeloAerolinea.TModeloAerolinea;

public class DAOModeloAerolineaImp implements DAOModeloAerolinea {

	public boolean vincular(int idModelo, int idAerolinea) {
		try {
			TModeloAerolinea tma = new TModeloAerolinea(idModelo, idAerolinea);
			FileWriter archivo = new FileWriter(
					Utilidades.ruta("modeloAerolinea") + idModelo + "_" + idAerolinea + ".json");
			archivo.write(tma.toJSON().toString());
			archivo.close();
			return true;
		} catch (IOException e) {

		}

		return false;
	}

	public boolean desvincular(int idModelo, int idAerolinea) {
		File f = new File(Utilidades.ruta("modeloAerolinea") + idModelo + "_" + idAerolinea + ".json");
		
		if (f.exists()) {
			return f.delete();
		}
		
		return false;
	}

	public boolean comprobarVinculacion(int idModelo, int idAerolinea) {
		File f = new File(Utilidades.ruta("modeloAerolinea") + idModelo + "_" + idAerolinea + ".json");
		
		return f.exists();
	}
}