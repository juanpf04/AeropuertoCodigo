/**
 * 
 */
package presentacion.aerolinea;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author sanch
* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class VistaBajaAerolinea extends JFrame implements Observador {
	/** 
	* (non-Javadoc)
	* @see Observador#actualizaVista(Object datos)
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
public void actualizaVista(Object datos) {
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
			JPanel principal = new JPanel();
			principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

			JLabel funcion = new JLabel("Baja Aerolinea");
			funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

			JPanel centro = new JPanel();
			centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

			JPanel id = new JPanel();
			id.setLayout(new BoxLayout(id, BoxLayout.LINE_AXIS));
			JLabel etiquetaId = new JLabel("id: ");
			etiquetaId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoId = new JTextField();
			textoId.setMaximumSize(new Dimension(200, 30));
			textoId.setMinimumSize(new Dimension(200, 30));
			textoId.setPreferredSize(new Dimension(200, 30));
			id.add(etiquetaId);
			id.add(textoId);
			centro.add(id);

			Controlador controlador = Controlador.getInstance();

			JButton aceptar = new JButton("ACEPTAR");
			aceptar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int id = Integer.parseInt(textoId.getText());
						controlador.accion(EventosControlador.BAJA_MODELO, id);
					} catch (NumberFormatException n) {
						controlador.accion(EventosControlador.BAJA_MODELO, 0);
					}
				}

			});

			centro.add(aceptar);
			principal.add(funcion);
			principal.add(centro);

			JButton atras = new JButton("ATRAS"); //boton para volver a la ventana principal
			atras.setToolTipText("Esto vuelve a la ventana anterior");
			atras.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					controlador.accion(EventosControlador.VISTA_MODELO, null);
				}
			});

			principal.add(atras);

			this.setContentPane(principal);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			this.setLocation(200, 200);
			this.pack();
		}
	}