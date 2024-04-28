
package negocio.contrato;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;

import integracion.aerolinea.DAOAerolinea;
import integracion.contrato.DAOContrato;
import integracion.factoria.FactoriaIntegracion;
import integracion.hangar.DAOHangar;
import integracion.lineaContrato.DAOLineaContrato;
import negocio.aerolinea.TAerolinea;
import negocio.hangar.THangar;
import negocio.lineaContrato.TLineaContrato;

public class SAContratoImp implements SAContrato {
	
	public TCarrito abrirContrato(int id_aerolinea) {
		return new TCarrito(id_aerolinea);
	}

	public int cerrarContrato(TCarrito tCarrito) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	public TInfoContrato consultarContratoPorId(int id) {
		if (ValidadorContrato.comprobarId(id)) {
			DAOContrato dc = FactoriaIntegracion.getInstance().crearDAOContrato();
			
			TContrato contrato = dc.leerContratoPorId(id);
			
			if (contrato != null) {
				DAOAerolinea da = FactoriaIntegracion.getInstance().crearDAOAerolinea();
				TAerolinea aerolinea = da.leerAerolineaPorId(contrato.getIdAerolinea());
				
				DAOLineaContrato dl = FactoriaIntegracion.getInstance().crearDAOLineaContrato();
				List<TLineaContrato> lineas = dl.leerLineasPorContrato(id);
				
				DAOHangar dh = FactoriaIntegracion.getInstance().crearDAOHangar();
				HashMap<Integer, THangar> hangares = new HashMap<>();
				
				for(TLineaContrato linea : lineas) {
					THangar hangar = dh.leerHangarPorId(linea.getIdHangar());
					hangares.put(hangar.getId(), hangar);
				}
				
				TInfoContrato info = new TInfoContrato(contrato, aerolinea, lineas, hangares);
				return info;
			}
		}
		
		return null;
	}

	public List<TContrato> consultarTodosContratos() {
		DAOContrato dc = FactoriaIntegracion.getInstance().crearDAOContrato();
		return dc.leerTodosContratos();
	}

	public boolean modificarContrato(TContrato tContrato) {
		if (ValidadorContrato.comprobarDatos(tContrato)){
			DAOContrato dc = FactoriaIntegracion.getInstance().crearDAOContrato();
			
			int id = tContrato.getId();
			
			TContrato leido = dc.leerContratoPorId(id);
			
			if (leido != null){
				DAOAerolinea da = FactoriaIntegracion.getInstance().crearDAOAerolinea();
				TAerolinea aerolinea = da.leerAerolineaPorId(tContrato.getIdAerolinea());
				if (aerolinea != null && aerolinea.getActivo()){
					return dc.modificarContrato(tContrato);
				}
			}
		}
		
		return false;
	}

	public boolean modificarLineaContrato(TLineaContrato linea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	public List<TContrato> consultarContratosPorAerolinea(int id_aerolinea) {
		DAOContrato dc = FactoriaIntegracion.getInstance().crearDAOContrato();
		return dc.leerContratosPorAerolinea(id_aerolinea);
	}
}