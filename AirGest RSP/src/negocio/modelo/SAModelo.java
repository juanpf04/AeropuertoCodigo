package negocio.modelo;

import java.util.List;

public interface SAModelo {

	int altaModelo(TModelo tModelo);

	public boolean bajaModelo(int id);

	public TModelo consultarModelo(int id);

	public List<TModelo> consultarTodosModelos();

	public boolean modificarModelo(TModelo modelo);

	public boolean vincularModelo(int idModelo, int idAerolinea);

	public boolean desvincularModelo(int idModelo, int idAerolinea);
}