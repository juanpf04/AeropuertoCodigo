
package presentacion.avion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import negocio.avion.TAComercial;
import negocio.avion.TAPrivado;
import negocio.avion.TAvion;
import negocio.modelo.TModelo;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaAltaAvion extends JFrame implements Observador {

	public VistaAltaAvion() {
		super("Alta Avion");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		Controlador ctrl = Controlador.getInstance();

		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		JLabel funcion = new JLabel("Alta Avion");
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
			JButton comercial = new JButton("AVION COMERCIAL");

			comercial.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					ctrl.accion(EventosControlador.VISTA_ALTA_AVION, "COMERCIAL");
				}
			});
			
			comercial.setAlignmentX(CENTER_ALIGNMENT);
			botones.add(comercial);

			// -------------------------------------------
			JButton privado = new JButton("AVION PRIVADO");

			privado.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					ctrl.accion(EventosControlador.VISTA_ALTA_AVION, "PRIVADO");
				}
			});

			privado.setAlignmentX(CENTER_ALIGNMENT);
			botones.add(privado);

			principal.add(botones, BorderLayout.SOUTH);

			// -----------------------------------------------------
		} else { // TODO
			JPanel panelEtiquetas = new JPanel();
			panelEtiquetas.setLayout(new BoxLayout(panelEtiquetas, BoxLayout.PAGE_AXIS));
			
			JPanel panelTexto = new JPanel();
			panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.PAGE_AXIS));
			
			JLabel etiquetaNombre = new JLabel("nombre: ");
			etiquetaNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoNombre = new JTextField();
			textoNombre.setMaximumSize(new Dimension(200, 30));
			textoNombre.setMinimumSize(new Dimension(200, 30));
			textoNombre.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaNombre);
			panelTexto.add(textoNombre);
			centro.add(panelEtiquetas);
			centro.add(panelTexto);

			JLabel etiquetaMatricula = new JLabel("matricula:    ");
			etiquetaMatricula.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoMatricula = new JTextField();
			textoMatricula.setMaximumSize(new Dimension(200, 30));
			textoMatricula.setMinimumSize(new Dimension(200, 30));
			textoMatricula.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaMatricula);
			panelTexto.add(textoMatricula);

			
			// SPINNER O COMBOBOX PARA LA FECHA
			JLabel etiquetaFecha = new JLabel("Fecha de Fabricación: ");
			etiquetaFecha.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			LocalDate currentDate = LocalDate.now();
			Date initialDate = Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());//pasarlo a Date para el spinner
			SpinnerDateModel model = new SpinnerDateModel(initialDate, null, initialDate, java.util.Calendar.DAY_OF_MONTH);
			JSpinner spinner = new JSpinner(model);
		    JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yyyy");//formato de la fecha
		    spinner.setEditor(editor);
		    panelEtiquetas.add(etiquetaFecha);
			panelTexto.add(spinner);

			JLabel etiquetaAsientos = new JLabel("número de asientos:    ");
			etiquetaAsientos.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoAsientos = new JTextField();
			textoAsientos.setMaximumSize(new Dimension(200, 30));
			textoAsientos.setMinimumSize(new Dimension(200, 30));
			textoAsientos.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaAsientos);
			panelTexto.add(textoAsientos);
			
			JLabel etiquetaAerolinea = new JLabel("id aerolínea:    ");
			etiquetaAerolinea.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoAerolinea = new JTextField();
			textoAerolinea.setMaximumSize(new Dimension(200, 30));
			textoAerolinea.setMinimumSize(new Dimension(200, 30));
			textoAerolinea.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaAerolinea);
			panelTexto.add(textoAerolinea);
			
			
			JLabel etiquetaModelo = new JLabel("id modelo:    ");
			etiquetaModelo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textomodelo = new JTextField();
			textomodelo.setMaximumSize(new Dimension(200, 30));
			textomodelo.setMinimumSize(new Dimension(200, 30));
			textomodelo.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaModelo);
			panelTexto.add(textomodelo);
			
			
			JLabel etiquetaHangar = new JLabel("id hangar:    ");
			etiquetaHangar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoHangar = new JTextField();
			textoHangar.setMaximumSize(new Dimension(200, 30));
			textoHangar.setMinimumSize(new Dimension(200, 30));
			textoHangar.setPreferredSize(new Dimension(200, 30));
			panelEtiquetas.add(etiquetaHangar);
			panelTexto.add(textoHangar);
			
			
			JLabel etiquetaTrabajadores = new JLabel("número de trabajadores:    ");
			etiquetaTrabajadores.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoTrabajadores = new JTextField();
			textoTrabajadores.setMaximumSize(new Dimension(200, 30));
			textoTrabajadores.setMinimumSize(new Dimension(200, 30));
			textoTrabajadores.setPreferredSize(new Dimension(200, 30));

		
			JLabel etiquetaDuenyo = new JLabel("dueño:    ");
			etiquetaDuenyo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoDuenyo = new JTextField();
			textoDuenyo.setMaximumSize(new Dimension(200, 30));
			textoDuenyo.setMinimumSize(new Dimension(200, 30));
			textoDuenyo.setPreferredSize(new Dimension(200, 30));

			
			JLabel etiquetaCarnet = new JLabel("id carnet:    ");
			etiquetaCarnet.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoCarnet = new JTextField();
			textoCarnet.setMaximumSize(new Dimension(200, 30));
			textoCarnet.setMinimumSize(new Dimension(200, 30));
			textoCarnet.setPreferredSize(new Dimension(200, 30));

			if ("COMERCIAL" == datos) {
				panelEtiquetas.add(etiquetaTrabajadores);
				panelTexto.add(textoTrabajadores);
			} else {
				panelEtiquetas.add(etiquetaDuenyo);
				panelTexto.add(textoDuenyo);

				panelEtiquetas.add(etiquetaCarnet);
				panelTexto.add(textoCarnet);
			}

			JButton aceptar = new JButton("ACEPTAR");
			aceptar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try{
						String nombre = textoNombre.getText();
						String matricula = textoMatricula.getText();
						int numAsientos = Integer.valueOf(textoAsientos.getText());
						int idAerolinea = Integer.valueOf(textoAerolinea.getText());
						int idHangar = Integer.valueOf(textoHangar.getText());
						int idModelo = Integer.valueOf(textomodelo.getText());
						Date seleccion = (Date) spinner.getValue();
						ZonedDateTime zonedDateTime = seleccion.toInstant().atZone(ZoneId.systemDefault());//para transformar date a localDate
						LocalDate fecha = zonedDateTime.toLocalDate();
						
						TAvion transfer;
						if (datos == "COMERCIAL") {
							int trabajadores = Integer.valueOf(textoTrabajadores.getText());
							transfer = new TAComercial(0, numAsientos, fecha, nombre, matricula, true,
									idAerolinea, idModelo, idHangar, trabajadores);
						} else {
							String nombre_duenyo = textoDuenyo.getText();
							int idCarnet = Integer.valueOf(textoCarnet.getText());
							transfer = new TAPrivado(0, numAsientos, fecha, nombre, matricula, true,
									idAerolinea, idModelo, idHangar, nombre_duenyo, idCarnet);
						}
						ctrl.accion(EventosControlador.ALTA_AVION, transfer);
					}catch(Exception ex)
					{
						
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
					ctrl.accion(EventosControlador.VISTA_AVION, null);
				else
					ctrl.accion(EventosControlador.VISTA_ALTA_AVION, null);
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