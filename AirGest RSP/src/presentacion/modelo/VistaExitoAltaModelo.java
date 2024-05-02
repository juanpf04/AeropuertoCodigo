package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;

import presentacion.Observador;

public class VistaExitoAltaModelo extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public VistaExitoAltaModelo() {
		super("Exito");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel exito = new JLabel("Alta de Modelo exitosa! con id = " + (Integer) datos);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		exito.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(exito, BorderLayout.PAGE_START);

		JLabel imagen = new JLabel();
		imagen.setIcon(new ImageIcon("recursos/iconos/exito.png"));
		principal.add(imagen, BorderLayout.CENTER);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();

	}
}