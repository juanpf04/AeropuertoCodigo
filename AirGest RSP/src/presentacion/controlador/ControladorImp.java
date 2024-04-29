
package presentacion.controlador;

import java.util.List;

import negocio.aerolinea.SAAerolinea;
import negocio.aerolinea.TAerolinea;
import negocio.contrato.SAContrato;
import negocio.contrato.TCarrito;
import negocio.contrato.TContrato;
import negocio.contrato.TInfoContrato;
import negocio.factoria.FactoriaNegocio;
import negocio.hangar.SAHangar;
import negocio.hangar.THangar;
import negocio.lineaContrato.TLineaContrato;
import negocio.modelo.SAModelo;
import negocio.modelo.TModelo;
import negocio.modeloAerolinea.TModeloAerolinea;
import presentacion.factoria.FactoriaPresentacion;
import presentacion.Observador;

public class ControladorImp extends Controlador {

	/** 
	* (non-Javadoc)
	* @see Controlador#accion(Enum evento, Object datos)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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
		SAHangar sh;
		SAAerolinea sa;
		SAContrato sc;
		Observador vista = null;
		TCarrito carrito;
		boolean exito;

		switch (evento) {

		case VISTA_PRINCIPAL:// VISTA GENERAL
			vista = fp.CrearVistaPrincipal();
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

		case VISTA_AVION:// VISTA AVI�N
			break;
		case VISTA_ALTA_AVION:
			break;
		case VISTA_BAJA_AVION:
			break;
		case VISTA_CONSULTAR_AVION_POR_ID:
			break;
		case VISTA_CONSULTAR_TODOS_AVIONES:
			break;
		case VISTA_MODIFICAR_AVION:
			break;
		case VISTA_MOSTRAR_AVIONES_POR_MODELO:
			break;
		case VISTA_MOSTRAR_AVIONES_POR_AEROLINEA:
			break;
		case VISTA_MOSTRAR_AVIONES_POR_HANGAR:
			break;

		case ALTA_AVION:// AVI�N
			break;
		case BAJA_AVION:
			break;
		case CONSULTAR_AVION_POR_ID:
			break;
		case CONSULTAR_TODOS_AVIONES:
			break;
		case MODIFICAR_AVION:
			break;
		case MOSTRAR_AVIONES_POR_MODELO:
			break;
		case MOSTRAR_AVIONES_POR_AEROLINEA:
			break;
		case MOSTRAR_AVIONES_POR_HANGAR:
			break;

		case VISTA_AEROLINEA:// VISTA AEROL�NEA
			vista = fp.crearVistaAerolinea();
			vista.actualizaVista(null);
			break;
		case VISTA_ALTA_AEROLINEA:
			vista = fp.crearVistaAltaAerolinea();
			vista.actualizaVista(null);
			break;
		case VISTA_BAJA_AEROLINEA:
			vista = fp.crearVistaBajaAerolinea();
			vista.actualizaVista(null);
			break;
		case VISTA_CONSULTAR_AEROLINEA_POR_ID:
			vista = fp.crearVistaConsultarAerolineaPorId();
			vista.actualizaVista(null);
			break;
		/*case VISTA_CONSULTAR_TODOS_AEROLINEAS:
			vista = fp.crearVistaConsultarTodasAerolineas();
			vista.actualizaVista(null);
			break;*/
		case VISTA_MODIFICAR_AEROLINEA:
			vista = fp.crearVistaModificarAerolinea();
			vista.actualizaVista(null);
			break;

		case ALTA_AEROLINEA:// AEROL�NEA
			sa = fn.crearSAAerolinea();
			int id_aerolinea = sa.altaAerolinea((TAerolinea) datos);

			if (id_aerolinea != -1) {
				vista = fp.crearVistaExitoAltaAerolinea();
				vista.actualizaVista(id_aerolinea);
			} else {
				vista = fp.crearVistaFalloAltaAerolinea();
				vista.actualizaVista(null);
			}
			break;
		case BAJA_AEROLINEA:
			sa = fn.crearSAAerolinea();
			exito = sa.bajaAerolinea((int) datos);

			if (exito)
				vista = fp.crearVistaExitoBajaAerolinea();
			else
				vista = fp.crearVistaFalloBajaAerolinea();

			vista.actualizaVista(null);
			break;
		case CONSULTAR_AEROLINEA_POR_ID:
			sa = fn.crearSAAerolinea();
			TAerolinea aerolinea = sa.consultarAerolineaPorId((int) datos);
			vista = fp.crearVistaResultadoConsultarAerolineaPorId();
			vista.actualizaVista(aerolinea);
			break;
		case CONSULTAR_TODOS_AEROLINEAS:
			sa = fn.crearSAAerolinea();
			List<TAerolinea> aerolineas = sa.consultarTodasAerolineas();
			vista = fp.crearVistaResultadoConsultarTodasAerolineas();
			vista.actualizaVista(aerolineas);
			break;
		case MODIFICAR_AEROLINEA:
			sa = fn.crearSAAerolinea();
			exito = sa.modificarAerolinea((TAerolinea) datos);

			if (exito)
				vista = fp.crearVistaExitoModificarAerolinea();
			else
				vista = fp.crearVistaFalloModificarAerolinea();

			vista.actualizaVista(null);

			break;

		case VISTA_CONTRATO:// VISTA CONTRATO
			vista = fp.crearVistaContrato();
			vista.actualizaVista(null);
			break;
		case VISTA_ABRIR_CONTRATO:
			vista = fp.crearVistaAbrirContrato();
			vista.actualizaVista(null);
			break;
		case VISTA_ANYADIR_HANGAR_AL_CONTRATO:
			vista = fp.crearVistaA�adirHangar();
			vista.actualizaVista(datos);
			break;
		case VISTA_ELIMINAR_HANGAR_DEL_CONTRATO:
			vista = fp.crearVistaEliminarHangar();
			vista.actualizaVista(datos);
			break;
		case VISTA_CONSULTAR_CONTRATO_POR_ID:
			vista = fp.crearVistaConsultarContratoPorId();
			vista.actualizaVista(null);
			break;
		case VISTA_CONSULTAR_TODOS_CONTRATOS:
			break;
		case VISTA_MODIFICAR_CONTRATO:
			vista = fp.crearVistaModificarContrato();
			vista.actualizaVista(null);
			break;
		case VISTA_MODIFICAR_LINEA_CONTRATO:
			vista = fp.crearVistaModificarLineaContrato();
			vista.actualizaVista(null);
			break;
		case VISTA_MOSTRAR_CONTRATOS_POR_AEROLINEA:
			vista = fp.crearVistaConsultarContratoPorAerolinea();
			vista.actualizaVista(null);
			break;
		case VISTA_CARRITO:
			vista = fp.crearVistaCarrito();
			vista.actualizaVista(datos);
			break;

		case ABRIR_CONTRATO:// CONTRATO
			sc = fn.crearSAContrato();
			carrito = sc.abrirContrato((int) datos);
			vista = fp.crearVistaCarrito();
			vista.actualizaVista(carrito);
			break;
		case CERRAR_CONTRATO:
			sc = fn.crearSAContrato();
			carrito = (TCarrito) datos;
			id = sc.cerrarContrato(carrito);
			if (id != -1){
				vista = fp.crearVistaExitoCerrarContrato();
				vista.actualizaVista(id);
			} else{
				vista = fp.crearVistaFalloCerrarContrato();
				vista.actualizaVista(null);
			}
			break;
		case CONSULTAR_CONTRATO_POR_ID:
			sc = fn.crearSAContrato();
			TInfoContrato contrato = sc.consultarContratoPorId((int) datos);
			vista = fp.crearVistaResultadoConsultarContratoPorid();
			vista.actualizaVista(contrato);
			break;
		case CONSULTAR_TODOS_CONTRATOS:
			sc = fn.crearSAContrato();
			List<TContrato> contratos = sc.consultarTodosContratos();
			vista = fp.crearVistaResultadoConsultarTodosContratos();
			vista.actualizaVista(contratos);
			break;
		case MODIFICAR_CONTRATO:
			sc = fn.crearSAContrato();
			if (sc.modificarContrato((TContrato)datos)){
				vista = fp.crearVistaExitoModificarContrato();
			} else{
				vista = fp.crearVistaFalloModificarContrato();
			}
			vista.actualizaVista(null);
			break;
		case MODIFICAR_LINEA_CONTRATO:
			sc = fn.crearSAContrato();
			if (sc.modificarLineaContrato((TLineaContrato) datos)){
				vista = fp.crearVistaExitoModificarLineaContrato();
			} else{
				vista = fp.crearVistaFalloModificarLineaContrato();
			}
			vista.actualizaVista(null);
			break;
		case MOSTRAR_CONTRATOS_POR_AEROLINEA:
			sc = fn.crearSAContrato();
			List<TContrato> cs = sc.consultarContratosPorAerolinea((int)datos);
			vista = fp.crearVistaResultadoConsultarContratosPorAerolinea();
			vista.actualizaVista(cs);
			break;

		case VISTA_HANGAR:// VISTA HANGAR
			vista = fp.crearVistaHangar();
			vista.actualizaVista(null);
			break;
		case VISTA_ALTA_HANGAR:
			vista = fp.crearVistaAltaHangar();
			vista.actualizaVista(null);
			break;
		case VISTA_BAJA_HANGAR:
			vista = fp.crearVistaBajaHangar();
			vista.actualizaVista(null);
			break;
		case VISTA_CONSULTAR_HANGAR_POR_ID:
			vista = fp.crearVistaConsultarHangarPorId();
			vista.actualizaVista(null);
			break;
		//		case VISTA_CONSULTAR_TODOS_HANGARES: ESTO EN LA PROPOA DE CONSUTAR TODOS HANGARES
		//			vista = fp.crearVistaResultadoConsultarTodosHangares();
		//			vista.actualizaVista(null);
		//			break;
		case VISTA_MODIFICAR_HANGAR:
			vista = fp.crearVistaModificarHangar();
			vista.actualizaVista(null);
			break;

		case ALTA_HANGAR:// HANGAR
			sh = fn.crearSAHangar();
			int idh = sh.altaHangar((THangar) datos);

			if (idh != -1) {
				vista = fp.crearVistaExitoAltaHangar();
				vista.actualizaVista(idh);
			} else {
				vista = fp.crearVistaFalloAltaHangar();
				vista.actualizaVista(null);
			}
			break;
		case BAJA_HANGAR:
			sh = fn.crearSAHangar();
			exito = sh.bajaHangar((int) datos);

			if (exito)
				vista = fp.crearVistaExitoBajaHangar();
			else
				vista = fp.crearVistaFalloBajaHangar();

			vista.actualizaVista(null);

			break;
		case CONSULTAR_HANGAR_POR_ID:
			sh = fn.crearSAHangar();
			THangar hangar = sh.consultarHangarPorId((int) datos);
			vista = fp.crearVistaResultadoConsultarHangarPorId();
			vista.actualizaVista(hangar);

			break;
		case CONSULTAR_TODOS_HANGARES:
			sh = fn.crearSAHangar();
			List<THangar> hangares = sh.consultarTodosHangares();
			vista = fp.crearVistaResultadoConsultarTodosHangares();
			vista.actualizaVista(hangares);

			break;
		case MODIFICAR_HANGAR:
			sh = fn.crearSAHangar();
			exito = sh.modificarHangar((THangar) datos);

			if (exito)
				vista = fp.crearVistaExitoModificarHangar();
			else
				vista = fp.crearVistaFalloModificarHangar();

			vista.actualizaVista(null);

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