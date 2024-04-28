package negocio.avion;

import integracion.aerolinea.DAOAerolinea;
import integracion.factoria.FactoriaIntegracion;
import integracion.hangar.DAOHangar;
import integracion.modelo.DAOModelo;
import negocio.aerolinea.TAerolinea;
import negocio.hangar.THangar;
import negocio.modelo.TModelo;

public class ValidadorAvion {

	public static boolean comprobarDatos(TAvion tAvion) {
		
		return tAvion != null 
				&& comprobarAsientos(tAvion.getNumAsientos()) 
				//&& comprobarHangar(tAvion.getIdHangar()) 
				//&& comprobarAerolinea(tAvion.getIdAerolinea()) 
				&& comprobarModelo(tAvion.getIdModelo())
				&& comprobarMatricula(tAvion.getMatricula());
	}

	public static boolean comprobarId(int idAvion) {
		return idAvion > 0;
	}
	public static boolean comprobarAsientos(int asientos) {
		return asientos > 0;
	}
	
	public static boolean comprobarHangar(int idHangar)
	{
		DAOHangar dh = FactoriaIntegracion.getInstance().crearDAOHangar();
		THangar hangar = dh.leerHangarPorId(idHangar);
		return hangar != null;
	}
	
	public static boolean comprobarAerolinea(int idAerolinea)
	{
		DAOAerolinea da = FactoriaIntegracion.getInstance().crearDAOAeolinea();
		TAerolinea aerolinea = da.leerAerolineaPorId(idAerolinea);
		return aerolinea != null;
	}
	
	public static boolean comprobarModelo(int idModelo)
	{
		DAOModelo dm = FactoriaIntegracion.getInstance().crearDAOModelo();
		TModelo modelo = dm.leerModeloPorId(idModelo);
		return modelo != null;
	}
	
	
	public static boolean comprobarMatricula(String matricula) {
		return matricula.matches("^EC-[A-Za-z0-9]+$"); // matriculas españolas: EC-(caracteres alfanumericos)
	}
}