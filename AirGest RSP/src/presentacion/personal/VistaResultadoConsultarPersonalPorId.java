package presentacion.personal;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import negocio.personal.TPersonal;
import presentacion.Observador;

public class VistaResultadoConsultarPersonalPorId extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public VistaResultadoConsultarPersonalPorId() {
		super("Resultado");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		String personal = datos == null ? "" : ((TPersonal) datos).toString();

		JTextArea exito = new JTextArea(personal);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		exito.setEditable(false);
		exito.setAlignmentX(CENTER_ALIGNMENT);
		principal.add(exito, BorderLayout.PAGE_START);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();

	}
}