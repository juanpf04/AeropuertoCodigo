package presentacion.personal;

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

public class VistaPersonal extends JFrame implements Observador {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VistaPersonal() {
		super("PERSONAL");
		this.setSize(1000, 750); //hace que la ventana no salga tan chiquitita
	}

	@Override
	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel modulo = new JLabel("PERSONAL"); //titulo de la ventana en la que estamos, apareceran las funciones de modelo 
		modulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
		modulo.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(modulo, BorderLayout.PAGE_START);

		JPanel botones = new JPanel();
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));

		Controlador ctrl = Controlador.getInstance();

		JButton alta = new JButton("ALTA DE PERSONAL");
		alta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_ALTA_PERSONAL, null);
			}
		});
		alta.setToolTipText("Aqui das de alta un personal maquina");
		botones.add(alta);

		//-------------------------------------------
		JButton baja = new JButton("BAJA DE PERSONAL");
		baja.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_BAJA_PERSONAL, null);
			}
		});
		baja.setToolTipText("Aqui das de baja un personal maquina");
		botones.add(baja);

		//-------------------------------------------
		JButton consultarID = new JButton("CONSULTAR PERSONAL POR ID");

		consultarID.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_CONSULTAR_PERSONAL_POR_ID, null);
			}
		});
		botones.add(consultarID);

		//-------------------------------------------
		JButton consultarTodos = new JButton("CONSULTAR PERSONAL EXISTENTE");

		consultarTodos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(EventosControlador.CONSULTAR_PERSONAL_EXISTENTE, null);
			}
		});

		botones.add(consultarTodos);

		//-------------------------------------------
		JButton modificar = new JButton("MODIFICAR PERSONAL");

		modificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MODIFICAR_PERSONAL, null);
			}
		});

		botones.add(modificar);

		//-------------------------------------------
		JButton vincular = new JButton("VINCULAR PERSONAL");

		vincular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_VINCULAR_PERSONAL, null);
			}
		});

		botones.add(vincular);

		//-------------------------------------------
		JButton desvincular = new JButton("DESVINCULAR PERSONAL");

		desvincular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_DESVINCULAR_PERSONAL, null);
			}
		});

		botones.add(desvincular);

		principal.add(botones, BorderLayout.CENTER);

		//-----------------------------------------------------

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