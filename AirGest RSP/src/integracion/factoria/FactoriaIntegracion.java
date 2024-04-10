package integracion.factoria;

import integracion.modelo.DAOModelo;
import integracion.modeloAerolinea.DAOModeloAerolinea;
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

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract DAOAerolinea crearDAOAerolinea();

	public abstract DAOAerolinea crearDAOAeolinea();

	public abstract DAOModeloAerolinea crearDAOModeloAerolinea();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract DAOContrato crearDAOContrato();
}