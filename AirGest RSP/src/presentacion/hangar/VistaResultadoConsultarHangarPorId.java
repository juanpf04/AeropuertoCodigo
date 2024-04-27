package presentacion.hangar;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import negocio.hangar.THangar;
import presentacion.Observador;

public class VistaResultadoConsultarHangarPorId extends JFrame implements Observador {

	public VistaResultadoConsultarHangarPorId() {
		super("Resultado");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		String hangar = datos == null ? "" : ((THangar) datos).toString();

		JLabel exito = new JLabel(hangar);
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