
package negocio.aerolinea;


public class ValidadorAerolinea {
	
	public static boolean comprobarAerolinea(TAerolinea tAerolinea) {
		return comprobarNombre(tAerolinea.getNombre());
	}

	public static boolean comprobarId(int id) {
		return id > 0;
	}

	public static boolean comprobarNombre(String nombre) {
		return nombre.matches("[a-zA-Z]+");
	}
}