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

			if (leido == null)
				return da.altaAvion(tAvion);
			else if (!leido.getActivo()) {
				tAvion.setId(leido.getId());
				da.modificarAvion(tAvion);
				return tAvion.getId();
			}
		}

		return -1;
	}

	public boolean bajaAvion(int idAvion) {
		return false;
	}

	public TAvion consultarAvionPorId(int idAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public List<TAvion> consultarTodosAviones() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public boolean modificarAvion(TAvion tAvion) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
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