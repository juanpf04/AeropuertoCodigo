package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import negocio.modelo.TModelo;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaAltaModelo extends JFrame implements Observador {

	public VistaAltaModelo() {
		super("Airgest RSP");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JPanel funcion = new JPanel();
		JLabel titulo = new JLabel("Alta Modelo");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		titulo.setBorder(new LineBorder(Color.BLACK, 2));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		funcion.add(titulo);

		SpringLayout layout = new SpringLayout();
		JPanel centro = new JPanel();
		centro.setLayout(layout);//BoxLayout(centro, BoxLayout.PAGE_AXIS)

		//JPanel nombre = new JPanel();
		//nombre.setLayout(new BoxLayout(nombre, BoxLayout.LINE_AXIS));
		JLabel etiquetaNombre = new JLabel("nombre:");
		etiquetaNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoNombre = new JTextField();
		textoNombre.setMaximumSize(new Dimension(200, 30));
		textoNombre.setMinimumSize(new Dimension(200, 30));
		textoNombre.setPreferredSize(new Dimension(200, 30));
		centro.add(etiquetaNombre);
		centro.add(textoNombre);
		layout.putConstraint(SpringLayout.WEST, textoNombre, 5, SpringLayout.EAST, etiquetaNombre);
		//centro.add(nombre);

		//JPanel motor = new JPanel();
		//motor.setLayout(new BoxLayout(motor, BoxLayout.LINE_AXIS));
		JLabel etiquetaMotor = new JLabel("motor:");
		etiquetaMotor.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoMotor = new JTextField();
		textoMotor.setMaximumSize(new Dimension(200, 30));
		textoMotor.setMinimumSize(new Dimension(200, 30));
		textoMotor.setPreferredSize(new Dimension(200, 30));
		layout.putConstraint(SpringLayout.NORTH, etiquetaMotor, 2, SpringLayout.SOUTH, etiquetaNombre);
		layout.putConstraint(SpringLayout.NORTH, textoMotor, 2, SpringLayout.SOUTH, textoNombre);
		layout.putConstraint(SpringLayout.WEST, textoMotor, 22, SpringLayout.EAST, etiquetaMotor);
		centro.add(etiquetaMotor);
		centro.add(textoMotor);
		//centro.add(motor);

		Controlador controlador = Controlador.getInstance();
		
		
		principal.add(funcion);
		principal.add(centro);
		JSplitPane botones = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
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
		
		aceptar.setMaximumSize(new Dimension(60, 40));
		aceptar.setPreferredSize(new Dimension(60, 40));
		botones.setMaximumSize(new Dimension(140, 40));
		botones.setPreferredSize(new Dimension(140,40));

		JButton atras = new JButton("ATRAS"); //boton para volver a la ventana principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				controlador.accion(EventosControlador.VISTA_MODELO, null);
			}

		});
		
		atras.setMaximumSize(new Dimension(60, 40));
		atras.setPreferredSize(new Dimension(60, 40));
		
		botones.add(aceptar);
		botones.add(atras);
		principal.add(botones, BorderLayout.PAGE_END);
		
		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}

}