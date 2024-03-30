
package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.modelo.TModelo;
import presentacion.controlador.ControladorImp;

@SuppressWarnings("serial")
public class VistaAltaDeModelo extends JFrame implements Observador {
	
	//OMG
	String nombreLeido;
	String motorLeido;
	
	
	public VistaAltaDeModelo() {
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
				nombreLeido = textoNombre.getText();
				motorLeido = textoMotor.getText();
				//como llamamos ahora a vista de fallo y de exito?
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

	//no nos mateis por favor no sabiamos como llevar estos datos al controladorImp...
	public TModelo crearTransfer(){
		TModelo transfer = new TModelo();
		transfer.setMotor(motorLeido);
		transfer.setNombre(nombreLeido);
		return transfer;
	}
	
	public void actualizaVista() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}