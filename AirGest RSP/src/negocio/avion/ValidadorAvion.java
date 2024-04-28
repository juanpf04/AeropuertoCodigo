package negocio.avion;

public class ValidadorAvion {

	public static boolean comprobarDatos(TAvion tAvion) {
		return tAvion != null; // TODO
	}

	public static boolean comprobarId(int idAvion) {
		return idAvion > 0;
	}
}