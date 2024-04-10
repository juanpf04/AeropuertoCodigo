package negocio.hangar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import integracion.Utilidades;

public class ValidadorHangarTest {
private boolean noImporta = true;
	
	@Test
	public void comprobar_datos_test() {
		Utilidades.esTest();

		THangar hangar = new THangar(0, "kjfhjksa", 4, 50.8, 4, noImporta);

		assertTrue("fasfa", ValidadorHangar.comprobarDatos(hangar));
	}
	
	
	@Test
	public void comprobar_id_test() {
		Utilidades.esTest();

		assertTrue(" id 1 deberia ser valido", ValidadorHangar.comprobarId(1));
		assertFalse("no puede tener id 0", ValidadorHangar.comprobarId(0));
		assertFalse("no puede tener id negativo", ValidadorHangar.comprobarId(-1));
	}
	
	@Test
	public void comprobar_direccion_test() {
		Utilidades.esTest();
//todavia nada...
//		assertTrue("boeing-747 deberia ser un nombre valido", ValidadorHangar.comprobarNombre("boeing-747"));
//		assertFalse("mal1", ValidadorHangar.comprobarNombre("boeing7-747"));
//		assertFalse("mal2", ValidadorHangar.comprobarNombre("boeing7-747"));
//		assertFalse("mal3", ValidadorHangar.comprobarNombre("boeing7-747"));
//		assertFalse("mal4", ValidadorHangar.comprobarNombre("boeing-747h"));
//		assertFalse("mal5", ValidadorHangar.comprobarNombre("boeing747"));
//		assertFalse("mal6", ValidadorHangar.comprobarNombre("boeing"));
//		assertFalse("mal7", ValidadorHangar.comprobarNombre("747"));
//		assertFalse("mal8", ValidadorHangar.comprobarNombre("boeing_747"));
//		assertFalse("mal9", ValidadorHangar.comprobarNombre("&boeing-747"));
//		assertFalse("mal0", ValidadorHangar.comprobarNombre("boeing-"));
//		assertFalse("mal11", ValidadorHangar.comprobarNombre("-747"));
		
	}
	
	@Test
	public void comprobar_stock_test() {
		Utilidades.esTest();

		assertTrue("1", ValidadorHangar.comprobarStock(23));
		assertFalse("2", ValidadorHangar.comprobarStock(-3));
		assertTrue("3", ValidadorHangar.comprobarStock(0));
	}
	
	@Test
	public void comprobar_costeDia_test() {
		Utilidades.esTest();

		assertTrue("1", ValidadorHangar.comprobarCosteDia(23.23));
		assertFalse("2", ValidadorHangar.comprobarCosteDia(-3));
		assertTrue("3", ValidadorHangar.comprobarCosteDia(0.9));
	}
	
	@Test
	public void comprobar_espacioAlmacenaje_test() {
		Utilidades.esTest();

		assertTrue("1", ValidadorHangar.comprobarEspacioAlmacenaje(23));
		assertFalse("2", ValidadorHangar.comprobarEspacioAlmacenaje(-3));
		assertFalse("3", ValidadorHangar.comprobarEspacioAlmacenaje(0));
	}
}
