package negocio.factoria;

import negocio.avion.SAAvion;
import negocio.avion.SAAvionImp;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}

	public SAAvion crearSAAvion() {
		return new SAAvionImp();
	}
}