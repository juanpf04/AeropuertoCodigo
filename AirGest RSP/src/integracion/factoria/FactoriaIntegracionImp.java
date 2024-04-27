package integracion.factoria;

import integracion.aerolinea.DAOAerolinea;
import integracion.aerolinea.DAOAerolineaImp;
import integracion.avion.DAOAvion;
import integracion.avion.DAOAvionImp;
import integracion.hangar.DAOHangar;
import integracion.hangar.DAOHangarImp;
import integracion.contrato.DAOContrato;
import integracion.modelo.DAOModelo;
import integracion.modelo.DAOModeloImp;
import integracion.modeloAerolinea.DAOModeloAerolinea;
import integracion.modeloAerolinea.DAOModeloAerolineaImp;
import integracion.personal.DAOPersonal;
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
	
	public DAOPersonalHangar crearDAOPersonalHangar() {
		return new DAOPersonalHangarImp();
	}

	@Override
	public DAOHangar crearDAOHangar() {
		return new DAOHangarImp();
	}

	public DAOContrato crearDAOContrato() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaIntegracion#crearDAOPersonal()
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public DAOPersonal crearDAOPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}