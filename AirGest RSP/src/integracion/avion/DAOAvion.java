/**
 * 
 */
package integracion.avion;

import java.util.List;

import negocio.avion.TAvion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author javia
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface DAOAvion {

	public List<TAvion> consultarAvionesPorModelo(int idModelo);

	public List<TAvion> consultarAvionesActivosPorModelo(int idModelo);
}