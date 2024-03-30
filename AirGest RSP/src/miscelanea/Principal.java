package miscelanea;

import javax.swing.SwingUtilities;
import presentacion.factoria.FactoriaPresentacion;
import presentacion.modelo.Observador;	

public class Principal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
            	Observador v = FactoriaPresentacion.getInstance().CrearVistaPrincipal();
            }
        });
	}

}
