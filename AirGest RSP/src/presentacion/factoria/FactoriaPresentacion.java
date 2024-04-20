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

	public abstract Observador crearVistaPrincipal();

	public abstract Observador crearVistaAltaAvion();

	public abstract Observador crearVistaAvion();

	public abstract Observador crearVistaBajaAvion();

	public abstract Observador crearVistaConsultarAvionPorId();

	public abstract Observador crearVistaExitoAltaAvion();

	public abstract Observador crearVistaExitoBajaAvion();

	public abstract Observador crearVistaExitoModificarAvion();

	public abstract Observador crearVistaFalloAltaAvion();

	public abstract Observador crearVistaFalloBajaAvion();

	public abstract Observador crearVistaFalloModificarAvion();

	public abstract Observador crearVistaModficarAvion();

	public abstract Observador crearVistaMostrarAvionesPorAerolinea();

	public abstract Observador crearVistaMostrarAvionesPorHangar();

	public abstract Observador crearVistaMostrarAvionesPorModelo();

	public abstract Observador crearVistaResultadoConsultarAvionPorId();

	public abstract Observador crearVistaResultadoConsultarTodosAviones();

	public abstract Observador crearVistaResultadoMostrarAvionesPorAerolinea();

	public abstract Observador crearVistaResultadoMostrarAvionesPorHangar();

	public abstract Observador crearVistaResultadoMostrarAvionesPorModelo();
}