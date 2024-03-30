package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VistaFalloAltaModelo extends JFrame implements Observador {

	public VistaFalloAltaModelo() {
		super("Fallo");
		this.setSize(1000, 750);
	}
	
	public void actualizaVista() {
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());
		
		JLabel exito = new JLabel("Alta de Modelo fallida! :(");
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		exito.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(exito, BorderLayout.PAGE_START);
		
		JButton imagen =new JButton();
		imagen.setIcon( new ImageIcon("recursos/iconos/fallo.png" ));
		principal.add(imagen, BorderLayout.CENTER);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//cerrar la pesta�a
			}

		});
		principal.add(aceptar, BorderLayout.PAGE_END);
		
		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();

	}
}