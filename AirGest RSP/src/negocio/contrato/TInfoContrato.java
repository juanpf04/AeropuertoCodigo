
package negocio.contrato;

import negocio.aerolinea.TAerolinea;
import java.util.List;
import java.util.HashMap;
import negocio.hangar.THangar;
import negocio.lineaContrato.TLineaContrato;

public class TInfoContrato {

	private TContrato contrato;

	private TAerolinea aerolinea;

	private List<TLineaContrato> lineasContrato;

	private HashMap<Integer,THangar> hangares;
	
	public TInfoContrato(){

	}

	public TInfoContrato(TContrato contrato, TAerolinea aerolinea, List<TLineaContrato> lineasContrato, HashMap<Integer, THangar> hangares) {
		this.contrato = contrato;
		this.aerolinea = aerolinea;
		this.lineasContrato = lineasContrato;
		this.hangares = hangares;
	}

	public TContrato getContrato() {
		return this.contrato;
	}

	public TAerolinea getAerolinea() {
		return this.aerolinea;
	}

	public List<TLineaContrato> getLineasContrato() {
		return this.lineasContrato;
	}

	public HashMap<Integer, THangar> getHangares() {
		return this.hangares;
	}

	public void setContrato(TContrato tContrato) {
		this.contrato = tContrato;
	}

	public void setAerolinea(TAerolinea tAerolinea) {
		this.aerolinea = tAerolinea;
	}

	public void setLineasContrato(List<TLineaContrato> lineasContrato) {
		this.lineasContrato = lineasContrato;
	}

	public void setHangares(HashMap<Integer, THangar> hangares) {
		this.hangares = hangares;
	}
}