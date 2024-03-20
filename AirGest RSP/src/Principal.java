import integracion.Modelo.DAOModelo;
import integracion.Modelo.DAOModeloImp;
import negocio.Modelo.TModelo;

public class Principal {

	public static void main(String[] args) {
		DAOModelo modelo = new DAOModeloImp();
		
		TModelo tranfer = modelo.leerModeloPorId(1);
		
		System.out.println(tranfer.getMotor());
	}

}
