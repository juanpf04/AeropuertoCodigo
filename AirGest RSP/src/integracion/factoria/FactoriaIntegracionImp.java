package integracion.factoria;

import integracion.aerolinea.DAOAerolinea;
import integracion.aerolinea.DAOAerolineaImp;
import integracion.avion.DAOAvion;
import integracion.avion.DAOAvionImp;
import integracion.hangar.DAOHangar;
import integracion.hangar.DAOHangarImp;
import integracion.modelo.DAOModelo;
import integracion.modelo.DAOModeloImp;
import integracion.modeloAerolinea.DAOModeloAerolinea;
import integracion.modeloAerolinea.DAOModeloAerolineaImp;

public class FactoriaIntegracionImp extends FactoriaIntegracion {

	public DAOModelo crearDAOModelo() {
		return new DAOModeloImp();
	}

	public DAOAvion crearDAOAvion() {
		return new DAOAvionImp();
	}

	public DAOAerolinea crearDAOAeolinea() {
		return new DAOAerolineaImp();
	}

	public DAOModeloAerolinea crearDAOModeloAerolinea() {
		return new DAOModeloAerolineaImp();
	}

	@Override
	public DAOHangar crearDAOHangar() {
		return new DAOHangarImp();
	}
}