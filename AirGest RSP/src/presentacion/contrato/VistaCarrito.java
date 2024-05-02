
package presentacion.contrato;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import negocio.contrato.TCarrito;
import negocio.lineaContrato.TLineaContrato;
import presentacion.Observador;
import presentacion.UtilidadesP;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaCarrito extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;
	
	public void actualizaVista(Object datos) {
		UtilidadesP.setAirGestRSP(this);
		this.setSize(1000, 750);
		
		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		TCarrito carrito = (TCarrito) datos;

		JLabel modulo = new JLabel("Carrito aerolinea " + carrito.getIdAerolinea()); // titulo
																						// de
																						// la
																						// ventana
																						// en
																						// la
																						// que
																						// estamos,
																						// apareceran
																						// las
																						// funciones
																						// de
																						// modelo
		modulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
		modulo.setHorizontalAlignment(SwingConstants.CENTER);
		principal.add(modulo, BorderLayout.PAGE_START);

		JPanel botones = new JPanel();
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));

		Controlador ctrl = Controlador.getInstance();

		JButton añadir = new JButton("AÑADIR HANGAR");
		añadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_ANYADIR_HANGAR_AL_CONTRATO, carrito);
			}
		});
		botones.add(añadir);

		// -------------------------------------------
		JButton eliminar = new JButton("ELIMINAR HANGAR");
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.VISTA_ELIMINAR_HANGAR_DEL_CONTRATO, carrito);
			}
		});
		botones.add(eliminar);

		// -------------------------------------------
		JButton cerrar = new JButton("CERRAR CONTRATO");

		cerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ctrl.accion(EventosControlador.CERRAR_CONTRATO, carrito);
			}
		});
		botones.add(cerrar);

		principal.add(botones, BorderLayout.CENTER);

		// -----------------------------------------------------

		String s = "";
		for (TLineaContrato l : carrito.getLineasContrato()) {
			s += "id_hangar: " + l.getIdHangar() + " fecha_ini: " + l.getFechaIni() + " fecha_fin: " + l.getFechaFin()
					+ "\n";
		}

		JTextArea exito = new JTextArea(s);
		exito.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		exito.setLineWrap(true); // Habilita el ajuste automático de línea
		exito.setWrapStyleWord(true); // Ajusta el texto en palabras completas
		exito.setEditable(false); // Hace que el JTextArea sea de solo lectura

		JScrollPane scroll = new JScrollPane(exito);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setPreferredSize(new Dimension(500, 300)); // Ajusta el tamaño
															// del JScrollPane
		principal.add(scroll, BorderLayout.CENTER);

		// -----------------------------------------------------

		JButton atras = new JButton("ATRAS"); // boton para volver a la ventana
												// principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ctrl.accion(EventosControlador.VISTA_CONTRATO, null);
			}

		});
		principal.add(atras, BorderLayout.PAGE_END);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}