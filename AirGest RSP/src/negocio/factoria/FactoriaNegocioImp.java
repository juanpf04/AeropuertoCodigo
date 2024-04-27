package negocio.factoria;

import negocio.hangar.SAHangar;
import negocio.hangar.SAHangarImp;
import negocio.aerolinea.SAAerolinea;
import negocio.aerolinea.SAAerolineaImp;
import negocio.avion.SAAvion;
import negocio.avion.SAAvionImp;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;
import negocio.personal.SAPersonal;
import negocio.personal.SAPersonalImp;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}

	public SAAvion crearSAAvion() {
		return new SAAvionImp();
	}

	@Override
	public SAHangar crearSAHangar() {
		return new SAHangarImp();
	}

	public SAAerolinea crearSAAerolinea() {
		return new SAAerolineaImp();
	}

	public SAPersonal crearSAPersonal() {
		return new SAPersonalImp();
	}
}