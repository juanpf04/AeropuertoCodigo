package negocio;

import static org.junit.Assert.*;

import org.junit.Test;
import negocio.modelo.SAModeloImpTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import miscelanea.Utilidades;

public class NegocioTest {

	
	@Test
	public void modelo_test() {
		Utilidades.esTest();
		Result resultado = JUnitCore.runClasses(SAModeloImpTest.class);

		String fallo = "";
        for (Failure failure : resultado.getFailures()) 
            fallo += failure.toString()+"\n";

        assertTrue("ha fallado "+ fallo, resultado.wasSuccessful());
	}
	
	@Test
	public void avion_test() {
		
	}
}
