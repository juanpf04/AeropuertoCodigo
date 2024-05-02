package presentacion.personal;

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
import negocio.personalHangar.TPersonalHangar;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaVincularPersonal extends JFrame implements Observador {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VistaVincularPersonal() {
		super("Vincular Personal");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Vincular Personal");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel idPersonal = new JPanel();
		idPersonal.setLayout(new BoxLayout(idPersonal, BoxLayout.LINE_AXIS));
		JLabel etiquetaIdPersonal = new JLabel("idPersonal: ");
		etiquetaIdPersonal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoIdPersonal = new JTextField();
		textoIdPersonal.setMaximumSize(new Dimension(200, 30));
		textoIdPersonal.setMinimumSize(new Dimension(200, 30));
		textoIdPersonal.setPreferredSize(new Dimension(200, 30));
		idPersonal.add(etiquetaIdPersonal);
		idPersonal.add(textoIdPersonal);
		centro.add(idPersonal);

		JPanel idHangar = new JPanel();
		idHangar.setLayout(new BoxLayout(idHangar, BoxLayout.LINE_AXIS));
		JLabel etiquetaIdHangar = new JLabel("idHangar: ");
		etiquetaIdHangar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoIdHangar = new JTextField();
		textoIdHangar.setMaximumSize(new Dimension(200, 30));
		textoIdHangar.setMinimumSize(new Dimension(200, 30));
		textoIdHangar.setPreferredSize(new Dimension(200, 30));
		idHangar.add(etiquetaIdHangar);
		idHangar.add(textoIdHangar);
		centro.add(idHangar);

		Controlador controlador = Controlador.getInstance();

		JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int idPersonalLeido = Integer.valueOf(textoIdPersonal.getText());
					int idHangarLeido = Integer.valueOf(textoIdHangar.getText());
					TPersonalHangar transfer = new TPersonalHangar(idPersonalLeido, idHangarLeido);
					controlador.accion(EventosControlador.VINCULAR_PERSONAL, transfer);
				} catch (NumberFormatException n) {
					controlador.accion(EventosControlador.VINCULAR_PERSONAL, new TModeloAerolinea());
				}
			}

		});

		centro.add(aceptar);
		principal.add(funcion);
		principal.add(centro);

		JButton atras = new JButton("ATRAS"); // boton para volver a la ventana
												// principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				controlador.accion(EventosControlador.VISTA_PERSONAL, null);
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