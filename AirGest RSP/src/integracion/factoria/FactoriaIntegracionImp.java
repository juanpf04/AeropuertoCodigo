package integracion.factoria;

import integracion.aerolinea.DAOAerolinea;
import integracion.aerolinea.DAOAerolineaImp;
import integracion.avion.DAOAvion;
import integracion.avion.DAOAvionImp;
import integracion.contrato.DAOContrato;
import integracion.contrato.DAOContratoImp;
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

	public DAOAerolinea crearDAOAerolinea() {
		return new DAOAerolineaImp();
	}

	public DAOModeloAerolinea crearDAOModeloAerolinea() {
		return new DAOModeloAerolineaImp();
	}

	public DAOContrato crearDAOContrato() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}