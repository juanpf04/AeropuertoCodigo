package principal;


import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;


public class Principal {

	public static void main(String[] args) {

		Controlador ctrl = Controlador.getInstance();
		ctrl.accion(EventosControlador.VISTA_PRINCIPAL, null);
	}

}
