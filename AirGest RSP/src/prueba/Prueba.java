package prueba;

import integracion.modelo.DAOModelo;
import integracion.modelo.DAOModeloImp;
import negocio.modelo.TModelo;

public class Prueba {

	public static void main(String[] args) {
		DAOModelo modelo = new DAOModeloImp();
		
		modelo.altaModelo(new TModelo(-1, true, "blavla", "v8"));
		
		TModelo tranfer = modelo.leerModeloPorId(4);
		
		System.out.println(tranfer);
	}

}
