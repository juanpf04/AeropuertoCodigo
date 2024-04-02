
package presentacion.controlador;

import java.util.List;

import negocio.factoria.FactoriaNegocio;
import negocio.modelo.SAModelo;
import negocio.modelo.TModelo;
import negocio.modeloAerolinea.TModeloAerolinea;
import presentacion.factoria.FactoriaPresentacion;
import presentacion.Observador;

public class ControladorImp extends Controlador {

	public void accion(EventosControlador evento, Object datos) {
		FactoriaPresentacion fp = FactoriaPresentacion.getInstance();
		FactoriaNegocio fn = FactoriaNegocio.getInstance();
		SAModelo sm;
		Observador vista = null;
		boolean exito;

		switch (evento) {
		
		case VISTA_PRINCIPAL:
			vista = fp.CrearVistaPrincipal();
			vista.actualizaVista(null);
			break;
			
		case VISTA_MODELO:
			vista = fp.crearVistaModelo();
			vista.actualizaVista(null);
			break;
		case VISTA_ALTA_MODELO:
			vista = fp.crearVistaAltaModelo();
			vista.actualizaVista(null);
			break;
		
		case ALTA_MODELO:
			sm = fn.crearSAModelo();
			int id = sm.altaModelo((TModelo) datos);

			if (id != -1) {
				vista = fp.crearVistaExitoAltaModelo();
				vista.actualizaVista(id);
			} else {
				vista = fp.crearVistaFalloAltaModelo();
				vista.actualizaVista(null);
			}

			break;
		case BAJA_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.bajaModelo((int) datos);

			if (exito)
				vista = fp.crearVistaExitoBajaModelo();
			else
				vista = fp.crearVistaFalloBajaModelo();

			vista.actualizaVista(null);

			break;
		case CONSULTAR_MODELO_POR_ID:
			sm = fn.crearSAModelo();
			TModelo modelo = sm.consultarModelo((int) datos);
			vista = fp.crearVistaConsultarModeloPorId();
			vista.actualizaVista(modelo);

			break;
		case CONSULTAR_TODOS_MODELOS:
			sm = fn.crearSAModelo();
			List<TModelo> modelos = sm.consultarTodosModelos();
			vista = fp.crearVistaConsultarTodosModelos();
			vista.actualizaVista(modelos);

			break;
		case MODIFICAR_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.modificarModelo((TModelo) datos);

			if (exito)
				vista = fp.crearVistaExitoModificarModelo();
			else
				vista = fp.crearVistaFalloModificarModelo();

			vista.actualizaVista(null);

			break;
		case VINCULAR_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.vincularModelo((TModeloAerolinea) datos);

			if (exito)
				vista = fp.crearVistaExitoVincularModelo();
			else
				vista = fp.crearVistaFalloVincularModelo();

			vista.actualizaVista(null);

			break;
		case DESVINCULAR_MODELO:
			sm = fn.crearSAModelo();
			exito = sm.desvincularModelo((TModeloAerolinea) datos);

			if (exito)
				vista = fp.crearVistaExitoDesvincularModelo();
			else
				vista = fp.crearVistaFalloDesvincularModelo();

			vista.actualizaVista(null);

			break;
		}
	}
}