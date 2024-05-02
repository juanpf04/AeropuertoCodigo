package negocio.aerolinea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Test;

import integracion.Utilidades;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public class SAAerolineaImpTest {

	private boolean inmodificable = true;
	private int id_inmodificable = 0;
	
	/*@Test
	public void alta_aerolinea_test() {
		Utilidades.esTest();

		SAAerolinea sa = new SAAerolineaImp();

		// Prueba exitosa
		TAerolinea aerolinea = new TAerolinea(id_inmodificable, "dos", inmodificable);
		File carpeta = new File(Utilidades.ruta("aerolinea"));
		File[] lista = carpeta.listFiles();
	assertEquals("debería darse de alta la aerolinea", lista.length + 1, sa.altaAerolinea(aerolinea));
		aerolinea = new TAerolinea(id_inmodificable, "tres", inmodificable);
		assertEquals("debería darse de alta la aerolinea", lista.length + 1, sa.altaAerolinea(aerolinea));
		aerolinea = new TAerolinea(id_inmodificable, "cuatro", inmodificable);
		assertEquals("debería darse de alta la aerolinea", lista.length + 1, sa.altaAerolinea(aerolinea));
		
		// Fallo por nombre repetido
		aerolinea = new TAerolinea(id_inmodificable, "dos",  inmodificable);
		assertEquals("una aerolinea no se puede dar de alta con nombre repetido", -1, sa.altaAerolinea(aerolinea));

		// Reactivar aerolinea exito
		aerolinea = new TAerolinea(id_inmodificable, "uno", inmodificable);
		assertEquals("reactiva una existente ", 1 , sa.altaAerolinea(aerolinea));
		
		//despues de esto estan TODAS activas
	}*/
	
	
	@Test
	public void modificar_aerolinea_test() {
		Utilidades.esTest();

		SAAerolinea sa = new SAAerolineaImp();

		// Prueba exitosa
		TAerolinea aerolinea = new TAerolinea(1, "unoMODIFICADOotravezzz",  inmodificable);
		assertTrue("debería modificarse aerolinea", sa.modificarAerolinea(aerolinea));

		// Fallo por aerolinea no activa
		aerolinea = new TAerolinea(2, "mondongo", inmodificable);
		assertTrue("una aerolinea no activa no se puede modificar", sa.modificarAerolinea(aerolinea));

		// Fallo id no existente
		aerolinea = new TAerolinea(200, "2cientos", inmodificable);
		assertFalse("no se puede modificar una aerolinea que no existe", sa.modificarAerolinea(aerolinea));

		// Fallo nombre existente
		aerolinea = new TAerolinea(1, "tres", inmodificable);
		assertFalse("Se ha modificado la aerolinea, al estar el nombre repetido, no debería dejar",
				sa.modificarAerolinea(aerolinea));
	}
	
	@Test
	public void baja_aerolinea_test() {
		Utilidades.esTest();

		SAAerolinea sa = new SAAerolineaImp();

		//Prueba exitosa
		assertTrue("se deberia poder dar de baja", sa.bajaAerolinea(3));
		
		//Prueba id inexistente
		assertFalse("no existe una aerolinea con id20", sa.bajaAerolinea(20));
		
		//Prueba aerolinea ya inactiva
		assertFalse("la aerolinea ya estaba inactivo", sa.bajaAerolinea(4));
		
		// Prueba avion activo
		assertFalse("No se puede dar de baja aerolinea con aviones activos", sa.bajaAerolinea(1));
		
		//Prueba contrato activo
		assertFalse("No se puede dar de baja aerolinea con contratos activos", sa.bajaAerolinea(2));
		
	}


}
