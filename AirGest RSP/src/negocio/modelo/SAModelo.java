package negocio.modelo;

import java.util.List;

import negocio.modeloAerolinea.TModeloAerolinea;

public interface SAModelo {

	int altaModelo(TModelo tModelo);

	public boolean bajaModelo(TModelo tModelo);

	public TModelo consultarModelo(TModelo tModelo);

	public List<TModelo> consultarTodosModelos();

	public boolean modificarModelo(TModelo modelo);

	public boolean vincularModelo(TModeloAerolinea tModeloAerolinea);

	public boolean desvincularModelo(TModeloAerolinea tModeloAerolinea);
}