
package presentacion.controlador;

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

		switch (evento) {
		//MODELO

		case EventosControlador.ALTA_MODELO:
			sm = fn.crearSAModelo();
			int num = sm.altaModelo((TModelo) datos);
			// TODO actulizar vistas
			if (num == -1) {
				Observador falloAlta = fp.crearVistaFalloAltaModelo();
				falloAlta.actualizaVista();
			} else {
				Observador exitoAlta = fp.crearVistaExitoAltaModelo();
				exitoAlta.actualizaVista();
			}

			break;

		case EventosControlador.BAJA_MODELO:
			sm = fn.crearSAModelo();
			sm.bajaModelo((int) datos);
			// TODO actulizar vistas
			break;

		case EventosControlador.CONSULTAR_MODELO_POR_ID:
			sm = fn.crearSAModelo();
			sm.consultarModelo((int) datos);
			// TODO actulizar vistas
			break;

		case EventosControlador.CONSULTAR_TODOS_MODELOS:
			sm = fn.crearSAModelo();
			sm.consultarTodosModelos();
			// TODO actulizar vistas
			break;

		case EventosControlador.MODIFICAR_MODELO:
			sm = fn.crearSAModelo();
			sm.modificarModelo((TModelo) datos);
			// TODO actulizar vistas
			break;

		case EventosControlador.VINCULAR_MODELO:
			sm = fn.crearSAModelo();
			sm.vincularModelo((TModeloAerolinea) datos);
			// TODO actulizar vistas
			break;

		case EventosControlador.DESVINCULAR_MODELO:
			sm = fn.crearSAModelo();
			sm.desvincularModelo((TModeloAerolinea) datos);
			// TODO actulizar vistas
			break;
		}

	}
}