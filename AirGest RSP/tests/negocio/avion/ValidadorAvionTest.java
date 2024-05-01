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
				LocalDate.of(2000, 6, 22), "avionComercial", "EC-123", noImporta, 1, 1, 1, 10)));

		assertTrue("Avion privado correcto", ValidadorAvion.comprobarDatos(new TAPrivado(0, 8,
				LocalDate.of(2000, 6, 22), "avionPrivado", "EC-12", noImporta, 1, 1, 1, "charlie", 23423)));
	}

	@Test
	public void comprobar_id_test() {
		Utilidades.esTest();

		assertTrue(" id 1 deberia ser valido", ValidadorAvion.comprobarId(1));
		assertFalse("no puede tener id 0", ValidadorAvion.comprobarId(0));
		assertFalse("no puede tener id negativo", ValidadorAvion.comprobarId(-1));
	}
	
	@Test
	public void comprobarComercial_test() {
		Utilidades.esTest();
		
		assertTrue("Avion comercial correcto", ValidadorAvion.comprobarComercial(new TAComercial(0, 80,
				LocalDate.of(2000, 6, 22), "avionComercial", "EC-123", noImporta, 1, 1, 1, 10)));
	}
	
	@Test
	public void comprobarPrivado_test() {
		Utilidades.esTest();
		
		assertTrue("Avion privado correcto", ValidadorAvion.comprobarPrivado(new TAPrivado(0, 8,
				LocalDate.of(2000, 6, 22), "avionPrivado", "EC-12", noImporta, 1, 1, 1, "charlie", 23423)));
	}
	
	@Test
	public void comprobarInfo_test() {
		Utilidades.esTest();
		assertTrue("Avion correcto", ValidadorAvion.comprobarInfo(new TAvion(0, 8,
				LocalDate.of(2000, 6, 22), "avionPrivado", "EC-12", noImporta, 1, 1, 1)));
	}
	
	@Test
	public void comprobarCarnet_test()
	{
		Utilidades.esTest();
		//Carnet valido
		assertTrue("Id carnet correcto", ValidadorAvion.comprobarCarnet(new TAPrivado(0, 8,
				LocalDate.of(2000, 6, 22), "avionPrivado", "EC-12", noImporta, 1, 1, 1, "charlie", 23423)));
		
		//Carnet no puede ser negativo
		assertFalse("Id carnet correcto", ValidadorAvion.comprobarCarnet(new TAPrivado(0, 8,
				LocalDate.of(2000, 6, 22), "avionPrivado", "EC-12", noImporta, 1, 1, 1, "charlie", -7)));
		
		//Carnet no puede ser 0
				assertFalse("Id carnet correcto", ValidadorAvion.comprobarCarnet(new TAPrivado(0, 8,
						LocalDate.of(2000, 6, 22), "avionPrivado", "EC-12", noImporta, 1, 1, 1, "charlie", 0)));
	}
	
	@Test
	public void comprobarTrabajadores_test()
	{
		Utilidades.esTest();
		//Trabajadores valido
		assertTrue("numTrabajadores", ValidadorAvion.comprobarTrabajadores(new TAComercial(0, 80,
				LocalDate.of(2000, 6, 22), "avionComercial", "EC-123", noImporta, 1, 1, 1, 10)));
				
		//Trabajadores no puede ser negativo
		assertFalse("numTrabajadores", ValidadorAvion.comprobarTrabajadores(new TAComercial(0, 80,
				LocalDate.of(2000, 6, 22), "avionComercial", "EC-123", noImporta, 1, 1, 1, -7)));
				
		//Trabajadores no puede ser 0
		assertFalse("numTrabajadores", ValidadorAvion.comprobarTrabajadores(new TAComercial(0, 80,
				LocalDate.of(2000, 6, 22), "avionComercial", "EC-123", noImporta, 1, 1, 1, 0)));
	}

	@Test
	public void comprobarAsientos_test() {
		Utilidades.esTest();
		
		//numAsientos valido
		assertTrue(" numAsientos 1 deberia ser valido", ValidadorAvion.comprobarAsientos(1));
		//numAsientos fallo
		assertFalse("no puede tener numAsientos 0", ValidadorAvion.comprobarAsientos(0));
		//numAsientos fallo
		assertFalse("no puede tener numAsientos negativo", ValidadorAvion.comprobarAsientos(-1));
	}
	
	@Test
	public void comprobarHangar_test()
	{
		Utilidades.esTest();
		
		//idHangar valido
		assertTrue("idHangar 1 deberia ser valido", ValidadorAvion.comprobarHangar(1));
		//idHangar fallo
		assertFalse("no puede tener idHangar 0", ValidadorAvion.comprobarHangar(0));
		//idHangar fallo
		assertFalse("no puede tener idHangar negativo", ValidadorAvion.comprobarHangar(-1));
	}
	
	@Test
	public void comprobarAerolinea_test()
	{
		Utilidades.esTest();
		
		//idAerolinea valido
		assertTrue("idAerolinea 1 deberia ser valido", ValidadorAvion.comprobarAerolinea(1));
		//idAerolinea fallo
		assertFalse("no puede tener idAerolinea 0", ValidadorAvion.comprobarAerolinea(0));
		//idAerolinea fallo
		assertFalse("no puede tener idAerolinea negativo", ValidadorAvion.comprobarAerolinea(-1));
	}
	
	@Test
	public void comprobarModelo_test()
	{
		Utilidades.esTest();
		
		//idModelo valido
		assertTrue("idModelo 1 deberia ser valido", ValidadorAvion.comprobarModelo(1));
		//idModelo fallo
		assertFalse("no puede tener idModelo 0", ValidadorAvion.comprobarModelo(0));
		//idModelo fallo
		assertFalse("no puede tener idModelo negativo", ValidadorAvion.comprobarModelo(-1));
	}
	
	@Test
	public void comprobarMatricula_test() {
		Utilidades.esTest();
		
		//matricula valido
		assertTrue("matrícula deberia ser valido", ValidadorAvion.comprobarMatricula("EC-1"));
		//matricula valido
		assertTrue("matrícula deberia ser valido", ValidadorAvion.comprobarMatricula("EC-1V"));
		//matricula fallo
		assertFalse("orden invertido", ValidadorAvion.comprobarMatricula("1-EC"));
		//matricula fallo
		assertFalse("falta guion", ValidadorAvion.comprobarMatricula("EC1"));
		//matricula fallo
		assertFalse("falta letras", ValidadorAvion.comprobarMatricula("-1"));
		//matricula fallo
		assertFalse("falta numeros", ValidadorAvion.comprobarMatricula("EC-"));
		//matricula fallo
		assertFalse("falta guion y numeros", ValidadorAvion.comprobarMatricula("EC"));
		//matricula fallo
		assertFalse("falta guion y letras", ValidadorAvion.comprobarMatricula("5"));
		//matricula fallo
		assertFalse("no pueden haber numeros antes del guion", ValidadorAvion.comprobarMatricula("EC2-1"));
		

	}
}
