package negocio.personal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import integracion.Utilidades;
import negocio.personalHangar.TPersonalHangar;

public class SAPersonalTest {

	@Test
	public void altaPersonalTest() {
		Utilidades.esTest();

		SAPersonal sp = new SAPersonalImp();
		TPersonal personal = new TPLimpieza(0, 5, "fsdfds", true, "algo");
		assertEquals("no se puede dar de alta personal con el mismo id empleado", -1, sp.altaPersonal(personal));

	}

	@Test
	public void bajaPersonalTest() {
		Utilidades.esTest();

		SAPersonal sp = new SAPersonalImp();

	}

	@Test
	public void vincularPersonalTest() {
		Utilidades.esTest();

		SAPersonal sp = new SAPersonalImp();
		TPersonalHangar tph = new TPersonalHangar(2, 2);

		// prueba exitosa
		assertTrue("No se han podido vincular", sp.vincularPersonal(tph));

		// prueba ya vinculados
		assertFalse("ya estaban vinulados", sp.vincularPersonal(tph));

		sp.desvincularPersonal(tph); // desvinculamos
	}

	@Test
	public void desvincularPersonalTest() {
		Utilidades.esTest();

		SAPersonal sp = new SAPersonalImp();
		TPersonalHangar tph = new TPersonalHangar(1, 1);

		sp.vincularPersonal(tph); // vinculamos
		
		// prueba exitosa
		assertTrue("No se han podido desvincular", sp.desvincularPersonal(tph));

		// prueba ya vinculados
		assertFalse("ya estaban desvinulados", sp.desvincularPersonal(tph));
	}

	@Test
	public void modificarPersonalTest() {
		Utilidades.esTest();

		SAPersonal sp = new SAPersonalImp();

	}

	@Test
	public void consultarPersonalPorIdTest() {
		Utilidades.esTest();

		SAPersonal sp = new SAPersonalImp();
	}
}
