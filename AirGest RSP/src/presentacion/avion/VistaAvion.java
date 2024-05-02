
package presentacion.avion;

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

import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaAvion extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public VistaAvion() {
		super("AVION");
		this.setSize(1000, 750); // hace que la ventana no salga tan chiquitita
	}

	@Override
	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel modulo = new JLabel("AVION"); // titulo de la ventana en la que
												// estamos, apareceran las
												// funciones de avion
		modulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
		modulo.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(modulo, BorderLayout.PAGE_START);

		JPanel botones = new JPanel();
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));

		Controlador ctrl = Controlador.getInstance();

		JButton alta = new JButton("ALTA DE AVION");
		alta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_ALTA_AVION, null);
			}
		});
		alta.setToolTipText("Aqui das de alta un avion maquina");
		botones.add(alta);

		// -------------------------------------------
		JButton baja = new JButton("BAJA DE AVION");
		baja.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_BAJA_AVION, null);
			}
		});
		baja.setToolTipText("Aqui das de baja un avion maquina");
		botones.add(baja);

		// -------------------------------------------
		JButton consultarID = new JButton("CONSULTAR AVION POR ID");

		consultarID.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_CONSULTAR_AVION_POR_ID, null);
			}
		});
		botones.add(consultarID);

		// -------------------------------------------
		JButton consultarTodos = new JButton("CONSULTAR TODOS LOS AVIONES");

		consultarTodos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(EventosControlador.CONSULTAR_TODOS_AVIONES, null);
			}
		});

		botones.add(consultarTodos);

		// -------------------------------------------
		JButton modificar = new JButton("MODIFICAR AVION");

		modificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MODIFICAR_AVION, null);
			}
		});

		botones.add(modificar);

		// -------------------------------------------
		JButton mostrarPorModelo = new JButton("MOSTRAR AVIONES POR MODELO");

		mostrarPorModelo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MOSTRAR_AVIONES_POR_MODELO, null);
			}
		});

		botones.add(mostrarPorModelo);

		// -------------------------------------------
		JButton mostrarPorHangar = new JButton("MOSTRAR AVIONES POR HANGAR");

		mostrarPorHangar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MOSTRAR_AVIONES_POR_HANGAR, null);
			}
		});

		botones.add(mostrarPorHangar);

		// -------------------------------------------
		JButton mostrarPorAerolinea = new JButton("MOSTRAR AVIONES POR AEROLINEA");

		mostrarPorAerolinea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MOSTRAR_AVIONES_POR_AEROLINEA, null);
			}
		});

		botones.add(mostrarPorAerolinea);

		// -------------------------------------------
		principal.add(botones, BorderLayout.CENTER);

		JButton atras = new JButton("ATRAS"); // boton para volver a la ventana
												// principal
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