package negocio.factoria;

import negocio.hangar.SAHangar;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public abstract class FactoriaNegocio {

	private static FactoriaNegocio instancia;

	public static FactoriaNegocio getInstance() {
		if (instancia == null)
			instancia = new FactoriaNegocioImp();
		return instancia;
	}

	public abstract SAModelo crearSAModelo();

	public abstract SAHangar crearSAHangar();
}