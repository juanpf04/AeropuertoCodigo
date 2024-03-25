package negocio.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import miscelanea.Utilidades;

public class SAModeloImpTest {

	private boolean inmodificable = true;

	@Test
	public void modificar_modelo_test() {
		Utilidades.esTest();
		
		SAModelo sm = new SAModeloImp();

		TModelo modelo = new TModelo(1, "boeing-888", "v8", inmodificable);

		assertTrue("debería modificarse modelo", sm.modificarModelo(modelo));
	}

	@Test
	public void modificar_modelo_no_activo_test() {
		Utilidades.esTest();
		
		SAModelo sm = new SAModeloImp();

		TModelo modelo = new TModelo(2, "boeing-744", "v6", inmodificable);

		assertFalse("un modelo no activo no se puede modificar", sm.modificarModelo(modelo));
	}

	@Test
	public void modificar_modelo_nuevo_id_test() {
		Utilidades.esTest();
		
		SAModelo sm = new SAModeloImp();

		TModelo modelo = new TModelo(8, "boeing-744", "v6", inmodificable);

		assertFalse("no se puede modificar un modelo que no existe", sm.modificarModelo(modelo));
	}
	
	@Test
	public void modificar_modelo_datos_no_validos_test() {
		Utilidades.esTest();
//		TODO
	}

	@Test
	public void modificar_modelo_nombre_repetido_test() {
		Utilidades.esTest();
		
		SAModelo sm = new SAModeloImp();

		TModelo modelo = new TModelo(1, "boeing-744", "asas", inmodificable);

		assertFalse("Se ha modificado el modelo, al estar el nombre repetido, no debería dejar",
				sm.modificarModelo(modelo));
	}
	
	@Test
	public void baja_modelo_aviones_activos(){
		Utilidades.esTest();
		
		SAModelo sm = new SAModeloImp();
		
		assertTrue("No se puede dar de baja modelo con aviones activos", sm.bajaModelo(1));
	}
}
