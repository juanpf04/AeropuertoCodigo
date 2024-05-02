package presentacion.modelo;

import java.awt.BorderLayout;
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

import negocio.modelo.TModelo;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaAltaModelo extends JFrame implements Observador {
	
	private static final long serialVersionUID = 1L;

	public VistaAltaModelo() {
		super("Alta Modelo");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Alta Modelo");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel nombre = new JPanel();
		nombre.setLayout(new BoxLayout(nombre, BoxLayout.LINE_AXIS));
		JLabel etiquetaNombre = new JLabel("nombre: ");
		etiquetaNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoNombre = new JTextField();
		textoNombre.setMaximumSize(new Dimension(200, 30));
		textoNombre.setMinimumSize(new Dimension(200, 30));
		textoNombre.setPreferredSize(new Dimension(200, 30));
		nombre.add(etiquetaNombre);
		nombre.add(textoNombre);
		centro.add(nombre);

		JPanel motor = new JPanel();
		motor.setLayout(new BoxLayout(motor, BoxLayout.X_AXIS));
		JLabel etiquetaMotor = new JLabel("motor:    ");
		etiquetaMotor.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoMotor = new JTextField();
		textoMotor.setMaximumSize(new Dimension(200, 30));
		textoMotor.setMinimumSize(new Dimension(200, 30));
		textoMotor.setPreferredSize(new Dimension(200, 30));
		motor.add(etiquetaMotor);
		motor.add(textoMotor);
		centro.add(motor);

		Controlador controlador = Controlador.getInstance();

		JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nombreLeido = textoNombre.getText();
				String motorLeido = textoMotor.getText();
				TModelo transfer = new TModelo(0, nombreLeido, motorLeido, true);
				controlador.accion(EventosControlador.ALTA_MODELO, transfer);
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
		principal.add(atras, BorderLayout.PAGE_END);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}

}