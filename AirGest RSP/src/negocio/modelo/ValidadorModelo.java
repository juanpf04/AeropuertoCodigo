package negocio.modelo;

public class ValidadorModelo {

	public static boolean comprobarDatosModelo(TModelo tModelo) {
		return comprobarId(tModelo.getId()) && comprobarNombre(tModelo.getNombre()) && comprobarMotor(tModelo.getMotor());
	}

	public static boolean comprobarId(int id) {
		return id > 0;
	}

	public static boolean comprobarNombre(String nombre) {
		return true;
	}

	public static boolean comprobarMotor(String motor) {
		return true;
	}
}