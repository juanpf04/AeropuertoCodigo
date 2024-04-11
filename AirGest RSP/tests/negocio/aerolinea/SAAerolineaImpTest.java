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
import negocio.modelo.TModelo;

public class SAAerolineaImpTest {

	private boolean inmodificable = true;
	private int id_inmodificable = 0;
	
	@Test
	public void alta_aerolinea_test() {
		Utilidades.esTest();

		SAAerolinea sa = new SAAerolineaImp();

		// Prueba exitosa
		TAerolinea aerolinea = new TAerolinea(id_inmodificable, "UNo", inmodificable);
		File carpeta = new File(Utilidades.ruta("aerolinea"));
		File[] lista = carpeta.listFiles();
		assertEquals("debería darse de alta la aerolinea", lista.length + 1, sa.altaAerolinea(aerolinea));

		// Fallo por nombre repetido
		aerolinea = new TAerolinea(id_inmodificable, "UNo",  inmodificable);
		assertEquals("una aerolinea no activa no se puede modificar", -1, sa.altaAerolinea(aerolinea));

		// Reactivar modelo exito
		aerolinea = new TAerolinea(id_inmodificable, "Dos", inmodificable);
		assertEquals("no se puede modificar un modelo que no existe",6, sa.altaAerolinea(aerolinea));
	}
	
	@Test
	public void modificar_aerolinea_test() {
		Utilidades.esTest();

		SAAerolinea sa = new SAAerolineaImp();

		// Prueba exitosa
		TAerolinea aerolinea = new TAerolinea(1, "UNo",  inmodificable);
		assertTrue("debería modificarse modelo", sa.modificarAerolinea(aerolinea));

		// Fallo por modelo no activo
		aerolinea = new TAerolinea(2, "Dos", inmodificable);
		assertFalse("un modelo no activo no se puede modificar", sa.modificarAerolinea(aerolinea));

		// Fallo id no existente
		aerolinea = new TAerolinea(200, "2cientos", inmodificable);
		assertFalse("no se puede modificar un modelo que no existe", sa.modificarAerolinea(aerolinea));

		// Fallo nombre existente
		aerolinea = new TAerolinea(5, "Dos", inmodificable);
		assertFalse("Se ha modificado el modelo, al estar el nombre repetido, no debería dejar",
				sa.modificarAerolinea(aerolinea));
	}
	

	
}
