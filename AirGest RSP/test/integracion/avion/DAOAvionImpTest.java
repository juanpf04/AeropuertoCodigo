package integracion.avion;

import static org.junit.Assert.*;
import org.junit.Test;
import miscelanea.Utilidades;

public class DAOAvionImpTest {
	
	@Test
	public void consultar_aviones_por_modelo_test() {
		Utilidades.esTest();
		DAOAvion da = new DAOAvionImp();
		
	}
}
