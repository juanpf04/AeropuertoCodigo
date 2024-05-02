
package negocio.contrato;

public class ValidadorContrato {

	public static boolean comprobarDatos(TContrato tContrato) {
		return tContrato.getIdAerolinea() > 0 && tContrato.getId() > 0 && tContrato.getPrecio() > 0;
	}

	public static boolean comprobarId(int id) {
		return id > 0;
	}
}