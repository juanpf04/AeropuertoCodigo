package negocio.factoria;

import negocio.hangar.SAHangar;
import negocio.hangar.SAHangarImp;
import negocio.aerolinea.SAAerolinea;
import negocio.aerolinea.SAAerolineaImp;
import negocio.avion.SAAvion;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;
import negocio.personal.SAPersonal;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaNegocio#crearSAAvion()
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public SAAvion crearSAAvion() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	@Override
	public SAHangar crearSAHangar() {
		return new SAHangarImp();
	}

	public SAAerolinea crearSAAerolinea() {
		return new SAAerolineaImp();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaNegocio#crearSAPersonal()
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public SAPersonal crearSAPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}