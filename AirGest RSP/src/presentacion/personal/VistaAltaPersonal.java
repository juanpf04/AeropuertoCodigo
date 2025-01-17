package presentacion.personal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import negocio.personal.TPLimpieza;
import negocio.personal.TPSeguridad;
import negocio.personal.TPersonal;
import presentacion.Observador;
import presentacion.UtilidadesP;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaAltaPersonal extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public void actualizaVista(Object datos) {
		UtilidadesP.setAirGestRSP(this);
		this.setSize(450, 250);
		
		Controlador ctrl = Controlador.getInstance();


		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JPanel funcion = new JPanel();
		funcion.setLayout(new BoxLayout(funcion,BoxLayout.PAGE_AXIS));
		
		JPanel panel_titulo = new JPanel();
		JLabel titulo = new JLabel("Alta Personal");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		titulo.setBorder(new LineBorder(Color.BLACK, 2));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_titulo.add(titulo);
		
		funcion.add(panel_titulo);
		principal.add(funcion);

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.LINE_AXIS));
		centro.setAlignmentX(CENTER_ALIGNMENT);
		principal.add(centro);

		JPanel panelBotones = new JPanel();
		principal.add(panelBotones);
		panelBotones.setAlignmentX(CENTER_ALIGNMENT);

		if (datos == null) {
			JPanel botones = new JPanel();
			botones.setLayout(new GridLayout(0,1,8,8));

			// -------------------------------------------
			JButton seguridad = new JButton("PERSONAL DE SEGURIDAD");

			seguridad.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					ctrl.accion(EventosControlador.VISTA_ALTA_PERSONAL, "SEGURIDAD");
				}
			});

			seguridad.setAlignmentX(CENTER_ALIGNMENT);
			botones.add(seguridad);

			// -------------------------------------------
			JButton limpieza = new JButton("PERSONAL DE LIMPIEZA");

			limpieza.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					ctrl.accion(EventosControlador.VISTA_ALTA_PERSONAL, "LIMPIEZA");
				}
			});

			limpieza.setAlignmentX(CENTER_ALIGNMENT);
			botones.add(limpieza);
			botones.add(panelBotones);

			principal.add(botones);

			// -----------------------------------------------------
		} else {
			JPanel panelEtiquetas = new JPanel();
			panelEtiquetas.setLayout(new BoxLayout(panelEtiquetas, BoxLayout.PAGE_AXIS));

			JPanel panelTexto = new JPanel();
			panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.PAGE_AXIS));

			JLabel etiquetaIdEmpleado = new JLabel("Id de empleado: ");
			etiquetaIdEmpleado.setFont(new Font("Tahoma", Font.BOLD, 25));
			JTextField textoIdEmpleado = new JTextField();
			textoIdEmpleado.setMaximumSize(new Dimension(200, 30));
			textoIdEmpleado.setMinimumSize(new Dimension(200, 30));
			textoIdEmpleado.setPreferredSize(new Dimension(200, 30));
			textoIdEmpleado.setFont(new Font("Tahoma", Font.BOLD, 18));
			textoIdEmpleado.setToolTipText("numero natural sin el 0");
			panelEtiquetas.add(etiquetaIdEmpleado);
			panelTexto.add(textoIdEmpleado);
			centro.add(panelEtiquetas);
			centro.add(panelTexto);

			JLabel etiquetaAreaAsignada = new JLabel("�rea asignada:    ");
			etiquetaAreaAsignada.setFont(new Font("Tahoma", Font.BOLD, 25));
			JTextField textoAreaAsignada = new JTextField();
			textoAreaAsignada.setMaximumSize(new Dimension(200, 30));
			textoAreaAsignada.setMinimumSize(new Dimension(200, 30));
			textoAreaAsignada.setPreferredSize(new Dimension(200, 30));
			textoAreaAsignada.setFont(new Font("Tahoma", Font.BOLD, 18));
			panelEtiquetas.add(etiquetaAreaAsignada);
			panelTexto.add(textoAreaAsignada);

			JLabel etiquetaRol = new JLabel("Rol:    ");
			etiquetaRol.setFont(new Font("Tahoma", Font.BOLD, 25));
			JTextField textoRol = new JTextField();
			textoRol.setMaximumSize(new Dimension(200, 30));
			textoRol.setMinimumSize(new Dimension(200, 30));
			textoRol.setPreferredSize(new Dimension(200, 30));
			textoRol.setFont(new Font("Tahoma", Font.BOLD, 18));

			JLabel etiquetaNumPlaca = new JLabel("N�mero de placa:    ");
			etiquetaNumPlaca.setFont(new Font("Tahoma", Font.BOLD, 25));
			JTextField textoNumPlaca = new JTextField();
			textoNumPlaca.setMaximumSize(new Dimension(200, 30));
			textoNumPlaca.setMinimumSize(new Dimension(200, 30));
			textoNumPlaca.setPreferredSize(new Dimension(200, 30));
			textoNumPlaca.setFont(new Font("Tahoma", Font.BOLD, 18));

			if ("LIMPIEZA" == datos) {
				panelEtiquetas.add(etiquetaRol);
				panelTexto.add(textoRol);
			} else {

				panelEtiquetas.add(etiquetaNumPlaca);
				panelTexto.add(textoNumPlaca);
			}

			JButton aceptar = new JButton("ACEPTAR");
			aceptar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int idEmpleado = Integer.valueOf(textoIdEmpleado.getText());
						String areaAsignada = textoAreaAsignada.getText();

						TPersonal transfer;
						if (datos == "SEGURIDAD") {
							int numPlaca = Integer.valueOf(textoNumPlaca.getText());
							transfer = new TPSeguridad(0, idEmpleado, areaAsignada, true, numPlaca);
						} else {
							String rol = textoRol.getText();
							transfer = new TPLimpieza(0, idEmpleado, areaAsignada, true, rol);
						}
						ctrl.accion(EventosControlador.ALTA_PERSONAL, transfer);
					} catch (Exception ex) {

					}
				}

			});

			panelBotones.add(aceptar);

		}

		JButton atras = new JButton("ATRAS"); // boton para volver a la ventana
												// principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				if (datos == null)
					ctrl.accion(EventosControlador.VISTA_PERSONAL, null);
				else
					ctrl.accion(EventosControlador.VISTA_ALTA_PERSONAL, null);
			}

		});
		panelBotones.add(atras);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setResizable(false);
	}
}