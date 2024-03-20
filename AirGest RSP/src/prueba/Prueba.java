package prueba;

import integracion.modelo.DAOModelo;
import integracion.modelo.DAOModeloImp;
import negocio.modelo.TModelo;

public class Prueba {

	public static void main(String[] args) {
		DAOModelo modelo = new DAOModeloImp();
		
		TModelo tranfer = modelo.leerModeloPorId(1);
		
		System.out.println(tranfer.getMotor());
	}

}
