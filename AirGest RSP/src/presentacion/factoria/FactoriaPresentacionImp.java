package presentacion.factoria;

import presentacion.VistaPrincipal;
import presentacion.avion.*;
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

	public Observador crearVistaConsultarTodosModelos() {
		return new VistaConsultarTodosModelos();
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

	public Observador crearVistaPrincipal() {
		return new VistaPrincipal();
	}
}