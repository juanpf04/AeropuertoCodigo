
package presentacion.aerolinea;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import negocio.aerolinea.TAerolinea;
import presentacion.Observador;
import presentacion.UtilidadesP;

public class VistaResultadoConsultarAerolineaPorId extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public void actualizaVista(Object datos) {
		UtilidadesP.setAirGestRSP(this);
		this.setSize(600, 650);
		
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		String aerolinea = datos == null ? "" : ((TAerolinea) datos).toString();

		JLabel exito = new JLabel(aerolinea);
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