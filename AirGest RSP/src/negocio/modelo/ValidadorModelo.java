package negocio.modelo;

public class ValidadorModelo {

	public static boolean comprobarDatosModelo(TModelo tModelo) {
		return comprobarId(tModelo.getId()) && comprobarNombre(tModelo.getNombre())
				&& comprobarMotor(tModelo.getMotor());
	}

	public static boolean comprobarId(int id) {
		return id >= 0;
	}

	public static boolean comprobarNombre(String nombre) {
		return nombre.matches("^[a-zA-Z]+-[0-9]+$"); // ^para que las letras sean al principio, y $ para que los n�meros sean al final
	}

	public static boolean comprobarMotor(String motor) {
		return motor.matches("^[A-Z]{3}+-[0-9]{2}+$"); // 3 letras mayusculas y 2 d�gitos
	}
}