
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
	
	public Observador crearVistaConsultarAerolineaPorId(){
		return new VistaConsultarAerolineaPorId();
	}
	
	public Observador crearVistaModificarAerolinea(){
		return new VistaModificarAerolinea();
	}
	
	public Observador crearVistaConsultarTodasAerolineas(){
		return new VistaConsultarTodasAerolineas();
	}

	@Override
	public Observador crearVistaConsultarTodosModelos() {
		// TODO Auto-generated method stub
		return null;
	}
}