package negocio.factoria;

import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}
}