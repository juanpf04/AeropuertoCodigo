package negocio.personalHangar;

public class ValidadorPersonalHangar {

	public static boolean comprobarDatos(TPersonalHangar tPersonalHangar) {
		return tPersonalHangar.getIdHangar() > 0 && tPersonalHangar.getIdPersonal() > 0;
	}
}