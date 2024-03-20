package integracion.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import negocio.modelo.TModelo;

public class DAOModeloImpTest {

	@Test
	public void modificar_modelo_test() {
		DAOModelo dm = new DAOModeloImp();

		TModelo modelo = new TModelo(1, "pepe", "hola", true);

		assertTrue("Ha leido mal el fichero", dm.modificarModelo(modelo));
	}
}
