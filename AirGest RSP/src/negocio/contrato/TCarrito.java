
package negocio.contrato;

import java.util.HashSet;
import java.util.Set;
import negocio.lineaContrato.TLineaContrato;

public class TCarrito {
	
	private int id_aerolinea;
	
	private TContrato tContrato;
	
	private Set<TLineaContrato> tLineaContrato;

	
	public TCarrito() {
	
	}

	public TCarrito(int id_aerolinea) {
		this.id_aerolinea = id_aerolinea;
		this.tContrato = new TContrato();
		this.tLineaContrato = new HashSet<>();
	}

	public int getIdAerolinea() {
		return this.id_aerolinea;
	}

	public void setIdAerolinea(int idAerolinea) {
		this.id_aerolinea = idAerolinea;
	}

	public TContrato getContrato() {
		return this.tContrato;
	}

	public void setContrato(TContrato tContrato) {
		this.tContrato = tContrato;
	}
	
	public void anyadirLinea(TLineaContrato linea){
		this.tLineaContrato.add(linea);
	}
}