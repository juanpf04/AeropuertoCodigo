
package negocio.modeloAerolinea;

public class ValidadorModeloAerolinea {
	public static boolean comprobarDatosModeloAerolinea(int idModelo, int idAerolinea) {
		return idModelo > 0 && idAerolinea > 0;
	}
}