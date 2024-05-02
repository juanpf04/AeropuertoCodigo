package presentacion.personal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.personal.TPLimpieza;
import negocio.personal.TPSeguridad;
import negocio.personal.TPersonal;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaModificarPersonal extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;

	public VistaModificarPersonal() {
		super("Modificar Personal");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		Controlador ctrl = Controlador.getInstance();

		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel funcion = new JLabel("Modificar Personal");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));
		funcion.setAlignmentX(CENTER_ALIGNMENT);
		principal.add(funcion, BorderLayout.NORTH);

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.LINE_AXIS));
		principal.add(centro, BorderLayout.CENTER);

		JPanel panelBotones = new JPanel();
		principal.add(panelBotones, BorderLayout.SOUTH);

		if (datos == null) {
			JPanel botones = new JPanel();
			botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));

			// -------------------------------------------
			JButton seguridad = new JButton("PERSONAL DE SEGURIDAD");

			seguridad.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					ctrl.accion(EventosControlador.VISTA_MODIFICAR_PERSONAL, "SEGURIDAD");
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
					ctrl.accion(EventosControlador.VISTA_MODIFICAR_PERSONAL, "LIMPIEZA");
				}
			});

			limpieza.setAlignmentX(CENTER_ALIGNMENT);
			botones.add(limpieza);
			botones.add(panelBotones);

			principal.add(botones, BorderLayout.SOUTH);

			// -----------------------------------------------------
		} else {
			JPanel panelEtiquetas = new JPanel();
			panelEtiquetas.setLayout(new BoxLayout(panelEtiquetas, BoxLayout.PAGE_AXIS));

			JPanel panelTexto = new JPanel();
			panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.PAGE_AXIS));
			
			JLabel etiquetaId = new JLabel("Id: ");
			etiquetaId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoId = new JTextField();
			textoId.setMaximumSize(new Dimension(200, 30));
			textoId.setMinimumSize(new Dimension(200, 30));
			textoId.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaId);
			panelTexto.add(textoId);
			centro.add(panelEtiquetas);
			centro.add(panelTexto);

			JLabel etiquetaIdEmpleado = new JLabel("Id de empleado: ");
			etiquetaIdEmpleado.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoIdEmpleado = new JTextField();
			textoIdEmpleado.setMaximumSize(new Dimension(200, 30));
			textoIdEmpleado.setMinimumSize(new Dimension(200, 30));
			textoIdEmpleado.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaIdEmpleado);
			panelTexto.add(textoIdEmpleado);
			centro.add(panelEtiquetas);
			centro.add(panelTexto);

			JLabel etiquetaAreaAsignada = new JLabel("�rea asignada:    ");
			etiquetaAreaAsignada.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoAreaAsignada = new JTextField();
			textoAreaAsignada.setMaximumSize(new Dimension(200, 30));
			textoAreaAsignada.setMinimumSize(new Dimension(200, 30));
			textoAreaAsignada.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaAreaAsignada);
			panelTexto.add(textoAreaAsignada);

			JLabel etiquetaRol = new JLabel("Rol:    ");
			etiquetaRol.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoRol = new JTextField();
			textoRol.setMaximumSize(new Dimension(200, 30));
			textoRol.setMinimumSize(new Dimension(200, 30));
			textoRol.setPreferredSize(new Dimension(200, 30));

			JLabel etiquetaNumPlaca = new JLabel("N�mero de placa:    ");
			etiquetaNumPlaca.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoNumPlaca = new JTextField();
			textoNumPlaca.setMaximumSize(new Dimension(200, 30));
			textoNumPlaca.setMinimumSize(new Dimension(200, 30));
			textoNumPlaca.setPreferredSize(new Dimension(200, 30));

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
						int id = Integer.valueOf(textoId.getText());
						int idEmpleado = Integer.valueOf(textoIdEmpleado.getText());
						String areaAsignada = textoAreaAsignada.getText();

						TPersonal transfer;
						if (datos == "SEGURIDAD") {
							int numPlaca = Integer.valueOf(textoNumPlaca.getText());
							transfer = new TPSeguridad(id, idEmpleado, areaAsignada, true, numPlaca);
						} else {
							String rol = textoRol.getText();
							transfer = new TPLimpieza(id, idEmpleado, areaAsignada, true, rol);
						}
						ctrl.accion(EventosControlador.MODIFICAR_PERSONAL, transfer);
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
					ctrl.accion(EventosControlador.VISTA_MODIFICAR_PERSONAL, null);
			}

		});
		panelBotones.add(atras);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}