

package negocio.avion;

import integracion.aerolinea.DAOAerolinea;
import integracion.factoria.FactoriaIntegracion;
import integracion.hangar.DAOHangar;
import integracion.modelo.DAOModelo;
import negocio.aerolinea.TAerolinea;
import negocio.hangar.THangar;
import negocio.modelo.TModelo;
import negocio.avion.TAComercial;
import negocio.avion.TAPrivado;


public class ValidadorAvion {
	
	public static boolean comprobarDatos(TAvion tAvion)
	{
		if(tAvion instanceof TAComercial)
			return comprobarComercial((TAComercial) tAvion);
		else
			return comprobarPrivado((TAPrivado) tAvion);
	}
	
	public static boolean comprobarComercial(TAComercial tComercial) {
		
		return comprobarInfo(tComercial) && comprobarTrabajadores(tComercial);

	}
	
	public static boolean comprobarPrivado(TAPrivado tPriv) {
		
		return comprobarInfo(tPriv) && comprobarCarnet(tPriv);
	}
	
	public static boolean comprobarInfo(TAvion tAvion) {
		return tAvion != null 
				&& comprobarAsientos(tAvion.getNumAsientos()) 
				//&& comprobarHangar(tAvion.getIdHangar()) 
				//&& comprobarAerolinea(tAvion.getIdAerolinea()) 
				&& comprobarModelo(tAvion.getIdModelo())
				&& comprobarMatricula(tAvion.getMatricula());

	}
	
	public static boolean comprobarCarnet(TAPrivado tPriv)
	{
		return tPriv.getIdCarnet() > 0;
	}
	
	public static boolean comprobarTrabajadores(TAComercial tComercial)
	{
		return tComercial.getTrabajadores() > 0;
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
		DAOAerolinea da = FactoriaIntegracion.getInstance().crearDAOAerolinea();
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