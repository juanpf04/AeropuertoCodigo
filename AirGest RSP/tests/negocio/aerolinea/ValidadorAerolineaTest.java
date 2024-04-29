package negocio.aerolinea;

import static org.junit.Assert.*;

import org.junit.Test;

import integracion.Utilidades;
import negocio.modelo.TModelo;
import negocio.modelo.ValidadorModelo;

public class ValidadorAerolineaTest {

private boolean noImporta = true;
	
	@Test
	public void comprobar_aerolinea_test() {
		Utilidades.esTest();
		
		TAerolinea aerolinea = new TAerolinea(1, "puerco", noImporta);

		assertTrue("puerco", ValidadorAerolinea.comprobarAerolinea(aerolinea));
	}
	
	
	@Test
	public void comprobar_id_test() {
		Utilidades.esTest();

		assertTrue(" id 1 deberia ser valido", ValidadorAerolinea.comprobarId(1));
		assertFalse("no puede tener id 0", ValidadorAerolinea.comprobarId(0));
		assertFalse("no puede tener id negativo", ValidadorAerolinea.comprobarId(-1));
	}
	
	@Test
	public void comprobar_nombre_test() {
		Utilidades.esTest();

		assertTrue("miguelito deberia valer", ValidadorAerolinea.comprobarNombre("miguelito"));
		assertFalse("letras y numeros", ValidadorAerolinea.comprobarNombre("TAP AIR PORTUGAL 20"));
		assertFalse("mal1", ValidadorAerolinea.comprobarNombre("!hola"));
		assertFalse("mal2", ValidadorAerolinea.comprobarNombre("boeing7-747"));
		assertFalse("mal3", ValidadorAerolinea.comprobarNombre("_987"));
	
	
		
	}
	
}