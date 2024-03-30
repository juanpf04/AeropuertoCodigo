package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import presentacion.controlador.Controlador;
import presentacion.controlador.ControladorImp;

@SuppressWarnings("serial")
public class VistaGeneralModelo extends JFrame implements Observador {

	public VistaGeneralModelo() {
		super("MODELO");
		initGUI();
		this.setSize(1000, 750); //hace que la ventana no salga tan chiquitita
	}
	
	
	public void initGUI() {
		
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());
		
		
		JLabel modulo = new JLabel("MODELO"); //titulo de la ventana en la que estamos, apareceran las funciones de modelo 
		modulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
		modulo.setHorizontalAlignment(SwingConstants.CENTER); //ESTO ES LO QUE LO CENTRA, SWINGCONSTANTS
		principal.add(modulo, BorderLayout.PAGE_START);
		
		
		JPanel botones = new JPanel();
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));
		
		JButton alta = new JButton("ALTA DE MODELO");
		alta.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				//ALTA MODELO ES == 0
				//NO OS ENFADEIS CON NOSOTROS, POSIBLE FUMADA!!!!!!!!!!!!!!!!11
				ControladorImp controlador = new ControladorImp();
				controlador.accion(0);
				//pero funciona B)
			}
		});
		alta.setToolTipText("Aqui das de alta un modelo maquina");
		botones.add(alta);
		
		//-------------------------------------------
		JButton baja = new JButton("BAJA DE MODELO");
		
		botones.add(baja);
		
		//-------------------------------------------
		JButton consultarID = new JButton("CONSULTAR MODELO POR ID");
		
		botones.add(consultarID);
		
		//-------------------------------------------
		JButton consultarTodos = new JButton("CONSULTAR TODOS LOS MODELOS");
		
		botones.add(consultarTodos);
		
		//-------------------------------------------
		JButton modificar = new JButton("MODIFICAR MODELO");
		
		botones.add(modificar);
		
		//-------------------------------------------
		JButton vincular = new JButton("VINCULAR MODELO");
		
		botones.add(vincular);
		
		//-------------------------------------------
		JButton desvincular = new JButton("DESVINCULAR MODELO");
		
		botones.add(desvincular);
		
				
		principal.add(botones, BorderLayout.CENTER);
		
		JButton atras = new JButton("ATRAS"); //boton para volver a la ventana principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		
		
		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
	
	
	
	
	@Override
	public void actualizaVista() {
		// TODO Auto-generated method stub
		
	}

}
