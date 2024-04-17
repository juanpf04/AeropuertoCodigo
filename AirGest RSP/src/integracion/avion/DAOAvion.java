package integracion.avion;

import java.util.List;

import negocio.avion.TAvion;

public interface DAOAvion {

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idModelo
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List mostrarAvionesPorModelo(int idModelo);

	public List<TAvion> consultarAvionesPorModelo(int idModelo);

	public List<TAvion> consultarAvionesActivosPorModelo(int idModelo);

	public int altaAvion(TAvion tAvion);

	public boolean bajaAvion(int idAvion);

	public TAvion consultarAvionPorId(int idAvion);

	public TAvion consultarAvionPorNombre(String nombre);

	public List<TAvion> consultarTodosAviones();

	public boolean modificarAvion(TAvion tAvion);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idAerolinea
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List mostrarAvionesPorAerolinea(int idAerolinea);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param idHangar
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List mostrarAvionesPorHangar(int idHangar);

	public List<TAvion> consultarAvionesPorAerolinea(int idAerolinea);

	public List<TAvion> consultarAvionesPorHangar(int idHangar);

	public List<TAvion> consultarAvionesActivosPorAerolinea(int idAerolinea);

	public List<TAvion> consultarAvionesActivosPorHangar(int idHangar);
}