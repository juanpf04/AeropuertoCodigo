package negocio.avion;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.time.LocalDate;

import org.junit.Test;

import integracion.Utilidades;
import negocio.avion.SAAvion;
import negocio.avion.SAAvionImp;
import negocio.avion.TAvion;
import negocio.avion.TAPrivado;
import negocio.avion.TAComercial;


public class SAAvionImpTest {

	private boolean inmodificable = true;
	private int id_inmodificable = 0;
	
	//estructura avion: 
		//comercial: int id, int numAsientos, LocalDate fechaFabricacion, String nombre, String matricula,
					//boolean activo, int idAerolinea, int idModelo, int idHangar, int trabajadores
	
		//privado: int id, int numAsientos, LocalDate fechaFabricacion, String nombre, String matricula,
					//boolean activo, int idAerolinea, int idModelo, int idHangar, String nombre_duenyo, int idCarnet
	@Test
	public void alta_avion_test() {
		Utilidades.esTest();

		SAAvion sa = new SAAvionImp();

		// Prueba exitosa comercial
		TAvion avion = new TAComercial(id_inmodificable, 5, LocalDate.parse("06/12/2004"), "nombrePrueba", "EC-123", 
				inmodificable, 1, 1, 1, 1);
		File carpeta = new File(Utilidades.ruta("avion"));
		File[] lista = carpeta.listFiles();
		assertEquals("debería darse de alta el avion comercial", lista.length + 1, sa.altaAvion(avion));
		
		//Prueba exitosa privada
		avion = new TAPrivado(id_inmodificable, 5, LocalDate.parse("06/12/2004"), "nombrePrueba2", "EC-123", 
				inmodificable, 1, 1, 1, "Patricio", 7);
		assertEquals("debería darse de alta el avion privado", lista.length + 1, sa.altaAvion(avion));

		// Fallo por nombre repetido
		avion = new TAPrivado(id_inmodificable, 5, LocalDate.parse("06/12/2004"), "nombrePrueba2", "EC-123", 
				inmodificable, 1, 1, 1, "Patricio", 7);
		assertEquals("un avion no activo no se puede modificar", -1, sa.altaAvion(avion));

		// Reactivar avion exito
		avion = new TAComercial(id_inmodificable, 5, LocalDate.parse("06/12/2004"), "pruebaReactivar", "EC-123", 
				inmodificable, 1, 1, 1, 1);
		assertEquals("deberia reactivarse el avion ", 6, sa.altaAvion(avion));
		
		// Fallo por nombre matricula
		avion = new TAComercial(id_inmodificable, 5, LocalDate.parse("06/12/2004"), "nombrePrueba", "EC-123", 
				inmodificable, 1, 1, 1, 1);
		assertEquals("la matricula deberia ser EC-(caracteres alfanumericos)", -1, sa.altaAvion(avion));
	}

	@Test
	public void baja_avion_test() {

	}

	@Test
	public void modificar_avion_test() {

	}

	@Test
	public void consultar_avion_por_id_test() {

	}

	@Test
	public void consultar_todos_aviones_test() {

	}

	@Test
	public void mostrar_aviones_por_modelo_test() {

	}

	@Test
	public void mostrar_aviones_por_aerolinea_test() {

	}

	@Test
	public void mostrar_aviones_por_hangar_test() {

	}
}
