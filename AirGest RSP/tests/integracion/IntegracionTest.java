package integracion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import integracion.avion.DAOAvionImpTest;
import integracion.modelo.DAOModeloImpTest;
import miscelanea.Utilidades;

public class IntegracionTest {
	
	@Test
	public void modelo_test() {
		Utilidades.esTest();
		Result resultado = JUnitCore.runClasses(DAOModeloImpTest.class);

		String fallo = "";
        for (Failure failure : resultado.getFailures()) 
            fallo += failure.toString()+"\n";

        assertTrue("\nHa fallado: " + "\n" + fallo, resultado.wasSuccessful());
	}
	
	@Test
	public void avion_test() {
		Utilidades.esTest();
		Result resultado = JUnitCore.runClasses(DAOAvionImpTest.class);

		String fallo = "";
        for (Failure failure : resultado.getFailures()) 
            fallo += failure.toString()+"\n";

        assertTrue("\nHa fallado: " + "\n" + fallo, resultado.wasSuccessful());
	}
}
