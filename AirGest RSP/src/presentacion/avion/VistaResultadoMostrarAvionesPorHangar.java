package presentacion.avion;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import negocio.avion.TAvion;
import presentacion.Observador;
import presentacion.UtilidadesP;

public class VistaResultadoMostrarAvionesPorHangar extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public void actualizaVista(Object datos) {
		UtilidadesP.setAirGestRSP(this);
		this.setSize(1000, 750);
		
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		@SuppressWarnings("unchecked")
		List<TAvion> aviones = (List<TAvion>) datos;

		String s = "";
		for (TAvion a : aviones)
			s += a.toString() + "\n";

		JTextArea exito = new JTextArea(s);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		exito.setEditable(false);
		principal.add(exito, BorderLayout.PAGE_START);

		JScrollPane scroll = new JScrollPane(exito);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		principal.add(scroll, BorderLayout.CENTER);

		JButton atras = new JButton("ATRAS"); // boton para volver a la ventana
												// principal
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
		this.pack();
	}

}