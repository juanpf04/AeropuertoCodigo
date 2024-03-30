package presentacion.modelo;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.modelo.TModelo;
import presentacion.controlador.Controlador;

public class VistaAltaModelo extends JFrame implements Observador {

	public VistaAltaModelo() {
		super("Alta Modelo");
		initGUI();
		this.setSize(1000, 750);
	}

	public void initGUI() {
		
		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));
		

		JLabel funcion = new JLabel("Alta Modelo");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		
		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel nombre = new JPanel();
		nombre.setLayout(new BoxLayout(nombre, BoxLayout.X_AXIS));
		JLabel etiquetaNombre = new JLabel("nombre: ");
		etiquetaNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoNombre = new JTextField();
		textoNombre.setMaximumSize(new Dimension(200, 30));
		textoNombre.setMinimumSize(new Dimension(200, 30));
		textoNombre.setPreferredSize(new Dimension(200, 30));
		nombre.add(etiquetaNombre);
		nombre.add(textoNombre);
		centro.add(nombre);
		
		
		JPanel motor = new JPanel();
		motor.setLayout(new BoxLayout(motor, BoxLayout.X_AXIS));
		JLabel etiquetaMotor = new JLabel("motor:    ");
		etiquetaMotor.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoMotor = new JTextField();
		textoMotor.setMaximumSize(new Dimension(200, 30));
		textoMotor.setMinimumSize(new Dimension(200, 30));
		textoMotor.setPreferredSize(new Dimension(200, 30));
		motor.add(etiquetaMotor);
		motor.add(textoMotor);
		centro.add(motor);

		//parece ser que hace la accion sin entrar en el actionListener
		//hay que frenar la ejecucion si no se pulsa aceptar(porque avanza solo el capullo)
		JButton aceptar = new JButton("aceptar");
		aceptar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Controlador controlador = Controlador.getInstance();
				String nombreLeido = textoNombre.getText();
				String motorLeido = textoMotor.getText();
				TModelo transfer = new TModelo(0, nombreLeido, motorLeido, true);
				controlador.accion(0, transfer);
			}
			
		});
		
		centro.add(aceptar);
		principal.add(funcion);
		principal.add(centro);
		
		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
	public void actualizaVista() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}