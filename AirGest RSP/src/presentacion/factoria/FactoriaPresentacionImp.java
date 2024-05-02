

package presentacion.factoria;

import presentacion.VistaPrincipal;
import presentacion.aerolinea.VistaAerolinea;
import presentacion.aerolinea.VistaAltaAerolinea;
import presentacion.aerolinea.VistaBajaAerolinea;
import presentacion.aerolinea.VistaConsultarAerolineaPorId;
import presentacion.aerolinea.VistaConsultarTodasAerolineas;
import presentacion.aerolinea.VistaExitoAltaAerolinea;
import presentacion.aerolinea.VistaExitoBajaAerolinea;
import presentacion.aerolinea.VistaExitoModificarAerolinea;
import presentacion.aerolinea.VistaFalloAltaAerolinea;
import presentacion.aerolinea.VistaFalloBajaAerolinea;
import presentacion.aerolinea.VistaFalloModificarAerolinea;
import presentacion.aerolinea.VistaModificarAerolinea;
import presentacion.aerolinea.VistaResultadoConsultarAerolineaPorId;
import presentacion.aerolinea.VistaResultadoConsultarTodasAerolineas;
import presentacion.avion.VistaAltaAvion;
import presentacion.avion.VistaAvion;
import presentacion.avion.VistaBajaAvion;
import presentacion.avion.VistaConsultarAvionPorId;
import presentacion.avion.VistaExitoAltaAvion;
import presentacion.avion.VistaExitoBajaAvion;
import presentacion.avion.VistaExitoModificarAvion;
import presentacion.avion.VistaFalloAltaAvion;
import presentacion.avion.VistaFalloBajaAvion;
import presentacion.avion.VistaFalloModificarAvion;
import presentacion.avion.VistaModificarAvion;
import presentacion.avion.VistaMostrarAvionesPorAerolinea;
import presentacion.avion.VistaMostrarAvionesPorHangar;
import presentacion.avion.VistaMostrarAvionesPorModelo;
import presentacion.avion.VistaResultadoConsultarAvionPorId;
import presentacion.avion.VistaResultadoConsultarTodosAviones;
import presentacion.avion.VistaResultadoMostrarAvionesPorAerolinea;
import presentacion.avion.VistaResultadoMostrarAvionesPorHangar;
import presentacion.avion.VistaResultadoMostrarAvionesPorModelo;
import presentacion.contrato.VistaAbrirContrato;
import presentacion.contrato.VistaAñadirHangar;
import presentacion.contrato.VistaCarrito;
import presentacion.contrato.VistaConsultarContratoPorId;
import presentacion.contrato.VistaConsultarContratosPorAerolinea;
import presentacion.contrato.VistaConsultarTodosContratos;
import presentacion.contrato.VistaContrato;
import presentacion.contrato.VistaEliminarHangar;
import presentacion.contrato.VistaExitoCerrarContrato;
import presentacion.contrato.VistaExitoModificarContrato;
import presentacion.contrato.VistaExitoModificarLineaContrato;
import presentacion.contrato.VistaFalloCerrarContrato;
import presentacion.contrato.VistaFalloModificarContrato;
import presentacion.contrato.VistaFalloModificarLineaContrato;
import presentacion.contrato.VistaModificarContrato;
import presentacion.contrato.VistaModificarLineaContrato;
import presentacion.contrato.VistaResultadoConsultarContratoPorId;
import presentacion.contrato.VistaResultadoConsultarTodosContratos;
import presentacion.contrato.VistaResultadorConsultarContratosPorAerolinea;
import presentacion.hangar.VistaAltaHangar;
import presentacion.hangar.VistaBajaHangar;
import presentacion.hangar.VistaConsultarHangarPorId;
import presentacion.hangar.VistaExitoAltaHangar;
import presentacion.hangar.VistaExitoBajaHangar;
import presentacion.hangar.VistaExitoModificarHangar;
import presentacion.hangar.VistaFalloAltaHangar;
import presentacion.hangar.VistaFalloBajaHangar;
import presentacion.hangar.VistaFalloModificarHangar;
import presentacion.hangar.VistaHangar;
import presentacion.hangar.VistaModificarHangar;
import presentacion.hangar.VistaResultadoConsultarHangarPorId;
import presentacion.hangar.VistaResultadoConsultarTodosHangares;
import presentacion.modelo.*;
import presentacion.Observador;

public class FactoriaPresentacionImp extends FactoriaPresentacion {

	public Observador crearVistaAltaModelo() {
		return new VistaAltaModelo();
	}

	public Observador crearVistaExitoAltaModelo() {
		return new VistaExitoAltaModelo();
	}

	public Observador crearVistaFalloAltaModelo() {
		return new VistaFalloAltaModelo();
	}

	public Observador crearVistaExitoBajaModelo() {
		return new VistaExitoBajaModelo();
	}

	public Observador crearVistaFalloBajaModelo() {
		return new VistaFalloBajaModelo();
	}

	public Observador crearVistaBajaModelo() {
		return new VistaBajaModelo();
	}

	public Observador crearVistaResultadoConsultarTodosModelos() {
		return new VistaResultadoConsultarTodosModelos();
	}

	public Observador crearVistaConsultarModeloPorId() {
		return new VistaConsultarModeloPorId();
	}

	public Observador crearVistaResultadoConsultarModeloPorId() {
		return new VistaResultadoConsultarModeloPorId();
	}

	public Observador crearVistaDesvincularModelo() {
		return new VistaDesvincularModelo();
	}

	public Observador crearVistaExitoDesvincularModelo() {
		return new VistaExitoDesvincularModelo();
	}

	public Observador crearVistaFalloDesvincularModelo() {
		return new VistaFalloDesvincularModelo();
	}

	public Observador crearVistaVincularModelo() {
		return new VistaVincularModelo();
	}

	public Observador crearVistaExitoVincularModelo() {
		return new VistaExitoVincularModelo();
	}

	public Observador crearVistaFalloVincularModelo() {
		return new VistaFalloVincularModelo();
	}

	public Observador crearVistaModificarModelo() {
		return new VistaModificarModelo();
	}

	public Observador crearVistaExitoModificarModelo() {
		return new VistaExitoModificarModelo();
	}

	public Observador crearVistaFalloModificarModelo() {
		return new VistaFalloModificarModelo();
	}

	public Observador crearVistaModelo() {
		return new VistaModelo();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaPrincipal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaPrincipal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public Observador CrearVistaPrincipal() {
		return new VistaPrincipal();
	}

	public Observador crearVistaHangar() {
		return new VistaHangar();
	}

	public Observador crearVistaAltaHangar() {
		return new VistaAltaHangar();
	}

	public Observador crearVistaExitoAltaHangar() {
		return new VistaExitoAltaHangar();
	}

	public Observador crearVistaFalloAltaHangar() {
		return new VistaFalloAltaHangar();
	}

	public Observador crearVistaBajaHangar() {
		return new VistaBajaHangar();
	}

	public Observador crearVistaExitoBajaHangar() {
		return new VistaExitoBajaHangar();
	}

	public Observador crearVistaFalloBajaHangar() {
		return new VistaFalloBajaHangar();
	}

	public Observador crearVistaConsultarHangarPorId() {
		return new VistaConsultarHangarPorId();
	}

	public Observador crearVistaResultadoConsultarHangarPorId() {
		return new VistaResultadoConsultarHangarPorId();
	}

	public Observador crearVistaResultadoConsultarTodosHangares() {
		return new VistaResultadoConsultarTodosHangares();
	}

	public Observador crearVistaModificarHangar() {
		return new VistaModificarHangar();
	}

	public Observador crearVistaExitoModificarHangar() {
		return new VistaExitoModificarHangar();
	}

	public Observador crearVistaFalloModificarHangar() {
		return new VistaFalloModificarHangar();
	}

	public Observador crearVistaAltaAvion() {
		return new VistaAltaAvion();
	}

	public Observador crearVistaAvion() {
		return new VistaAvion();
	}

	public Observador crearVistaBajaAvion() {
		return new VistaBajaAvion();
	}

	public Observador crearVistaConsultarAvionPorId() {
		return new VistaConsultarAvionPorId();
	}

	public Observador crearVistaExitoAltaAvion() {
		return new VistaExitoAltaAvion();
	}

	public Observador crearVistaExitoBajaAvion() {
		return new VistaExitoBajaAvion();
	}

	public Observador crearVistaExitoModificarAvion() {
		return new VistaExitoModificarAvion();
	}

	public Observador crearVistaFalloAltaAvion() {
		return new VistaFalloAltaAvion();
	}

	public Observador crearVistaFalloBajaAvion() {
		return new VistaFalloBajaAvion();
	}

	public Observador crearVistaFalloModificarAvion() {
		return new VistaFalloModificarAvion();
	}

	public Observador crearVistaModficarAvion() {
		return new VistaModificarAvion();
	}

	public Observador crearVistaMostrarAvionesPorAerolinea() {
		return new VistaMostrarAvionesPorAerolinea();
	}

	public Observador crearVistaMostrarAvionesPorHangar() {
		return new VistaMostrarAvionesPorHangar();
	}

	public Observador crearVistaMostrarAvionesPorModelo() {
		return new VistaMostrarAvionesPorModelo();
	}

	public Observador crearVistaResultadoConsultarAvionPorId() {
		return new VistaResultadoConsultarAvionPorId();
	}

	public Observador crearVistaResultadoConsultarTodosAviones() {
		return new VistaResultadoConsultarTodosAviones();
	}

	public Observador crearVistaResultadoMostrarAvionesPorAerolinea() {
		return new VistaResultadoMostrarAvionesPorAerolinea();
	}

	public Observador crearVistaResultadoMostrarAvionesPorHangar() {
		return new VistaResultadoMostrarAvionesPorHangar();
	}

	public Observador crearVistaResultadoMostrarAvionesPorModelo() {
		return new VistaResultadoMostrarAvionesPorModelo();
	}

	public Observador crearVistaFalloAltaAerolinea() {
		return new VistaFalloAltaAerolinea();
	}

	public Observador crearVistaExitoAltaAerolinea() {
		return new VistaExitoAltaAerolinea();
	}

	public Observador crearVistaFalloBajaAerolinea() {
		return new VistaFalloBajaAerolinea();
	}

	public Observador crearVistaExitoBajaAerolinea() {
		return new VistaExitoBajaAerolinea();
	}

	public Observador crearVistaResultadoConsultarAerolineaPorId() {
		return new VistaResultadoConsultarAerolineaPorId();
	}

	public Observador crearVistaResultadoConsultarTodasAerolineas() {
		return new VistaResultadoConsultarTodasAerolineas();
	}

	public Observador crearVistaFalloModificarAerolinea() {
		return new VistaFalloModificarAerolinea();
	}

	public Observador crearVistaExitoModificarAerolinea() {
		return new VistaExitoModificarAerolinea();
	}

	public Observador crearVistaAerolinea() {
		return new VistaAerolinea();
	}

	public Observador crearVistaAltaAerolinea() {
		return new VistaAltaAerolinea();
	}

	public Observador crearVistaBajaAerolinea() {
		return new VistaBajaAerolinea();
	}

	public Observador crearVistaConsultarAerolineaPorId() {
		return new VistaConsultarAerolineaPorId();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaAltaPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaAltaPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaBajaPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaBajaPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaModificarPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaModificarPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaVincularPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaVincularPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaDesvincularPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaDesvincularPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaConsultarPersonalPorId()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaConsultarPersonalPorId() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaConsultarPersonalExistente()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaConsultarPersonalExistente() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaExitoAltaPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaExitoAltaPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaFalloAltaPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaFalloAltaPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaExitoBajaPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaExitoBajaPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaFalloBajaPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaFalloBajaPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaExitoModificarPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaExitoModificarPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaFalloModificarPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaFalloModificarPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaExitoVincularPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaExitoVincularPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaFalloVincularPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaFalloVincularPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaExitoDesvincularPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaExitoDesvincularPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaFalloDesvincularPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaFalloDesvincularPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaResultadoConsultarPersonalPorId()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaResultadoConsultarPersonalPorId() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaResultadoConsultarPersonalExistente()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaResultadoConsultarPersonalExistente() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	
	public Observador crearVistaContrato() {
		return new VistaContrato();
	}

	public Observador crearVistaAbrirContrato() {
		return new VistaAbrirContrato();
	}

	public Observador crearVistaAñadirHangar() {
		return new VistaAñadirHangar();
	}

	public Observador crearVistaCarrito() {
		return new VistaCarrito();
	}

	public Observador crearVistaConsultarContratoPorId() {
		return new VistaConsultarContratoPorId();
	}

	public Observador crearVistaConsultarContratoPorAerolinea() {
		return new VistaConsultarContratosPorAerolinea();
	}

	public Observador crearVistaConsultarTodosContratos() {
		return new VistaConsultarTodosContratos();
	}

	public Observador crearVistaEliminarHangar() {
		return new VistaEliminarHangar();
	}

	public Observador crearVistaExitoCerrarContrato() {
		return new VistaExitoCerrarContrato();
	}

	public Observador crearVistaExitoModificarContrato() {
		return new VistaExitoModificarContrato();
	}

	public Observador crearVistaExitoModificarLineaContrato() {
		return new VistaExitoModificarLineaContrato();
	}

	public Observador crearVistaFalloCerrarContrato() {
		return new VistaFalloCerrarContrato();
	}

	public Observador crearVistaFalloModificarContrato() {
		return new VistaFalloModificarContrato();
	}

	public Observador crearVistaFalloModificarLineaContrato() {
		return new VistaFalloModificarLineaContrato();
	}

	public Observador crearVistaModificarContrato() {
		return new VistaModificarContrato();
	}

	public Observador crearVistaModificarLineaContrato() {
		return new VistaModificarLineaContrato();
	}

	public Observador crearVistaResultadoConsultarContratosPorAerolinea() {
		return new VistaResultadorConsultarContratosPorAerolinea();
	}

	public Observador crearVistaResultadoConsultarTodosContratos() {
		return new VistaResultadoConsultarTodosContratos();
	}

	public Observador crearVistaModificarAerolinea() {
		return new VistaModificarAerolinea();
	}

	public Observador crearVistaConsultarTodasAerolineas() {
		return new VistaConsultarTodasAerolineas();
	}

	@Override
	public Observador crearVistaConsultarTodosModelos() {
		return new VistaConsultarTodosContratos();
	}
	
	@Override
	public Observador crearVistaResultadoConsultarContratoPorid(){
		return new VistaResultadoConsultarContratoPorId();
	}
}