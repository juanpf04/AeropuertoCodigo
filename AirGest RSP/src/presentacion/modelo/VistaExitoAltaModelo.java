package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

public class VistaExitoAltaModelo extends JFrame implements Observador {

	public VistaExitoAltaModelo() {
		super("Exito");
		this.setSize(1000, 750);
	}

	public void actualizaVista() {
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel exito = new JLabel("Alta de Modelo exitosa!");
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		exito.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(exito, BorderLayout.PAGE_START);

		JButton imagen = new JButton();
		imagen.setIcon(new ImageIcon("recursos/iconos/exito.png"));
		principal.add(imagen, BorderLayout.CENTER);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();

	}
}