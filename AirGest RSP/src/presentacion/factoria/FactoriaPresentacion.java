
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
}