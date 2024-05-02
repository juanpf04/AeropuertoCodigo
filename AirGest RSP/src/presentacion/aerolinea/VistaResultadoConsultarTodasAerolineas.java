
package presentacion.aerolinea;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import negocio.aerolinea.TAerolinea;
import presentacion.Observador;

public class VistaResultadoConsultarTodasAerolineas extends JFrame implements Observador {

	public VistaResultadoConsultarTodasAerolineas() {
		super("Resultado");
		this.setSize(600, 650);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		List<TAerolinea> aerolineas = (List<TAerolinea>) datos;

		String s = "";
		for (TAerolinea ae : aerolineas)
			s += ae.toString() + "\n";

		JTextArea exito = new JTextArea(s);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		principal.add(exito, BorderLayout.PAGE_START);
		exito.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(exito, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		principal.add(scroll, BorderLayout.CENTER);

		JButton atras = new JButton("ATRAS");
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		principal.add(atras, BorderLayout.SOUTH);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);

	}
}