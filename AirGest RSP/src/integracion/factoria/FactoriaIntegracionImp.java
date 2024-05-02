
package integracion.factoria;

import integracion.aerolinea.DAOAerolinea;
import integracion.aerolinea.DAOAerolineaImp;
import integracion.avion.DAOAvion;
import integracion.avion.DAOAvionImp;
import integracion.hangar.DAOHangar;
import integracion.hangar.DAOHangarImp;
import integracion.lineaContrato.DAOLineaContrato;
import integracion.lineaContrato.DAOLineaContratoImp;
import integracion.contrato.DAOContrato;
import integracion.contrato.DAOContratoImp;
import integracion.modelo.DAOModelo;
import integracion.modelo.DAOModeloImp;
import integracion.modeloAerolinea.DAOModeloAerolinea;
import integracion.modeloAerolinea.DAOModeloAerolineaImp;
import integracion.personal.DAOPersonal;
import integracion.personal.DAOPersonalImp;
import integracion.personalHangar.DAOPersonalHangar;
import integracion.personalHangar.DAOPersonalHangarImp;

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

	@Override
	public DAOHangar crearDAOHangar() {
		return new DAOHangarImp();
	}

	public DAOContrato crearDAOContrato() {
		return new DAOContratoImp();
	}

	public DAOPersonal crearDAOPersonal() {
		return new DAOPersonalImp();
	}
	
	public DAOPersonalHangar crearDAOPersonalHangar() {
		return new DAOPersonalHangarImp();
	}

	public DAOLineaContrato crearDAOLineaContrato() {
		return new DAOLineaContratoImp();
	}
}