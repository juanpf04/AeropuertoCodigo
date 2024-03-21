package integracion.factoria;

import integracion.aerolinea.DAOAerolinea;
import integracion.avion.DAOAvion;
import integracion.modelo.DAOModelo;
import integracion.modelo.DAOModeloImp;
import integracion.modeloAerolinea.DAOModeloAerolinea;

public class FactoriaIntegracionImp extends FactoriaIntegracion {

	public DAOModelo crearDAOModelo() {
		return new DAOModeloImp();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaIntegracion#crearDAOAvion()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public DAOAvion crearDAOAvion() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaIntegracion#crearDAOAeolinea()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public DAOAerolinea crearDAOAeolinea() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaIntegracion#crearDAOModeloAerolinea()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public DAOModeloAerolinea crearDAOModeloAerolinea() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}