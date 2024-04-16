package presentacion.factoria;

import presentacion.VistaPrincipal;
import presentacion.aerolinea.*;
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

	/** 
	* (non-Javadoc)
	* @see FactoriaPresentacion#crearVistaConsultarTodosModelos()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Observador crearVistaConsultarTodosModelos() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
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

	public Observador CrearVistaPrincipal() {
		return new VistaPrincipal();
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
	
	public Observador crearVistaAltaAerolinea(){
		return new VistaAltaAerolinea();
	}
	
	public Observador crearVistaBajaAerolinea(){
		return new VistaBajaAerolinea();
	}
	
	public Observador crearVistaConsutarAerolineaPorId(){
		return new VistaConsultarAerolineaPorId();
	}
	
	public Observador crearVistaModificarAerolinea(){
		return new VistaModificarAerolinea();
	}
	
	public Observador crearVistaConsultarTodasAerolineas(){
		return new VistaConsultarTodasAerolineas();
	}
}