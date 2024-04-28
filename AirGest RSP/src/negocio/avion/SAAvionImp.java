package negocio.avion;

import java.util.List;

import integracion.avion.DAOAvion;
import integracion.factoria.FactoriaIntegracion;
import integracion.hangar.DAOHangar;


public class SAAvionImp implements SAAvion {

	public int altaAvion(TAvion tAvion) {
		if (ValidadorAvion.comprobarDatos(tAvion)) {
			DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();
			TAvion leido = da.consultarAvionPorNombre(tAvion.getNombre());
			DAOHangar dh = FactoriaIntegracion.getInstance().crearDAOHangar();
			int idHangarNuevo = tAvion.getIdHangar();
			//int nuevo_stock = dh.leerHangarPorId(idHangarNuevo).getStock() - 1;
			
			if (leido == null /*&& nuevo_stock >= 0*/) {
				// CREAR DAOHANGAR, LEER HANGAR POR ID Y ACTUALIZAR STOCK Y LE
				// METES SI QUIERES HACER ++ O --
				//dh.actualizarStock(idHangarNuevo, nuevo_stock);
				return da.altaAvion(tAvion);
			} else if (!leido.getActivo() /*&& nuevo_stock >= 0*/) {
				// CREAR DAOHANGAR, LEER HANGAR POR ID Y ACTUALIZAR STOCK Y LE
				// METES SI QUIERES HACER ++ O --
				//dh.actualizarStock(idHangarNuevo, nuevo_stock);
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
				// CREAR DAOHANGAR, LEER HANGAR POR ID Y ACTUALIZAR STOCK Y LE
				// METES SI QUIERES HACER ++ O --
				DAOHangar dh = FactoriaIntegracion.getInstance().crearDAOHangar();
				//dh.actualizarStock(leido.getIdHangar(), dh.leerHangarPorId(leido.getIdHangar()).getStock() + 1);
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

	public boolean modificarAvion(TAvion tAvion) {
		if (ValidadorAvion.comprobarId(tAvion.getId()) && ValidadorAvion.comprobarDatos(tAvion)) {
			DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();
			int id = tAvion.getId();
			String nombre = tAvion.getNombre();
			DAOHangar dh =  FactoriaIntegracion.getInstance().crearDAOHangar();

			TAvion leido = da.consultarAvionPorId(id);
			//int nuevo_stock = dh.leerHangarPorId(tAvion.getIdHangar()).getStock() - 1;
			if (leido != null) {
				if (leido.getActivo()
						&& (leido.getNombre().equals(nombre) || da.consultarAvionPorNombre(nombre) == null) /*&& nuevo_stock >= 0*/) {
					//dh.actualizarStock(leido.getIdHangar(), dh.leerHangarPorId(leido.getIdHangar()).getStock() + 1);
					//dh.actualizarStock(tAvion.getIdHangar(), nuevo_stock);
					return da.modificarAvion(tAvion);
				}
			}
		}
		return false;
	}

	public List<TAvion> mostrarAvionesPorModelo(int idModelo) {
		DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();
		return da.consultarAvionesPorModelo(idModelo);
	}

	public List<TAvion> mostrarAvionesPorAerolinea(int idAerolinea) {
		DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();
		return da.consultarAvionesPorAerolinea(idAerolinea);
	}

	public List<TAvion> mostrarAvionesPorHangar(int idHangar) {
		DAOAvion da = FactoriaIntegracion.getInstance().crearDAOAvion();
		return da.consultarAvionesPorHangar(idHangar);
	}
}