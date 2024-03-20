package prueba;

import integracion.modelo.DAOModelo;
import integracion.modelo.DAOModeloImp;
import negocio.modelo.TModelo;

public class Prueba {

	public static void main(String[] args) {
		DAOModelo modelo = new DAOModeloImp();
		
		
		
		System.out.println(modelo.leerModeloPorId(1));
		System.out.println(modelo.modificarModelo(new TModelo(1, true, "pepe", "hola")));
		System.out.println(modelo.leerModeloPorId(1));
	}

}
