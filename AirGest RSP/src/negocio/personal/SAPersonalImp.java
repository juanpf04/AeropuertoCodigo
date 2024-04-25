package negocio.personal;

import negocio.personalHangar.TPersonalHangar;
import java.util.List;

public class SAPersonalImp implements SAPersonal {

	@Override
	public int altaPersonal(TPersonal tPersonal) {
		if(ValidadorPersonal.comprobarDatos(tPersonal)){
			
			
		}
		
		return -1;
	}

	@Override
	public boolean bajaPersonal(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	@Override
	public boolean vincularPersonal(TPersonalHangar tPersonalHangar) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	@Override
	public boolean desvincularPersonal(TPersonalHangar tPersonalHangar) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	@Override
	public boolean modificarPersonal(TPersonal tPersonal) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	@Override
	public TPersonal consultarPersonalPorId(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	@Override
	public List<TPersonal> consultarPersonalExistente() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}