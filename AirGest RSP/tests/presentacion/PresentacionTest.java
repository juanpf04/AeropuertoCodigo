package presentacion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import miscelanea.Utilidades;
import presentacion.modelo.VistasModeloTest;


public class PresentacionTest {

	@Test
	public void modelo_test() {
		Utilidades.esTest();
		Result resultado = JUnitCore.runClasses(VistasModeloTest.class);

		String fallo = "";
        for (Failure failure : resultado.getFailures()) 
            fallo += failure.toString()+"\n";

        assertTrue("\nHa fallado: " + "\n" + fallo, resultado.wasSuccessful());
	}
	
	@Test
	public void avion_test() {
		
	}
}
