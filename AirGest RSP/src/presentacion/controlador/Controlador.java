package presentacion.controlador;

public abstract class Controlador {

	private static Controlador instancia;

	public static Controlador getInstance() {
		if (instancia == null)
			instancia = new ControladorImp();
		return instancia;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param evento
	* @param datos
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract void accion(Enum evento, Object datos);

	public abstract void accion(EventosControlador evento, Object datos);
}