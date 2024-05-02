

package presentacion.aerolinea;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;
import presentacion.Observador;

public class VistaAerolinea extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;
	

	@Override
	public void actualizaVista(Object datos) {
		this.setTitle("AEROLINEA");
		this.setSize(1000, 750);

		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel modulo = new JLabel("AEROLINEA");
		modulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
		modulo.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(modulo, BorderLayout.PAGE_START);

		JPanel botones = new JPanel();
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));

		Controlador ctrl = Controlador.getInstance();

		JButton alta = new JButton("ALTA DE AEROLINEA");
		alta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_ALTA_AEROLINEA, null);
			}
		});
		alta.setToolTipText("Aqui das de alta una aerolinea crack");
		botones.add(alta);

		//-------------------------------------------
		JButton baja = new JButton("BAJA DE AEROLINEA");
		baja.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_BAJA_AEROLINEA, null);
			}
		});
		baja.setToolTipText("Aqui das de baja una aerolinea crack");
		botones.add(baja);

		//-------------------------------------------
		JButton consultarID = new JButton("CONSULTAR AEROLINEA POR ID");

		consultarID.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_CONSULTAR_AEROLINEA_POR_ID, null);
			}
		});
		botones.add(consultarID);

		//-------------------------------------------
		JButton consultarTodas = new JButton("CONSULTAR TODAS LAS AEROLINEAS");

		consultarTodas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(EventosControlador.CONSULTAR_TODOS_AEROLINEAS, null);
			}
		});

		botones.add(consultarTodas);

		//-------------------------------------------
		JButton modificar = new JButton("MODIFICAR AEROLINEA");

		modificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MODIFICAR_AEROLINEA, null);
			}
		});

		botones.add(modificar);

		principal.add(botones, BorderLayout.CENTER);

		JButton atras = new JButton("ATRAS"); //boton para volver a la ventana principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ctrl.accion(EventosControlador.VISTA_PRINCIPAL, null);
			}

		});
		principal.add(atras, BorderLayout.PAGE_END);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}