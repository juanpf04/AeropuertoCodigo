package presentacion.controlador;

public abstract class Controlador {
	
	private static Controlador instancia;

	public static Controlador getInstance() {
		if(instancia == null)
			instancia = new ControladorImp();
		return null;
	}

	public abstract void accion(int evento, Object datos);
}