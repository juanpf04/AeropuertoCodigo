package negocio.factoria;

import negocio.hangar.SAHangar;
import negocio.hangar.SAHangarImp;
import negocio.aerolinea.SAAerolinea;
import negocio.aerolinea.SAAerolineaImp;
import negocio.avion.SAAvion;
import negocio.contrato.SAContrato;
import negocio.contrato.SAContratoImp;
import negocio.modelo.SAModelo;
import negocio.modelo.SAModeloImp;

public class FactoriaNegocioImp extends FactoriaNegocio {

	public SAModelo crearSAModelo() {
		return new SAModeloImp();
	}

	@Override
	public SAHangar crearSAHangar() {
		return new SAHangarImp();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaNegocio#crearSAAvion()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public SAAvion crearSAAvion() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public SAAerolinea crearSAAerolinea() {
		return new SAAerolineaImp();
	}

	/** 
	* (non-Javadoc)
	* @see FactoriaNegocio#crearSAPersonal()
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void crearSAPersonal() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	@Override
	public SAContrato crearSAContrato() {
		return new SAContratoImp();
	}
}