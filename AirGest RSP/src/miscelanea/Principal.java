package miscelanea;

import javax.swing.SwingUtilities;

import presentacion.modelo.VistaAltaDeModelo;

public class Principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                VistaAltaDeModelo v = new VistaAltaDeModelo();
            }
        });
	}

}
