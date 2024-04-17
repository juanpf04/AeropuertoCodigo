package negocio.avion;

import java.util.List;

import integracion.avion.DAOAvion;
import integracion.factoria.FactoriaIntegracion;
import integracion.modelo.DAOModelo;
import negocio.modelo.TModelo;
import negocio.modelo.ValidadorModelo;

public class SAAvionImp implements SAAvion {

	public int altaAvion(TAvion tAvion) {
		if (ValidadorAvion.comprobarDatos(tAvion)) {
			DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();
			TAvion leido = da.consultarAvionPorNombre(tAvion.getNombre());
			
			if (leido == null) {
				//CREAR DAOHANGAR, LEER HANGAR POR ID Y ACTUALIZAR STOCK Y LE METES SI QUIERES HACER ++ O --
				return da.altaAvion(tAvion);
			}
			else if (!leido.getActivo()) { 
				//CREAR DAOHANGAR, LEER HANGAR POR ID Y ACTUALIZAR STOCK Y LE METES SI QUIERES HACER ++ O --
				tAvion.setId(leido.getId());
				da.modificarAvion(tAvion);
				return tAvion.getId();
			}
		}

		return -1;
	}

	public boolean bajaAvion(int idAvion) {
		if (ValidadorAvion.comprobarId(idAvion)) {
			DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();

			TAvion leido = da.consultarAvionPorId(idAvion);

			if (leido != null && leido.getActivo()) {
				//CREAR DAOHANGAR, LEER HANGAR POR ID Y ACTUALIZAR STOCK Y LE METES SI QUIERES HACER ++ O --
				return da.bajaAvion(idAvion);
			}
		}

		return false;
	}

	public TAvion consultarAvionPorId(int idAvion) {
		if (ValidadorAvion.comprobarId(idAvion)) {
			DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();

			return da.consultarAvionPorId(idAvion);
		}

		return null;
	}

	public List<TAvion> consultarTodosAviones() {
		DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();
		return da.consultarTodosAviones();
	}

	public boolean modificarAvion(TAvion tAvion) {//TODO HACER
		if (ValidadorModelo.comprobarId(tModelo.getId()) && ValidadorModelo.comprobarDatos(tModelo)) {
			DAOModelo dm = FactoriaIntegracion.getInstance().crearDAOModelo();

			int id = tModelo.getId();
			String nombre = tModelo.getNombre();

			TModelo leido = dm.leerModeloPorId(id);

			if (leido != null) {
				if (leido.getActivo() && (leido.getNombre().equals(nombre) || dm.leerModeloPorNombre(nombre) == null)) {
					return dm.modificarModelo(tModelo);
				}
			}
		}
		return false;
	}

	public List<TAvion> mostrarAvionesPorModelo(int idModelo) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public List<TAvion> mostrarAvionesPorAerolinea(int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public List<TAvion> mostrarAvionesPorHangar(int idHangar) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}