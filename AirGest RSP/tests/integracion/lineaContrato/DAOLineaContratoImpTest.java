package integracion.lineaContrato;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import integracion.Utilidades;
import negocio.lineaContrato.TLineaContrato;

public class DAOLineaContratoImpTest {
	@Test
	public void alta_linea_contrato_test() {
		Utilidades.esTest();

		DAOLineaContrato dc = new DAOLineaContratoImp();

		LocalDate fecha_ini = LocalDate.of(2024, 4, 12);
		LocalDate fecha_fin = LocalDate.of(2024, 4, 23);
		
		TLineaContrato linea = new TLineaContrato(1, 1, fecha_ini, fecha_fin, 223.5, true);

		assertTrue("No se ha creado", dc.altaLineaContrato(linea));
	}
}
