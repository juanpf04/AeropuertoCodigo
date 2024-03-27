package integracion.aerolinea;

import static org.junit.Assert.*;
import org.junit.Test;

import miscelanea.Utilidades;
import negocio.aerolinea.TAerolinea;

public class DAOAerolineaImpTest {
	@Test
	public void leerAerolineaPorIdTest(){
		Utilidades.esTest();
		
		DAOAerolinea da = new DAOAerolineaImp();
		
		TAerolinea ta = da.leerAerolineaPorId(2);
		
		System.out.println(ta);
		
		assertNotNull("No existe aerolinea", ta);
	}
}
