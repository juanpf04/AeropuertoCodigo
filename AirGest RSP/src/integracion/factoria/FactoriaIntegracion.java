package integracion.factoria;

import integracion.modelo.DAOModelo;
import integracion.modeloAerolinea.DAOModeloAerolinea;
import integracion.personal.DAOPersonal;
import integracion.avion.DAOAvion;
import integracion.contrato.DAOContrato;
import integracion.hangar.DAOHangar;
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

	public abstract DAOAerolinea crearDAOAerolinea();

	public abstract DAOModeloAerolinea crearDAOModeloAerolinea();

	public abstract DAOHangar crearDAOHangar();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract DAOContrato crearDAOContrato();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract DAOPersonal crearDAOPersonal();
	//public abstract DAOContrato crearDAOContrato();
}