
package presentacion.controlador;

import java.util.List;

import negocio.factoria.FactoriaNegocio;
import negocio.modelo.SAModelo;
import negocio.modelo.TModelo;
import negocio.modeloAerolinea.TModeloAerolinea;
import presentacion.factoria.FactoriaPresentacion;
import presentacion.modelo.Observador;

public class ControladorImp extends Controlador {
	public void accion(int evento, Object datos) {
		FactoriaPresentacion fp = FactoriaPresentacion.getInstance();
		FactoriaNegocio fn = FactoriaNegocio.getInstance();
		SAModelo sm;
		Observador vista = null;
		boolean exito;

		switch (evento) {
		// MODELO

		case EventosControlador.ALTA_MODELO:
			sm = fn.crearSAModelo();
			int id = sm.altaModelo((TModelo) datos);

			if (id != -1)
				vista = fp.crearVistaExitoAltaModelo();
			else
				vista = fp.crearVistaFalloAltaModelo();

			break;
		case EventosControlador.BAJA_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.bajaModelo((int) datos);

			if (exito)
				vista = fp.crearVistaExitoBajaModelo();
			else
				vista = fp.crearVistaFalloBajaModelo();

			break;
		case EventosControlador.CONSULTAR_MODELO_POR_ID:
			sm = fn.crearSAModelo();
			TModelo modelo = sm.consultarModelo((int) datos);
			vista = fp.crearVistaConsultarModeloPorId(); // necesita parametros
															// no??

			break;
		case EventosControlador.CONSULTAR_TODOS_MODELOS:
			sm = fn.crearSAModelo();
			List<TModelo> modelos = sm.consultarTodosModelos();
			vista = fp.crearVistaConsultarTodosModelos(); // necesita parametros
															// no??

			break;
		case EventosControlador.MODIFICAR_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.modificarModelo((TModelo) datos);

			if (exito)
				vista = fp.crearVistaExitoModificarModelo();
			else
				vista = fp.crearVistaFalloModificarModelo();

			break;
		case EventosControlador.VINCULAR_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.vincularModelo((TModeloAerolinea) datos);

			if (exito)
				vista = fp.crearVistaExitoVincularModelo();
			else
				vista = fp.crearVistaFalloVincularModelo();

			break;
		case EventosControlador.DESVINCULAR_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.desvincularModelo((TModeloAerolinea) datos);

			if (exito)
				vista = fp.crearVistaExitoDesvincularModelo();
			else
				vista = fp.crearVistaFalloDesvincularModelo();

			break;
		}

		vista.actualizaVista();
	}
}