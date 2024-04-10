package presentacion;

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

import presentacion.factoria.FactoriaPresentacion;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaPrincipal extends JFrame implements Observador {
	public VistaPrincipal() {
		super("AirGest RSP");
		this.setSize(8000, 2000); //hace que la ventana no salga tan chiquitita
	}

	@Override
	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel modulo = new JLabel("AIRGEST RSP"); //titulo de la ventana en la que estamos, apareceran las funciones de modelo 
		modulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
		modulo.setHorizontalAlignment(SwingConstants.CENTER); //ESTO ES LO QUE LO CENTRA, SWINGCONSTANTS
		principal.add(modulo, BorderLayout.PAGE_START);

		JPanel botones = new JPanel();
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));

		Controlador ctrl = Controlador.getInstance();

		//-------------------------------------------

		JButton modelo = new JButton("MODELO");
		modelo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_MODELO, null);
			}
		});
		modelo.setToolTipText("MODULO MODELO");
		botones.add(modelo);

		//-------------------------------------------
		JButton avion = new JButton("AVION");
		avion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		avion.setToolTipText("MODULO AVION");
		botones.add(avion);

		//-------------------------------------------
		JButton consultarID = new JButton("AEROLINEA");

		botones.add(consultarID);

		//-------------------------------------------
		JButton consultarTodos = new JButton("HANGAR");

		botones.add(consultarTodos);

		//-------------------------------------------
		JButton modificar = new JButton("PERSONAL");

		botones.add(modificar);

		//-------------------------------------------
		JButton vincular = new JButton("CONTRATO");

		botones.add(vincular);

		principal.add(botones, BorderLayout.CENTER);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();

	}
}