package negocio.hangar;

import java.awt.List;

import integracion.factoria.FactoriaIntegracion;
import integracion.hangar.DAOHangar;

public class SAHangarImp implements SAHangar {
	
	public int altaHangar(THangar tHangar) {
		if (ValidadorHangar.comprobarDatos(tHangar)) {
			DAOHangar dh = FactoriaIntegracion.getInstance().crearDAOHangar();
			THangar leido = dh.leerHangarPorDireccion(tHangar.getDireccion());

			if (leido == null)
				return dh.altaHangar(tHangar);
			else if (!leido.getActivo()) {
				tHangar.setId(leido.getId());
				dh.modificarHangar(tHangar);
				return tHangar.getId();
			}
		}

		return -1;
	}

	public boolean bajaHangar(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	public THangar consultarHangarPorId(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public List consultarTodosHangares() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public boolean modificarHangar(THangar tHangar) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}
}