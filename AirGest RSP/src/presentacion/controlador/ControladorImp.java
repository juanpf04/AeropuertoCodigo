
package presentacion.controlador;

import java.util.List;

import negocio.avion.SAAvion;
import negocio.avion.TAvion;
import negocio.factoria.FactoriaNegocio;
import negocio.modelo.SAModelo;
import negocio.modelo.TModelo;
import negocio.modeloAerolinea.TModeloAerolinea;
import presentacion.factoria.FactoriaPresentacion;
import presentacion.Observador;

public class ControladorImp extends Controlador {

	/**
	 * (non-Javadoc)
	 * 
	 * @see Controlador#accion(Enum evento, Object datos)
	 * @generated "UML to Java
	 *            (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void accion(Enum evento, Object datos) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void accion(EventosControlador evento, Object datos) {
		FactoriaPresentacion fp = FactoriaPresentacion.getInstance();
		FactoriaNegocio fn = FactoriaNegocio.getInstance();
		SAModelo sm;
		SAAvion sav;
		Observador vista = null;
		boolean exito;

		switch (evento) {

		case VISTA_PRINCIPAL:// VISTA GENERAL
			vista = fp.crearVistaPrincipal();
			vista.actualizaVista(null);
			break;

		case VISTA_MODELO:// VISTA MODELO
			vista = fp.crearVistaModelo();
			vista.actualizaVista(null);
			break;
		case VISTA_ALTA_MODELO:
			vista = fp.crearVistaAltaModelo();
			vista.actualizaVista(null);
			break;
		case VISTA_BAJA_MODELO:
			vista = fp.crearVistaBajaModelo();
			vista.actualizaVista(null);
			break;
		case VISTA_CONSULTAR_MODELO_POR_ID:
			vista = fp.crearVistaConsultarModeloPorId();
			vista.actualizaVista(null);
			break;
		case VISTA_MODIFICAR_MODELO:
			vista = fp.crearVistaModificarModelo();
			vista.actualizaVista(null);
			break;
		case VISTA_VINCULAR_MODELO:
			vista = fp.crearVistaVincularModelo();
			vista.actualizaVista(null);
			break;
		case VISTA_DESVINCULAR_MODELO:
			vista = fp.crearVistaDesvincularModelo();
			vista.actualizaVista(null);
			break;

		case ALTA_MODELO:// MODELO
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
			vista = fp.crearVistaResultadoConsultarModeloPorId();
			vista.actualizaVista(modelo);

			break;
		case CONSULTAR_TODOS_MODELOS:
			sm = fn.crearSAModelo();
			List<TModelo> modelos = sm.consultarTodosModelos();
			vista = fp.crearVistaResultadoConsultarTodosModelos();
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

		case VISTA_AVION:// VISTA AVIÓN
			vista = fp.crearVistaAvion();
			vista.actualizaVista(null);
			break;
		case VISTA_ALTA_AVION:
			vista = fp.crearVistaAltaAvion();
			vista.actualizaVista(datos);
			break;
		case VISTA_BAJA_AVION:
			vista = fp.crearVistaBajaAvion();
			vista.actualizaVista(null);
			break;
		case VISTA_CONSULTAR_AVION_POR_ID:
			vista = fp.crearVistaConsultarAvionPorId();
			vista.actualizaVista(null);
			break;
		case VISTA_CONSULTAR_TODOS_AVIONES:
			break;
		case VISTA_MODIFICAR_AVION:
			vista = fp.crearVistaModficarAvion();
			vista.actualizaVista(datos);
			break;
		case VISTA_MOSTRAR_AVIONES_POR_MODELO:
			vista = fp.crearVistaMostrarAvionesPorModelo();
			vista.actualizaVista(null);
			break;
		case VISTA_MOSTRAR_AVIONES_POR_AEROLINEA:
			vista = fp.crearVistaMostrarAvionesPorAerolinea();
			vista.actualizaVista(null);
			break;
		case VISTA_MOSTRAR_AVIONES_POR_HANGAR:
			vista = fp.crearVistaMostrarAvionesPorHangar();
			vista.actualizaVista(null);
			break;

		case ALTA_AVION:// AVIÓN
			sav = fn.crearSAAvion();
			id = sav.altaAvion((TAvion) datos);

			if (id != -1)
				vista = fp.crearVistaExitoAltaAvion();
			else
				vista = fp.crearVistaFalloAltaAvion();

			vista.actualizaVista(id);
			break;
		case BAJA_AVION:
			sav = fn.crearSAAvion();
			exito = sav.bajaAvion((int) datos);

			if (exito)
				vista = fp.crearVistaExitoBajaAvion();
			else
				vista = fp.crearVistaFalloBajaAvion();

			vista.actualizaVista(null);
			break;
		case CONSULTAR_AVION_POR_ID:
			sav = fn.crearSAAvion();
			vista = fp.crearVistaResultadoConsultarAvionPorId();
			vista.actualizaVista(sav.consultarAvionPorId((int) datos));
			break;
		case CONSULTAR_TODOS_AVIONES:
			sav = fn.crearSAAvion();
			vista = fp.crearVistaResultadoConsultarTodosAviones();
			vista.actualizaVista(sav.consultarTodosAviones());
			break;
		case MODIFICAR_AVION:
			sav = fn.crearSAAvion();
			exito = sav.modificarAvion((TAvion) datos);

			if (exito)
				vista = fp.crearVistaExitoModificarAvion();
			else
				vista = fp.crearVistaFalloModificarAvion();

			vista.actualizaVista(null);
			break;
		case MOSTRAR_AVIONES_POR_MODELO:
			sav = fn.crearSAAvion();
			vista = fp.crearVistaResultadoMostrarAvionesPorModelo();
			vista.actualizaVista(sav.mostrarAvionesPorModelo((int) datos));
			break;
		case MOSTRAR_AVIONES_POR_AEROLINEA:
			sav = fn.crearSAAvion();
			vista = fp.crearVistaResultadoMostrarAvionesPorAerolinea();
			vista.actualizaVista(sav.mostrarAvionesPorAerolinea((int) datos));
			break;
		case MOSTRAR_AVIONES_POR_HANGAR:
			sav = fn.crearSAAvion();
			vista = fp.crearVistaResultadoMostrarAvionesPorHangar();
			vista.actualizaVista(sav.mostrarAvionesPorHangar((int) datos));
			break;

		case VISTA_AEROLINEA:// VISTA AEROLÍNEA
			break;
		case VISTA_ALTA_AEROLINEA:
			break;
		case VISTA_BAJA_AEROLINEA:
			break;
		case VISTA_CONSULTAR_AEROLINEA_POR_ID:
			break;
		case VISTA_CONSULTAR_TODOS_AEROLINEAS:
			break;
		case VISTA_MODIFICAR_AEROLINEA:
			break;

		case ALTA_AEROLINEA:// AEROLÍNEA
			break;
		case BAJA_AEROLINEA:
			break;
		case CONSULTAR_AEROLINEA_POR_ID:
			break;
		case CONSULTAR_TODOS_AEROLINEAS:
			break;
		case MODIFICAR_AEROLINEA:
			break;

		case VISTA_CONTRATO:// VISTA CONTRATO
			break;
		case VISTA_ABRIR_CONTRATO:
			break;
		case VISTA_CERRAR_CONTRATO:
			break;
		case VISTA_BAJA_CONTRATO:
			break;
		case VISTA_ANYADIR_HANGAR_AL_CONTRATO:
			break;
		case VISTA_ELIMINAR_HANGAR_DEL_CONTRATO:
			break;
		case VISTA_CONSULTAR_CONTRATO_POR_ID:
			break;
		case VISTA_CONSULTAR_TODOS_CONTRATOS:
			break;
		case VISTA_MODIFICAR_CONTRATO:
			break;
		case VISTA_MODIFICAR_LINEA_CONTRATO:
			break;
		case VISTA_MOSTRAR_CONTRATOS_POR_AEROLINEA:
			break;

		case ABRIR_CONTRATO:// CONTRATO
			break;
		case CERRAR_CONTRATO:
			break;
		case BAJA_CONTRATO:
			break;
		case ANYADIR_HANGAR_AL_CONTRATO:
			break;
		case ELIMINAR_HANGAR_DEL_CONTRATO:
			break;
		case CONSULTAR_CONTRATO_POR_ID:
			break;
		case CONSULTAR_TODOS_CONTRATOS:
			break;
		case MODIFICAR_CONTRATO:
			break;
		case MODIFICAR_LINEA_CONTRATO:
			break;
		case MOSTRAR_CONTRATOS_POR_AEROLINEA:
			break;

		case VISTA_HANGAR:// VISTA HANGAR
			break;
		case VISTA_ALTA_HANGAR:
			break;
		case VISTA_BAJA_HANGAR:
			break;
		case VISTA_CONSULTAR_HANGAR_POR_ID:
			break;
		case VISTA_CONSULTAR_TODOS_HANGARES:
			break;
		case VISTA_MODIFICAR_HANGAR:
			break;

		case ALTA_HANGAR:// HANGAR
			break;
		case BAJA_HANGAR:
			break;
		case CONSULTAR_HANGAR_POR_ID:
			break;
		case CONSULTAR_TODOS_HANGARES:
			break;
		case MODIFICAR_HANGAR:
			break;

		case VISTA_PERSONAL:// VISTA PERSONAL
			break;
		case VISTA_ALTA_PERSONAL:
			break;
		case VISTA_BAJA_PERSONAL:
			break;
		case VISTA_VINCULAR_PERSONAL:
			break;
		case VISTA_DESVINCULAR_PERSONAL:
			break;
		case VISTA_CONSULTAR_PERSONAL_POR_ID:
			break;
		case VISTA_CONSULTAR_PERSONAL_EXISTENTE:
			break;
		case VISTA_MODIFICAR_PERSONAL:
			break;

		case ALTA_PERSONAL:// PERSONAL
			break;
		case BAJA_PERSONAL:
			break;
		case VINCULAR_PERSONAL:
			break;
		case DESVINCULAR_PERSONAL:
			break;
		case CONSULTAR_PERSONAL_POR_ID:
			break;
		case CONSULTAR_PERSONAL_EXISTENTE:
			break;
		case MODIFICAR_PERSONAL:
			break;
		}
	}
}