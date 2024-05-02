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

import negocio.modeloAerolinea.TModeloAerolinea;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaDesvincularModelo extends JFrame implements Observador {
	
	private static final long serialVersionUID = 1L;

	public VistaDesvincularModelo() {
		super("Desvincular Modelo");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Desvincular Modelo");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel idModelo = new JPanel();
		idModelo.setLayout(new BoxLayout(idModelo, BoxLayout.LINE_AXIS));
		JLabel etiquetaIdModelo = new JLabel("idModelo: ");
		etiquetaIdModelo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoIdModelo = new JTextField();
		textoIdModelo.setMaximumSize(new Dimension(200, 30));
		textoIdModelo.setMinimumSize(new Dimension(200, 30));
		textoIdModelo.setPreferredSize(new Dimension(200, 30));
		idModelo.add(etiquetaIdModelo);
		idModelo.add(textoIdModelo);
		centro.add(idModelo);

		JPanel idAerolinea = new JPanel();
		idAerolinea.setLayout(new BoxLayout(idAerolinea, BoxLayout.LINE_AXIS));
		JLabel etiquetaIdAerolinea = new JLabel("idAerolínea: ");
		etiquetaIdAerolinea.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoIdAerolinea = new JTextField();
		textoIdAerolinea.setMaximumSize(new Dimension(200, 30));
		textoIdAerolinea.setMinimumSize(new Dimension(200, 30));
		textoIdAerolinea.setPreferredSize(new Dimension(200, 30));
		idAerolinea.add(etiquetaIdAerolinea);
		idAerolinea.add(textoIdAerolinea);
		centro.add(idAerolinea);

		Controlador controlador = Controlador.getInstance();

		JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int idModeloLeido = Integer.valueOf(textoIdModelo.getText());
					int idAerolineaLeido = Integer.valueOf(textoIdAerolinea.getText());
					TModeloAerolinea transfer = new TModeloAerolinea(idModeloLeido, idAerolineaLeido);
					controlador.accion(EventosControlador.DESVINCULAR_MODELO, transfer);
				} catch (NumberFormatException n) {
					controlador.accion(EventosControlador.DESVINCULAR_MODELO, new TModeloAerolinea());
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
		principal.add(atras, BorderLayout.PAGE_END);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}