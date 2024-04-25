package integracion.personal;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

import integracion.Utilidades;
import negocio.personal.TPSeguridad;
import negocio.personal.TPersonal;

public class DAOPersonalTest {

	@Test
	public void AltaPersonal() {
		Utilidades.esTest();
		
		DAOPersonal dp = new DAOPersonalImp();
		
		assertEquals("Debería darlo de alta", 1, dp.AltaPersonal(new TPSeguridad(0, 2, "baños", true, 45)));
	}

	@Test
	public void BajaPersonal() {
		
	}

	@Test
	public void ModificarPersonal() {

	}

	@Test
	public void ConsultarPersonalPorId() {

	}

	@Test
	public void ConsultarPersonalExistente() {

	}
}
