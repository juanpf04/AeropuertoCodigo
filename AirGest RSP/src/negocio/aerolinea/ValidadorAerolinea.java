
package negocio.aerolinea;


public class ValidadorAerolinea {
	
	public static boolean comprobarAerolinea(TAerolinea tAerolinea) {
		return comprobarId(tAerolinea.getId()) && comprobarNombre(tAerolinea.getNombre());
	}

	public static boolean comprobarId(int id) {
		return id > 0;
	}

	public static boolean comprobarNombre(String nombre) {
		return nombre.matches("^[a-zA-Z]+[0-9]");
	}
}