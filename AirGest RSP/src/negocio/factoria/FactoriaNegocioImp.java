package negocio.factoria;

import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaNegocio#crearSAAerolinea()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public SAAerolinea crearSAAerolinea() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}