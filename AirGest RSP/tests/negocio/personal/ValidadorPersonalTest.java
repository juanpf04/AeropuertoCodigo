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
	    
	    personal = new TPSeguridad(0, 5423, "c�maras", true, 56);
	    assertTrue("deber�a ser valido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPLimpieza(0, 123, "ba�os", true, "desatascador");
	    assertTrue("deber�a ser valido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPSeguridad(0, 0, "c�maras", true, 56); // Prueba con idEmpleado no v�lido
	    assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPLimpieza(0, 123, "", true, "desatascador"); // Prueba con �rea asignada vac�a
	    assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPSeguridad(0, 5423, "c�maras", true, 0); // Prueba con numPlaca no v�lido
	    assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));
	    
	    personal = new TPLimpieza(0, 123, "ba�os", true, ""); // Prueba con rol vac�o
	    assertFalse("deber�a ser inv�lido", ValidadorPersonal.comprobarDatos(personal));
	}


	@Test
	public void comprobarIdTest() {
		UtilidadesI.esTest();

		assertTrue(" id 1 deberia ser valido", ValidadorModelo.comprobarId(1));
		assertFalse("no puede tener id 0", ValidadorModelo.comprobarId(0));
		assertFalse("no puede tener id negativo", ValidadorModelo.comprobarId(-1));
	}
}
