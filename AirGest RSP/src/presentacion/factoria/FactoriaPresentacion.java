
package presentacion.factoria;

import presentacion.Observador;

public abstract class FactoriaPresentacion {

	private static FactoriaPresentacion instancia;

	public static FactoriaPresentacion getInstance() {
		if (instancia == null)
			instancia = new FactoriaPresentacionImp();
		return instancia;
	}

	public abstract Observador crearVistaAltaModelo();

	public abstract Observador crearVistaExitoAltaModelo();

	public abstract Observador crearVistaFalloAltaModelo();

	public abstract Observador crearVistaExitoBajaModelo();

	public abstract Observador crearVistaFalloBajaModelo();

	public abstract Observador crearVistaBajaModelo();

	public abstract Observador crearVistaConsultarTodosModelos();

	public abstract Observador crearVistaResultadoConsultarTodosModelos();

	public abstract Observador crearVistaConsultarModeloPorId();

	public abstract Observador crearVistaResultadoConsultarModeloPorId();

	public abstract Observador crearVistaDesvincularModelo();

	public abstract Observador crearVistaExitoDesvincularModelo();

	public abstract Observador crearVistaFalloDesvincularModelo();

	public abstract Observador crearVistaVincularModelo();

	public abstract Observador crearVistaExitoVincularModelo();

	public abstract Observador crearVistaFalloVincularModelo();

	public abstract Observador crearVistaModificarModelo();

	public abstract Observador crearVistaExitoModificarModelo();

	public abstract Observador crearVistaFalloModificarModelo();

	public abstract Observador crearVistaModelo();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaPrincipal();

	public abstract Observador CrearVistaPrincipal();

	public abstract Observador crearVistaFalloAltaAerolinea();

	public abstract Observador crearVistaExitoAltaAerolinea();

	public abstract Observador crearVistaFalloBajaAerolinea();

	public abstract Observador crearVistaExitoBajaAerolinea();

	public abstract Observador crearVistaResultadoConsultarAerolineaPorId();

	public abstract Observador crearVistaResultadoConsultarTodasAerolineas();

	public abstract Observador crearVistaFalloModificarAerolinea();

	public abstract Observador crearVistaExitoModificarAerolinea();

	public abstract Observador crearVistaAerolinea();

	public abstract Observador crearVistaAltaAerolinea();

	public abstract Observador crearVistaBajaAerolinea();

	public abstract Observador crearVistaConsultarAerolineaPorId();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaAltaPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaBajaPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaModificarPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaVincularPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaDesvincularPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaConsultarPersonalPorId();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaConsultarPersonalExistente();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoAltaPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloAltaPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoBajaPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloBajaPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoModificarPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloModificarPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoVincularPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloVincularPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoDesvincularPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloDesvincularPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaResultadoConsultarPersonalPorId();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaResultadoConsultarPersonalExistente();

	public abstract Observador crearVistaModificarAerolinea();

	public abstract Observador crearVistaConsultarTodasAerolineas();

	public abstract Observador crearVistaHangar();//poner esto abstract en diagrama

	public abstract Observador crearVistaAltaHangar();

	public abstract Observador crearVistaExitoAltaHangar();

	public abstract Observador crearVistaFalloAltaHangar();

	public abstract Observador crearVistaBajaHangar();

	public abstract Observador crearVistaExitoBajaHangar();

	public abstract Observador crearVistaFalloBajaHangar();

	public abstract Observador crearVistaConsultarHangarPorId();

	public abstract Observador crearVistaResultadoConsultarHangarPorId();

	public abstract Observador crearVistaResultadoConsultarTodosHangares();

	public abstract Observador crearVistaModificarHangar();

	public abstract Observador crearVistaExitoModificarHangar();

	public abstract Observador crearVistaFalloModificarHangar();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaAltaAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaBajaAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaConsultarAvionPorId();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoAltaAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoBajaAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaExitoModificarAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloAltaAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloBajaAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaFalloModificarAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaModficarAvion();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaMostrarAvionesPorAerolinea();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaMostrarAvionesPorHangar();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaMostrarAvionesPorModelo();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaResultadoConsultarAvionPorId();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaResultadoConsultarTodosAviones();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaResultadoMostrarAvionesPorAerolinea();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaResultadoMostrarAvionesPorHangar();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract Observador crearVistaResultadoMostrarAvionesPorModelo();
}