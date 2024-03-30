
package presentacion.controlador;

import negocio.factoria.FactoriaNegocio;
import negocio.modelo.SAModelo;
import negocio.modelo.TModelo;
import negocio.modeloAerolinea.TModeloAerolinea;
import presentacion.factoria.FactoriaPresentacion;
import presentacion.modelo.VistaAltaDeModelo;

public class ControladorImp extends Controlador {
	public void accion(int evento) {
		FactoriaPresentacion fp = FactoriaPresentacion.getInstance();
		FactoriaNegocio fn = FactoriaNegocio.getInstance();
		SAModelo sm;
		Object datos = 1; //NO puede ser un parametro de la accion porque en la ventana principal de cada modulo NO conocemos los datos aun
		//los datos se conocen en cada ventana de cada accion, hay que inicializarlos a algo por ahora 

		switch (evento) {
		//MODELO
		
		case EventosControlador.ALTA_MODELO:
			sm = fn.crearSAModelo();
			//falta metodo que "reciba datos" para poder dar de alta el modelo(el correspondiente Object datos)
			VistaAltaDeModelo altaModelo = new VistaAltaDeModelo();
			TModelo datosAlta = altaModelo.crearTransfer();
			sm.altaModelo(datosAlta); //ya actualiza la base de datos, dejando que actualizarVista solo muestre si es fallo o acierto
			//llamar a ventana principal con el nombre del modulo en el que estamos y de la accion ?? 
			// TODO actulizar vistas
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