/**
 * 
 */
package integracion.aerolinea;

import negocio.aerolinea.TAerolinea;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface DAOAerolinea {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idAerolinea
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public TAerolinea leerAerolineaPorId(int idAerolinea);
}