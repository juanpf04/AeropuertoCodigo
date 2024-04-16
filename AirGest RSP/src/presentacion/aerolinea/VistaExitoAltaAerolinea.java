/**
 * 
 */
package presentacion.aerolinea;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import presentacion.Observador;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author sanch
* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class VistaExitoAltaAerolinea extends JFrame implements Observador {
	/** 
	* (non-Javadoc)
	* @see Observador#actualizaVista(Object datos)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel exito = new JLabel("Alta de Aerolinea exitosa! con id = " + (Integer) datos);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		exito.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(exito, BorderLayout.PAGE_START);

		JLabel imagen = new JLabel();
		imagen.setIcon(new ImageIcon("recursos/iconos/exito.png"));
		principal.add(imagen, BorderLayout.CENTER);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}