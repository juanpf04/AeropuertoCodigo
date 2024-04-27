
package presentacion.avion;

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

public class VistaMostrarAvionesPorModelo extends JFrame implements Observador {
	
	public VistaMostrarAvionesPorModelo() {
		super("Consultar aviones por modelo");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Consultar aviones por aerolinea");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel idModelo = new JPanel();
		idModelo.setLayout(new BoxLayout(idModelo, BoxLayout.LINE_AXIS));
		JLabel etiquetaId = new JLabel("id Modelo: ");
		etiquetaId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoId = new JTextField();
		textoId.setMaximumSize(new Dimension(200, 30));
		textoId.setMinimumSize(new Dimension(200, 30));
		textoId.setPreferredSize(new Dimension(200, 30));
		idModelo.add(etiquetaId);
		idModelo.add(textoId);
		centro.add(idModelo);

		Controlador controlador = Controlador.getInstance();

		JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(textoId.getText());
					controlador.accion(EventosControlador.MOSTRAR_AVIONES_POR_MODELO, id);
				} catch (NumberFormatException n) {
					controlador.accion(EventosControlador.MOSTRAR_AVIONES_POR_MODELO, 0);
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
				controlador.accion(EventosControlador.VISTA_AVION, null);
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