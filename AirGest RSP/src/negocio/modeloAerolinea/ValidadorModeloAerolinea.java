
package negocio.modeloAerolinea;

public class ValidadorModeloAerolinea {
	public static boolean comprobarDatos(int idModelo, int idAerolinea) {
		return idModelo > 0 && idAerolinea > 0;
	}
}