package negocio.factoria;

import negocio.hangar.SAHangar;
import negocio.aerolinea.SAAerolinea;
import negocio.avion.SAAvion;
import negocio.modelo.SAModelo;
import negocio.personal.SAPersonal;

public abstract class FactoriaNegocio {

	private static FactoriaNegocio instancia;

	public static FactoriaNegocio getInstance() {
		if (instancia == null)
			instancia = new FactoriaNegocioImp();
		return instancia;
	}

	public abstract SAModelo crearSAModelo();

	public abstract SAHangar crearSAHangar();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract SAAvion crearSAAvion();

	public abstract SAAerolinea crearSAAerolinea();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public abstract SAPersonal crearSAPersonal();
}