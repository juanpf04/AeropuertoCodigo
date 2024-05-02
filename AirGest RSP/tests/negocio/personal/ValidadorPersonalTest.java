package negocio.personal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import integracion.UtilidadesI;
import negocio.modelo.ValidadorModelo;

public class ValidadorPersonalTest {

	@Test
	public void comprobarDatosTest() {
	    UtilidadesI.esTest();
	    
	    TPersonal personal;
	    
	    personal = new TPSeguridad(0, 5423, "cámaras", true, 56);
	    assertTrue("debería ser valido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPLimpieza(0, 123, "baños", true, "desatascador");
	    assertTrue("debería ser valido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPSeguridad(0, 0, "cámaras", true, 56); // Prueba con idEmpleado no válido
	    assertFalse("debería ser inválido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPLimpieza(0, 123, "", true, "desatascador"); // Prueba con área asignada vacía
	    assertFalse("debería ser inválido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPSeguridad(0, 5423, "cámaras", true, 0); // Prueba con numPlaca no válido
	    assertFalse("debería ser inválido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPLimpieza(0, 123, "baños", true, ""); // Prueba con rol vacío
	    assertFalse("debería ser inválido", ValidadorPersonal.comprobarDatos(personal));
	}


	@Test
	public void comprobarIdTest() {
		UtilidadesI.esTest();

		assertTrue(" id 1 deberia ser valido", ValidadorModelo.comprobarId(1));
		assertFalse("no puede tener id 0", ValidadorModelo.comprobarId(0));
		assertFalse("no puede tener id negativo", ValidadorModelo.comprobarId(-1));
	}
}
