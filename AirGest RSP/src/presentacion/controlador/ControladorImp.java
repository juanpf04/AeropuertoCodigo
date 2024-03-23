
package presentacion.controlador;

import negocio.factoria.FactoriaNegocio;
import negocio.modelo.SAModelo;
import negocio.modelo.TModelo;
import presentacion.factoria.FactoriaPresentacion;

public class ControladorImp extends Controlador {
	public void accion(int evento, Object datos) {
		FactoriaPresentacion fp = FactoriaPresentacion.getInstance();
		FactoriaNegocio fn = FactoriaNegocio.getInstance();

		switch (evento) {
		case EventosControlador.ALTA_MODELO:
			SAModelo sm = fn.crearSAModelo();
			sm.altaModelo((TModelo) datos);
			// TODO actulizar vistas
			break;

		}
	}
}