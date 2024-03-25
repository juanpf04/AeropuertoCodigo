package integracion.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import miscelanea.Utilidades;
import negocio.modelo.TModelo;

public class DAOModeloImpTest {

	@Test
	public void modificar_modelo_test() {
		Utilidades.esTest();
		DAOModelo dm = new DAOModeloImp();

		TModelo modelo = new TModelo(1, "pepe", "hola", true);

		assertTrue("Ha leido mal el fichero", dm.modificarModelo(modelo));
	}
	
	@Test
	public void alta_modelo_test() {
		Utilidades.esTest();
		DAOModelo dm = new DAOModeloImp();

		TModelo modelo = new TModelo(0, "pepita", "hola", true);

		assertEquals("No ha devuelto el id correcto", 6, dm.altaModelo(modelo));
	}
}
