
package presentacion.avion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Alta Avion");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

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

			botones.add(privado);

			principal.add(botones, BorderLayout.CENTER);

			// -----------------------------------------------------
		} else { // TODO

			JPanel nombre = new JPanel();
			nombre.setLayout(new BoxLayout(nombre, BoxLayout.LINE_AXIS));
			JLabel etiquetaNombre = new JLabel("nombre: ");
			etiquetaNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoNombre = new JTextField();
			textoNombre.setMaximumSize(new Dimension(200, 30));
			textoNombre.setMinimumSize(new Dimension(200, 30));
			textoNombre.setPreferredSize(new Dimension(200, 30));
			nombre.add(etiquetaNombre);
			nombre.add(textoNombre);
			centro.add(nombre);

			JPanel matricula = new JPanel();
			matricula.setLayout(new BoxLayout(matricula, BoxLayout.X_AXIS));
			JLabel etiquetaMatricula = new JLabel("matricula:    ");
			etiquetaMatricula.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoMatricula = new JTextField();
			textoMatricula.setMaximumSize(new Dimension(200, 30));
			textoMatricula.setMinimumSize(new Dimension(200, 30));
			textoMatricula.setPreferredSize(new Dimension(200, 30));
			matricula.add(etiquetaMatricula);
			matricula.add(textoMatricula);
			centro.add(matricula);

			// TODO SPINNER O COMBOBOX PARA LA FECHA

			JPanel Asientos = new JPanel();
			Asientos.setLayout(new BoxLayout(Asientos, BoxLayout.X_AXIS));
			JLabel etiquetaAsientos = new JLabel("número de asientos:    ");
			etiquetaAsientos.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoAsientos = new JTextField();
			textoAsientos.setMaximumSize(new Dimension(200, 30));
			textoAsientos.setMinimumSize(new Dimension(200, 30));
			textoAsientos.setPreferredSize(new Dimension(200, 30));
			Asientos.add(etiquetaAsientos);
			Asientos.add(textoAsientos);
			centro.add(Asientos);

			JPanel aerolinea = new JPanel();
			aerolinea.setLayout(new BoxLayout(aerolinea, BoxLayout.X_AXIS));
			JLabel etiquetaAerolinea = new JLabel("id aerolínea:    ");
			etiquetaAerolinea.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoAerolinea = new JTextField();
			textoAerolinea.setMaximumSize(new Dimension(200, 30));
			textoAerolinea.setMinimumSize(new Dimension(200, 30));
			textoAerolinea.setPreferredSize(new Dimension(200, 30));
			aerolinea.add(etiquetaAerolinea);
			aerolinea.add(textoAerolinea);
			centro.add(aerolinea);

			JPanel modelo = new JPanel();
			modelo.setLayout(new BoxLayout(modelo, BoxLayout.X_AXIS));
			JLabel etiquetaModelo = new JLabel("id modelo:    ");
			etiquetaModelo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textomodelo = new JTextField();
			textomodelo.setMaximumSize(new Dimension(200, 30));
			textomodelo.setMinimumSize(new Dimension(200, 30));
			textomodelo.setPreferredSize(new Dimension(200, 30));
			modelo.add(etiquetaModelo);
			modelo.add(textomodelo);
			centro.add(modelo);

			JPanel hangar = new JPanel();
			hangar.setLayout(new BoxLayout(hangar, BoxLayout.X_AXIS));
			JLabel etiquetaHangar = new JLabel("id hangar:    ");
			etiquetaHangar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoHangar = new JTextField();
			textoHangar.setMaximumSize(new Dimension(200, 30));
			textoHangar.setMinimumSize(new Dimension(200, 30));
			textoHangar.setPreferredSize(new Dimension(200, 30));
			hangar.add(etiquetaHangar);
			hangar.add(textoHangar);
			centro.add(hangar);

			JPanel trabajadores = new JPanel();
			trabajadores.setLayout(new BoxLayout(trabajadores, BoxLayout.X_AXIS));
			JLabel etiquetaTrabajadores = new JLabel("número de trabajadores:    ");
			etiquetaTrabajadores.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoTrabajadores = new JTextField();
			textoTrabajadores.setMaximumSize(new Dimension(200, 30));
			textoTrabajadores.setMinimumSize(new Dimension(200, 30));
			textoTrabajadores.setPreferredSize(new Dimension(200, 30));

			JPanel duenyo = new JPanel();
			duenyo.setLayout(new BoxLayout(duenyo, BoxLayout.X_AXIS));
			JLabel etiquetaDuenyo = new JLabel("dueño:    ");
			etiquetaDuenyo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoDuenyo = new JTextField();
			textoDuenyo.setMaximumSize(new Dimension(200, 30));
			textoDuenyo.setMinimumSize(new Dimension(200, 30));
			textoDuenyo.setPreferredSize(new Dimension(200, 30));

			JPanel carnet = new JPanel();
			carnet.setLayout(new BoxLayout(carnet, BoxLayout.X_AXIS));
			JLabel etiquetaCarnet = new JLabel("id carnet:    ");
			etiquetaCarnet.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			JTextField textoCarnet = new JTextField();
			textoCarnet.setMaximumSize(new Dimension(200, 30));
			textoCarnet.setMinimumSize(new Dimension(200, 30));
			textoCarnet.setPreferredSize(new Dimension(200, 30));

			if ("COMERCIAL" == datos) {
				trabajadores.add(etiquetaTrabajadores);
				trabajadores.add(textoTrabajadores);
				centro.add(trabajadores);
			} else {
				duenyo.add(etiquetaDuenyo);
				duenyo.add(textoDuenyo);
				centro.add(duenyo);

				carnet.add(etiquetaCarnet);
				carnet.add(textoCarnet);
				centro.add(carnet);
			}

			JButton aceptar = new JButton("ACEPTAR");
			aceptar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO
					String nombre = textoNombre.getText();
					String matricula = textoMatricula.getText();
					int numAsientos = Integer.valueOf(textoAsientos.getText());
					int idAerolinea = Integer.valueOf(textoAerolinea.getText());
					int idHangar = Integer.valueOf(textoHangar.getText());
					int idModelo = Integer.valueOf(textomodelo.getText());

					TAvion transfer;
					if (datos == "COMERCIAL") {
						int trabajadores = Integer.valueOf(textoTrabajadores.getText());
						transfer = new TAComercial(0, numAsientos, LocalDate.of(2000, 6, 22), nombre, matricula, true,
								idAerolinea, idModelo, idHangar, trabajadores);
					} else {
						String nombre_duenyo = textoDuenyo.getText();
						int idCarnet = Integer.valueOf(textoCarnet.getText());
						transfer = new TAPrivado(0, numAsientos, LocalDate.of(2000, 6, 22), nombre, matricula, true,
								idAerolinea, idModelo, idHangar, nombre_duenyo, idCarnet);
					}
					ctrl.accion(EventosControlador.ALTA_AVION, transfer);
				}

			});

			centro.add(aceptar);
			principal.add(funcion);
			principal.add(centro);
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
		principal.add(atras, BorderLayout.PAGE_END);

		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}