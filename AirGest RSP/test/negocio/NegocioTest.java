package negocio;

import org.junit.Test;
import negocio.modelo.SAModeloImpTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class NegocioTest {

	
	@Test
	public void modelo_test() {
		Result resultado = JUnitCore.runClasses(SAModeloImpTest.class);

        for (Failure failure : resultado.getFailures()) 
            System.out.println(failure.toString());

        if (resultado.wasSuccessful()) 
            System.out.println("Todos los tests han pasado.");
	}
	
	@Test
	public void avion_test() {
		
	}
}
