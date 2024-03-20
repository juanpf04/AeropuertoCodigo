package integracion.factoria;

import integracion.modelo.DAOModelo;
import integracion.avion.DAOAvion;
import integracion.aerolinea.DAOAerolinea;

public abstract class FactoriaIntegracion {

	private static FactoriaIntegracion instancia;

	public static FactoriaIntegracion getInstance() {
		if (instancia == null)
			instancia = new FactoriaIntegracionImp();
		return instancia;
	}

	public abstract DAOModelo crearDAOModelo();

	public abstract DAOAvion crearDAOAvion();

	public abstract DAOAerolinea crearDAOAeolinea();
}