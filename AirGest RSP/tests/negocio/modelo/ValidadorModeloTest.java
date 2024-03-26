package negocio.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import miscelanea.Utilidades;

public class ValidadorModeloTest {
	
	private boolean inmodificable = true;
	
	@Test
	public void comprobar_datos_test() {
		Utilidades.esTest();

		TModelo modelo = new TModelo(1, "boeing-888", "v8", inmodificable);

		assertTrue("fasfa", ValidadorModelo.comprobarDatosModelo(modelo));
	}
	
	
	@Test
	public void comprobar_id_test() {
		Utilidades.esTest();

		assertTrue(" id 1 deberia ser valido", ValidadorModelo.comprobarId(1));
		assertFalse("no puede tener id 0", ValidadorModelo.comprobarId(0));
		assertFalse("no puede tener id negativo", ValidadorModelo.comprobarId(-1));
	}
	
	@Test
	public void comprobar_nombre_test() {
		Utilidades.esTest();

		assertTrue("boeing-747 deberia ser un nombre valido", ValidadorModelo.comprobarNombre("boeing-747"));
		assertFalse("mal1", ValidadorModelo.comprobarNombre("boeing7-747"));
		assertFalse("mal2", ValidadorModelo.comprobarNombre("boeing7-747"));
		assertFalse("mal3", ValidadorModelo.comprobarNombre("boeing7-747"));
		assertFalse("mal4", ValidadorModelo.comprobarNombre("boeing-747h"));
		assertFalse("mal5", ValidadorModelo.comprobarNombre("boeing747"));
		assertFalse("mal6", ValidadorModelo.comprobarNombre("boeing"));
		assertFalse("mal7", ValidadorModelo.comprobarNombre("747"));
		assertFalse("mal8", ValidadorModelo.comprobarNombre("boeing_747"));
		assertFalse("mal9", ValidadorModelo.comprobarNombre("&boeing-747"));
		assertFalse("mal0", ValidadorModelo.comprobarNombre("boeing-"));
		assertFalse("mal11", ValidadorModelo.comprobarNombre("-747"));
		
	}
	
	@Test
	public void comprobar_motor_test() {
		Utilidades.esTest();

		assertTrue("", ValidadorModelo.comprobarMotor(""));
		assertTrue("", ValidadorModelo.comprobarMotor(""));
		assertTrue("", ValidadorModelo.comprobarMotor(""));
	}
}
