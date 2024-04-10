package negocio.factoria;

import negocio.aerolinea.SAAerolinea;
import negocio.aerolinea.SAAerolineaImp;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}

	
	public SAAerolinea crearSAAerolinea() {
		return new SAAerolineaImp();
	}
}