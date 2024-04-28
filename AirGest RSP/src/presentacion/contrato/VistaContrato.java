package presentacion.contrato;

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

public class VistaContrato extends JFrame implements Observador{

	public VistaContrato(){
		super("CONTRATO");
		this.setSize(1000, 750);
	}
	
	@Override
	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel modulo = new JLabel("CONTRATO"); //titulo de la ventana en la que estamos, apareceran las funciones de modelo 
		modulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
		modulo.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(modulo, BorderLayout.PAGE_START);

		JPanel botones = new JPanel();
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));

		Controlador ctrl = Controlador.getInstance();

		JButton abrir = new JButton("ABRIR CONTRATO");
		abrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_ABRIR_CONTRATO, null);
			}
		});
		botones.add(abrir);

		//-------------------------------------------
		JButton consultar = new JButton("CONSULTAR CONTRATO POR ID");
		consultar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_CONSULTAR_CONTRATO_POR_ID, null);
			}
		});
		botones.add(consultar);

		//-------------------------------------------
		JButton consultarTodos = new JButton("CONSULTAR CONTRATOS");

		consultarTodos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.CONSULTAR_TODOS_CONTRATOS, null);
			}
		});
		botones.add(consultarTodos);

		//-------------------------------------------
		JButton modificarContrato = new JButton("MODIFICAR CONTRATO");

		modificarContrato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ctrl.accion(EventosControlador.VISTA_MODIFICAR_CONTRATO, null);
			}
		});

		botones.add(modificarContrato);

		//-------------------------------------------
		JButton modificarLinea = new JButton("MODIFICAR MODELO");

		modificarLinea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MODIFICAR_LINEA_CONTRATO, null);
			}
		});

		botones.add(modificarLinea);

		//-------------------------------------------
		JButton consultarPorAerolinea = new JButton("CONSULTAR CONTRATOS POR AEROLINEA");

		consultarPorAerolinea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MOSTRAR_CONTRATOS_POR_AEROLINEA, null);
			}
		});

		botones.add(consultarPorAerolinea);

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
