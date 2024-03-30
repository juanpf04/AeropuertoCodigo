package miscelanea;

import javax.swing.SwingUtilities;

import presentacion.modelo.VistaAltaDeModelo;
import presentacion.modelo.VistaGeneralModelo;

public class Principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                //VistaAltaDeModelo v = new VistaAltaDeModelo();
            	VistaGeneralModelo v = new VistaGeneralModelo();
            }
        });
	}

}
