package negocio.hangar;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import integracion.Utilidades;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;
import negocio.modelo.TModelo;

public class SAHangarImpTest {
	private boolean inmodificable = true;
	private int id_inmodificable = 0;

	@Test
	public void alta_modelo_test() {
		Utilidades.esTest();

		SAHangar sh = new SAHangarImp();

		// Prueba exitosa
		THangar hangar = new THangar(id_inmodificable, "kjfhjksa", 4, 50.8, 4, inmodificable);
		File carpeta = new File(Utilidades.ruta("hangar"));
		File[] lista = carpeta.listFiles();
		assertEquals("debería darse de alta el hangar", lista.length + 1, sh.altaHangar(hangar));

		// Fallo por nombre repetido
		hangar = new THangar(id_inmodificable, "kjfhjksa", 4, 50.8, 4, inmodificable);
		assertEquals("un modelo no activo no se puede modificar", -1, sh.altaHangar(hangar));

		// Reactivar hangar exito
		hangar = new THangar(id_inmodificable, "kjfhjksa", 4, 50.8, 4, inmodificable);
		assertEquals("no se puede modificar un modelo que no existe",5, sh.altaHangar(hangar));
	}
}
