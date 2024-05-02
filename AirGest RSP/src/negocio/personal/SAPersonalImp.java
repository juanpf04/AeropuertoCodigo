package negocio.personal;

import negocio.hangar.THangar;
import negocio.personalHangar.TPersonalHangar;
import negocio.personalHangar.ValidadorPersonalHangar;

import java.util.List;

import integracion.factoria.FactoriaIntegracion;
import integracion.hangar.DAOHangar;
import integracion.personal.DAOPersonal;
import integracion.personalHangar.DAOPersonalHangar;

public class SAPersonalImp implements SAPersonal {

	@Override
	public int altaPersonal(TPersonal tPersonal) {
		if(ValidadorPersonal.comprobarDatos(tPersonal)){
			DAOPersonal dp = FactoriaIntegracion.getInstance().crearDAOPersonal();
			TPersonal leido = dp.ConsultarPersonalPorIdEmpleado(tPersonal.getIdEmpleado());
			if(leido == null)
				return dp.AltaPersonal(tPersonal);
			else if (!leido.getActivo()){
				tPersonal.setId(leido.getId());
				if(dp.ModificarPersonal(tPersonal))
					return tPersonal.getId();
			}
		}
		
		return -1;
	}

	@Override
	public boolean bajaPersonal(int id) {
		if (ValidadorPersonal.comprobarId(id)) {
			DAOPersonal dp = FactoriaIntegracion.getInstance().crearDAOPersonal();

			TPersonal leido = dp.ConsultarPersonalPorId(id);

			if (leido != null && leido.getActivo()) {
				return dp.BajaPersonal(id);
			}
		}

		return false;
	}

	@Override
	public boolean vincularPersonal(TPersonalHangar tPersonalHangar) {
		int idPersonal = tPersonalHangar.getIdPersonal();
		int idHangar = tPersonalHangar.getIdHangar();

		if (ValidadorPersonalHangar.comprobarDatos(tPersonalHangar)) {
			DAOPersonal dp = FactoriaIntegracion.getInstance().crearDAOPersonal();
			DAOHangar dh = FactoriaIntegracion.getInstance().crearDAOHangar();

			TPersonal pLeido = dp.ConsultarPersonalPorId(idPersonal);
			THangar hLeida = dh.leerHangarPorId(idHangar);

			if (pLeido != null && pLeido.getActivo() && hLeida != null && hLeida.getActivo()) {
				DAOPersonalHangar dph = FactoriaIntegracion.getInstance().crearDAOPersonalHangar();

				if (!dph.comprobarVinculacion(idPersonal, idHangar)) {
					return dph.vincular(idPersonal, idHangar);
				}
			}
		}

		return false;
	}

	@Override
	public boolean desvincularPersonal(TPersonalHangar tPersonalHangar) {
		int idPersonal = tPersonalHangar.getIdPersonal();
		int idHangar = tPersonalHangar.getIdHangar();

		if (ValidadorPersonalHangar.comprobarDatos(tPersonalHangar)) {
			DAOPersonal dp = FactoriaIntegracion.getInstance().crearDAOPersonal();
			DAOHangar dh = FactoriaIntegracion.getInstance().crearDAOHangar();

			TPersonal pLeido = dp.ConsultarPersonalPorId(idPersonal);
			THangar hLeida = dh.leerHangarPorId(idHangar);

			if (pLeido != null && pLeido.getActivo() && hLeida != null && hLeida.getActivo()) {
				DAOPersonalHangar dph = FactoriaIntegracion.getInstance().crearDAOPersonalHangar();

				if (dph.comprobarVinculacion(idPersonal, idHangar)) {
					return dph.desvincular(idPersonal, idHangar);
				}
			}
		}

		return false;
	}

	@Override
	public boolean modificarPersonal(TPersonal tPersonal) {
		if (ValidadorPersonal.comprobarId(tPersonal.getId()) && ValidadorPersonal.comprobarDatos(tPersonal)) {
			DAOPersonal dp = FactoriaIntegracion.getInstance().crearDAOPersonal();
			int id = tPersonal.getId();
			int idEmpleado = tPersonal.getIdEmpleado();

			TPersonal leido = dp.ConsultarPersonalPorId(id);

			if (leido != null) {
				if (leido.getActivo() && (leido.getIdEmpleado() == idEmpleado || dp.ConsultarPersonalPorIdEmpleado(idEmpleado) == null)) {
					return dp.ModificarPersonal(tPersonal);
				}
			}
		}
		return false;
	}

	@Override
	public TPersonal consultarPersonalPorId(int id) {
		if (ValidadorPersonal.comprobarId(id)) {
			DAOPersonal dp = FactoriaIntegracion.getInstance().crearDAOPersonal();

			return dp.ConsultarPersonalPorId(id);
		}

		return null;
	}

	@Override
	public List<TPersonal> consultarPersonalExistente() {
		DAOPersonal dp = FactoriaIntegracion.getInstance().crearDAOPersonal();
		return dp.ConsultarPersonalExistente();
	}
}