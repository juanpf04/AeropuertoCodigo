package presentacion.personal;

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

import negocio.personal.TPersonal;
import presentacion.Observador;

public class VistaResultadoConsultarPersonalExistente extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public VistaResultadoConsultarPersonalExistente() {
		super("Resultado");
		this.setSize(600, 650);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		@SuppressWarnings("unchecked")
		List<TPersonal> personal = (List<TPersonal>) datos;

		String s = "";
		for (TPersonal mo : personal)
			s += mo.toString() + "\n";

		JTextArea exito = new JTextArea(s);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		principal.add(exito, BorderLayout.PAGE_START);
		JScrollPane scroll = new JScrollPane(exito, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

	}
}