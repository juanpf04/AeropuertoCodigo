package integracion.avion;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import miscelanea.Utilidades;
import negocio.avion.TAvion;

public class DAOAvionImpTest {
	
	@Test
	public void consultar_aviones_por_modelo_test() {
		Utilidades.esTest();
		DAOAvion da = new DAOAvionImp();
		
		List<TAvion> avion = da.consultarAvionesPorModelo(1);
		for(TAvion a : avion){
			System.out.println(a);
			System.out.println("\n");
		}
		assertFalse("crazy", avion.isEmpty());
	}
	
	@Test
	public void consultar_aviones_activos_por_modelo_test() {
		Utilidades.esTest();
		DAOAvion da = new DAOAvionImp();
		
		List<TAvion> aviones = da.consultarAvionesActivosPorModelo(1);
		for(TAvion a : aviones){
			System.out.println(a);
		}
		assertTrue("crazy", aviones.isEmpty());
	}
}
