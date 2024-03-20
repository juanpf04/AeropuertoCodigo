package integracion.Modelo;

import negocio.Modelo.TModelo;
import java.util.List;

public interface DAOModelo {

	public TModelo leerModeloPorNombre(String nombre);

	public int altaModelo(TModelo tModelo);

	public boolean modificarModelo(TModelo tModelo);

	public boolean bajaModelo(int id);

	public List<TModelo> consultarTodosModelos();

	public boolean vincularModelo(int idModelo, int idAerolinea);

	public boolean desvincularModelo(int idModelo, int idAerolinea);

	public TModelo leerModeloPorId(int id);
}