
package negocio.contrato;

import java.awt.List;
import java.time.LocalDate;

public interface SAContrato {
	
	public TCarrito abrirContrato(int id_aerolinea);

	public int cerrarContrato(TCarrito tCarrito);

	public TContrato consultarContratoPorId(int id);

	public List consultarTodosContratos();

	public boolean modificarContrato(int id_contrato);

	public boolean modificarLineaContrato(int id_contrato, int id_hangar, LocalDate fecha_ini, LocalDate fecha_fin);

	public List consultarContratosPorAerolinea(int id_aerolinea);
}