package presentacion.modelo;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presentacion.Observador;

public class VistaBajaModelo extends JFrame implements Observador {

	public VistaBajaModelo() {
		super("Baja Modelo");
		initGUI();
		this.setSize(1000, 750);
	}

	public void initGUI() {

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Baja Modelo");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel id = new JPanel();
		id.setLayout(new BoxLayout(id, BoxLayout.X_AXIS));
		JLabel etiquetaId = new JLabel("id: ");
		etiquetaId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoId = new JTextField();
		textoId.setMaximumSize(new Dimension(200, 30));
		textoId.setMinimumSize(new Dimension(200, 30));
		textoId.setPreferredSize(new Dimension(200, 30));
		id.add(etiquetaId);
		id.add(textoId);
		centro.add(id);

		// parece ser que hace la accion sin entrar en el actionListener
		// hay que frenar la ejecucion si no se pulsa aceptar(porque avanza solo
		// el capullo)
		JButton aceptar = new JButton("aceptar");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}

		});

		centro.add(aceptar);
		principal.add(funcion);
		principal.add(centro);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}

	public void actualizaVista(Object datos) {// yo creo que es la que te
													// muestra la vista de fallo o
												// exito
												// begin-user-code
												// TODO Auto-generated method stub

		// end-user-code
	}
}