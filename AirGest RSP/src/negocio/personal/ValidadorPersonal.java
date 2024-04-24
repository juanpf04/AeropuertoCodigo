package negocio.personal;

public class ValidadorPersonal {

	public static boolean comprobarDatos(TPersonal tPersonal) {
		return true;
	}

	public static boolean comprobarId(int id) {
		return id > 0;
	}
}