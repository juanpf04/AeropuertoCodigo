package negocio.factoria;

import negocio.aerolinea.SAAerolinea;
import negocio.modelo.SAModelo;

public abstract class FactoriaNegocio {

	private static FactoriaNegocio instancia;

	public static FactoriaNegocio getInstance() {
		if (instancia == null)
			instancia = new FactoriaNegocioImp();
		return instancia;
	}

	public abstract SAModelo crearSAModelo();

	
	public abstract SAAerolinea crearSAAerolinea();
}