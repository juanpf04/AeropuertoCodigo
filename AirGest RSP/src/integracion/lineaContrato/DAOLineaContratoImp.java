
package integracion.lineaContrato;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.JSONObject;

import integracion.Utilidades;
import negocio.lineaContrato.TLineaContrato;

public class DAOLineaContratoImp implements DAOLineaContrato{

	@Override
	public boolean altaLineaContrato(TLineaContrato tLineaContrato) {
		try {
			FileWriter archivo = new FileWriter(Utilidades.ruta("lineaContrato") + String.format("%05d", tLineaContrato.getIdContrato())
					+ "_" + String.format("%05d", tLineaContrato.getIdHangar()) + ".json");
			archivo.write(toJSON(tLineaContrato).toString());
			archivo.close();
			return true;
		} catch (IOException e) {

		}

		return false;
	}

	@Override
	public boolean bajaLineaContrato(int id_contrato, int id_hangar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarLineaContrato(int tLineaContrato) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TLineaContrato> leerLineasPorContrato(int id_contrato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TLineaContrato> leerLineasPorHangar(int id_hangar) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private JSONObject toJSON(TLineaContrato linea){
		JSONObject jo = new JSONObject();
		
		jo.put("id_contrato", linea.getIdContrato());
		jo.put("id_hangar", linea.getIdHangar());
		
		JSONObject fecha_ini = new JSONObject();
		fecha_ini.put("dia", linea.getFechaIni().getDayOfMonth());
		fecha_ini.put("mes", linea.getFechaIni().getMonthValue());
		fecha_ini.put("anyo", linea.getFechaIni().getYear());
		jo.put("fecha_ini", fecha_ini);
		
		JSONObject fecha_fin = new JSONObject();
		fecha_fin.put("dia", linea.getFechaFin().getDayOfMonth());
		fecha_fin.put("mes", linea.getFechaFin().getMonthValue());
		fecha_fin.put("anyo", linea.getFechaFin().getYear());
		jo.put("fecha_fin", fecha_fin);
		
		jo.put("precio", linea.getPrecio());
		jo.put("activo", linea.getActivo());
		
		
		return jo;
		
	}
}