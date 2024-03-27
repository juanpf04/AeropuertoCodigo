
package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VistaAltaDeModelo extends JFrame implements Observador {
	public VistaAltaDeModelo() {
		super("Alta Modelo");
		initGUI();
	}

	public void initGUI() {
		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Alta Modelo");
		funcion.setFont(new Font("Comic Sans", Font.ITALIC, 25));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel nombre = new JPanel();
		nombre.setLayout(new BoxLayout(nombre, BoxLayout.X_AXIS));
		JLabel etiquetaNombre = new JLabel("nombre:");
		JTextField textoNombre = new JTextField();
		textoNombre.setMaximumSize(new Dimension(80, 10));
		textoNombre.setMinimumSize(new Dimension(80, 10));
		textoNombre.setPreferredSize(new Dimension(80, 10));
		nombre.add(etiquetaNombre);
		nombre.add(textoNombre);

		JPanel motor = new JPanel();
		motor.setLayout(new BoxLayout(motor, BoxLayout.X_AXIS));
		JLabel etiquetaMotor = new JLabel("motor:");
		JTextField textoMotor = new JTextField();
		textoMotor.setMaximumSize(new Dimension(80, 10));
		textoMotor.setMinimumSize(new Dimension(80, 10));
		textoMotor.setPreferredSize(new Dimension(80, 10));
		motor.add(etiquetaMotor);
		motor.add(textoMotor);

		centro.add(nombre);
		centro.add(motor);

		principal.add(funcion);
		principal.add(centro);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}

	public void actualizaVista() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}