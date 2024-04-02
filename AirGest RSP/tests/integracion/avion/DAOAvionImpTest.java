package integracion.avion;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import integracion.Utilidades;
import negocio.avion.TAvion;

public class DAOAvionImpTest {
	
	@Test
	public void consultar_aviones_por_modelo_test() {
		Utilidades.esTest();
		DAOAvion da = new DAOAvionImp();
		
		List<TAvion> aviones = da.consultarAvionesPorModelo(1);
		
		assertFalse("crazy", aviones.isEmpty());
	}
	
	@Test
	public void consultar_aviones_activos_por_modelo_test() {
		Utilidades.esTest();
		DAOAvion da = new DAOAvionImp();
		
		List<TAvion> aviones = da.consultarAvionesActivosPorModelo(1);

		assertTrue("crazy", aviones.isEmpty());
	}
}
