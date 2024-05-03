package negocio.personal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import integracion.UtilidadesI;

public class ValidadorPersonalTest {

	@Test
	public void comprobarDatosTest() {
		UtilidadesI.esTest();

		TPersonal personal;

		personal = new TPSeguridad(0, 5423, "c�maras", true, 56);
		assertTrue("deber�a ser valido", ValidadorPersonal.comprobarDatos(personal));

		personal = new TPLimpieza(0, 123, "ba�os", true, "desatascador");
		assertTrue("deber�a ser valido", ValidadorPersonal.comprobarDatos(personal));

		// Prueba con idEmpleado no v�lido
		personal = new TPSeguridad(0, 0, "c�maras", true, 56);
		assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));

		// Prueba con �rea asignada vac�a
		personal = new TPLimpieza(0, 123, "", true, "desatascador");
		assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));

		// Prueba con numPlaca no v�lido
		personal = new TPSeguridad(0, 5423, "c�maras", true, 0);
		assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));

		// Prueba con rol vac�o
		personal = new TPLimpieza(0, 123, "ba�os", true, "");
		assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));
	}

}
