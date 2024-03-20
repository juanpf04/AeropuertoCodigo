package negocio.modelo;

import java.util.List;

import integracion.factoria.FactoriaIntegracion;
import integracion.modelo.DAOModelo;

public class SAModeloImp implements SAModelo {

	public int altaModelo(TModelo tModelo) {
		if (ValidadorModelo.comprobarDatosModelo(tModelo)) {
			DAOModelo dm = FactoriaIntegracion.getInstance().crearDAOModelo();
			TModelo leido = dm.leerModeloPorNombre(tModelo.getNombre());

			if (leido == null)
				return dm.altaModelo(tModelo);
			else if (!leido.getActivo()) {
				tModelo.setId(leido.getId());
				dm.modificarModelo(tModelo);
				return tModelo.getId();
			}
		}

		return -1;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see SAModelo#bajaModelo(int id)
	 * @generated "UML a Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean bajaModelo(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	public TModelo consultarModelo(int id) {
		if (ValidadorModelo.comprobarId(id)) {
			DAOModelo dm = FactoriaIntegracion.getInstance().crearDAOModelo();

			return dm.leerModeloPorId(id);
		}

		return null;
	}

	public List<TModelo> consultarTodosModelos() {
		DAOModelo dm = FactoriaIntegracion.getInstance().crearDAOModelo();
		return dm.consultarTodosModelos();
	}

	public boolean modificarModelo(TModelo tModelo) {
		if (ValidadorModelo.comprobarDatosModelo(tModelo)) {
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

	/**
	 * (non-Javadoc)
	 * 
	 * @see SAModelo#vincularModelo(int idModelo, int idAerolinea)
	 * @generated "UML a Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean vincularModelo(int idModelo, int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see SAModelo#desvincularModelo(int idModelo, int idAerolinea)
	 * @generated "UML a Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean desvincularModelo(int idModelo, int idAerolinea) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}
}