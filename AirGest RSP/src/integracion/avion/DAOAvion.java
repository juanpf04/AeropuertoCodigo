package integracion.avion;

import java.util.List;

import negocio.avion.TAvion;

public interface DAOAvion {

	public List<TAvion> consultarAvionesPorModelo(int idModelo);

	public List<TAvion> consultarAvionesActivosPorModelo(int idModelo);
}