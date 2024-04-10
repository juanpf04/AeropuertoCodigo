package negocio.factoria;

import negocio.hangar.SAHangar;
import negocio.hangar.SAHangarImp;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}

	@Override
	public SAHangar crearSAHangar() {
		return new SAHangarImp();
	}
}