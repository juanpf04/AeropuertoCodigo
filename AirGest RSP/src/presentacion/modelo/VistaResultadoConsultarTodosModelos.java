package presentacion.modelo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import negocio.modelo.TModelo;
import presentacion.Observador;

public class VistaResultadoConsultarTodosModelos extends JFrame implements Observador {

	public VistaResultadoConsultarTodosModelos() {
		super("Resultado");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());
		
		List<TModelo> modelos = (List<TModelo>) datos;
		
		String s="";
		for(TModelo mo: modelos)
			s += mo.toString() + "\n";

		JTextArea exito = new JTextArea(s);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 20));
//		exito.setHorizontalAlignment(SwingConstants.CENTER);
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