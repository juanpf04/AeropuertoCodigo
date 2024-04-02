package integracion.modeloAerolinea;

import org.junit.Test;

import integracion.Utilidades;

import static org.junit.Assert.*;

public class DAOModeloAerolineaImpTest {

	@Test
	public void comprobarVinculacionTest() {
		Utilidades.esTest();
		DAOModeloAerolinea dma = new DAOModeloAerolineaImp();

		assertTrue("No existe vinculación", dma.comprobarVinculacion(1, 1));
	}

	@Test
	public void vincular() {
		Utilidades.esTest();
		DAOModeloAerolinea dma = new DAOModeloAerolineaImp();

		assertTrue("No se ha podido vincular", dma.vincular(2, 2));
	}

	@Test
	public void desvincular() {
		Utilidades.esTest();
		DAOModeloAerolinea dma = new DAOModeloAerolineaImp();

		assertTrue("No se ha podido desvincular", dma.desvincular(2, 2));
	}
}
