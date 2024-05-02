package integracion.personal;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

import integracion.Utilidades;
import negocio.personal.TPSeguridad;
import negocio.personal.TPersonal;
import negocio.personal.TPLimpieza;

public class DAOPersonalTest {

	@Test
	public void altaPersonalTest() {
		Utilidades.esTest();

		DAOPersonal daoPersonal = new DAOPersonalImp();

		TPersonal personal;

		File carpeta = new File(Utilidades.ruta("personal"));
		File[] lista = carpeta.listFiles();

		personal = new TPSeguridad(0, 12345, "Seguridad", true, 56789);
		assertEquals("No ha devuelto el id correcto", lista.length + 1, daoPersonal.AltaPersonal(personal));
		
		personal = new TPLimpieza(0, 67890, "Limpieza", true, "Supervisor");
		assertEquals("No ha devuelto el id correcto", lista.length + 2, daoPersonal.AltaPersonal(personal));
	}

	@Test
	public void bajaPersonalTest() {
		Utilidades.esTest();
		DAOPersonal daoPersonal = new DAOPersonalImp();
		assertTrue("No se ha dado de baja", daoPersonal.BajaPersonal(1));
		assertFalse("Se ha dado de baja un empleado que no existe", daoPersonal.BajaPersonal(500));
	}

	@Test
	public void modificarPersonalTest() {
		Utilidades.esTest();

		DAOPersonal daoPersonal = new DAOPersonalImp();

		TPSeguridad personal = new TPSeguridad(1, 12345, "Seguridad", true, 56789);

		assertTrue("Ha leído mal el fichero", daoPersonal.ModificarPersonal(personal));
	}

	@Test
	public void consultarPersonalPorIdTest() {
		Utilidades.esTest();

		DAOPersonal daoPersonal = new DAOPersonalImp();

		assertEquals("El personal con id 3 debe tener el idEmpleado 67890", 67890,
				daoPersonal.ConsultarPersonalPorId(3).getIdEmpleado());
	}

	@Test
	public void consultarTodosPersonalTest() {
		Utilidades.esTest();

		DAOPersonal daoPersonal = new DAOPersonalImp();

		List<TPersonal> personal = daoPersonal.ConsultarPersonalExistente();

		File carpeta = new File(Utilidades.ruta("personal"));
		File[] lista = carpeta.listFiles();

		assertEquals("Tiene que haber tantos empleados como ficheros", lista.length, personal.size());
	}
}
