package presentacion.personal;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import negocio.personal.TPersonal;
import presentacion.Observador;

public class VistaResultadoConsultarPersonalPorId extends JFrame implements Observador {

	/**
	 * 
	 */
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

		JLabel exito = new JLabel(personal);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		exito.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(exito, BorderLayout.PAGE_START);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();

	}
}