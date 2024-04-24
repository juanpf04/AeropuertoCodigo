package integracion.personal;

import negocio.personal.TPersonal;
import java.util.List;

public interface DAOPersonal {

	public int AltaPersonal(TPersonal tPersonal);

	public boolean BajaPersonal(int id);

	public boolean ModificarPersonal(TPersonal tPersonal);

	public TPersonal ConsultarPersonalPorId(int id);

	public List<TPersonal> ConsultarPersonalExistente();
}