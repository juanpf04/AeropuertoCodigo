package integracion.factoria;

import integracion.modelo.DAOModelo;
import integracion.modeloAerolinea.DAOModeloAerolinea;
import integracion.avion.DAOAvion;
import integracion.contrato.DAOContrato;
import integracion.hangar.DAOHangar;
import integracion.lineaContrato.DAOLineaContrato;
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

	public abstract DAOContrato crearDAOContrato();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract void crearDAOPersonal();

	public abstract DAOLineaContrato crearDAOLineaContrato();
}