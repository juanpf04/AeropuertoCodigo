package negocio.avion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import integracion.Utilidades;

public class ValidadorAvionTest {

	private boolean noImporta = true;

	@Test
	public void comprobar_datos_test() {
		Utilidades.esTest();

		assertTrue("Avion comercial correcto", ValidadorAvion.comprobarDatos(new TAComercial(0, 80,
				LocalDate.of(2000, 6, 22), "avionComercial", "42434wjs", noImporta, 1, 1, 1, 10)));

		assertTrue("Avion privado correcto", ValidadorAvion.comprobarDatos(new TAPrivado(0, 8,
				LocalDate.of(2000, 6, 22), "avionPrivado", "42434wjs", noImporta, 1, 1, 1, "charlie", 23423)));
	}

	@Test
	public void comprobar_id_test() {
		Utilidades.esTest();

		assertTrue(" id 1 deberia ser valido", ValidadorAvion.comprobarId(1));
		assertFalse("no puede tener id 0", ValidadorAvion.comprobarId(0));
		assertFalse("no puede tener id negativo", ValidadorAvion.comprobarId(-1));
	}
}
