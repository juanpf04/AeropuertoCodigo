package negocio.contrato;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.*;
import integracion.Utilidades;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;
import negocio.modelo.TModelo;

public class SAContratoImpTest {
	private boolean inmodificable = true;
	private int id_inmodificable = 0;
	
	@Test
	public void modificar_contrato_test() {
		Utilidades.esTest();

		SAContrato sc = new SAContratoImp();

		// Prueba exitosa
		TContrato contrato = new TContrato(1, 6, 346.7);
		assertTrue("debería modificarse contrato", sc.modificarContrato(contrato));
		
		// Prueba aerolinea no existente
		contrato = new TContrato(1, 9, 346.7);
		assertFalse("no existe la aerolinea 9", sc.modificarContrato(contrato));
		
		// Prueba aerolinea no activa
		contrato = new TContrato(1, 5, 456.3);
		assertFalse("la aerolinea 5 no está activa", sc.modificarContrato(contrato));
	}
	
	@Test
	public void consultar_contrato_por_id(){
		Utilidades.esTest();
		
		SAContrato sc = new SAContratoImp();
		
		// Prueba exitosa
		TInfoContrato info = sc.consultarContratoPorId(1);
		assertEquals("el toa deberia tener 4 hangares", 4, info.getHangares().size());
		
		// Prueba contrato no existente
		info = sc.consultarContratoPorId(4);
		assertNull("no existe el contrato 4", info);
	}
}
