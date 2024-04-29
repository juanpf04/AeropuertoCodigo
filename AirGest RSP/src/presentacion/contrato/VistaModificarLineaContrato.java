
package presentacion.contrato;

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

import negocio.contrato.TCarrito;
import negocio.lineaContrato.TLineaContrato;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaModificarLineaContrato extends JFrame implements Observador {
	
	public VistaModificarLineaContrato(){
		super("Modificar Linea Contrato");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		
		Controlador controlador = Controlador.getInstance();

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Modificar Linea Contrato");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));
		
		JPanel id_contrato = new JPanel();
		id_contrato.setLayout(new BoxLayout(id_contrato, BoxLayout.LINE_AXIS));
		JLabel etiquetaContrato = new JLabel("id contrato: ");
		etiquetaContrato.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoContrato = new JTextField();
		textoContrato.setMaximumSize(new Dimension(200, 30));
		textoContrato.setMinimumSize(new Dimension(200, 30));
		textoContrato.setPreferredSize(new Dimension(200, 30));
		id_contrato.add(etiquetaContrato);
		id_contrato.add(textoContrato);
		centro.add(id_contrato);

		JPanel id = new JPanel();
		id.setLayout(new BoxLayout(id, BoxLayout.LINE_AXIS));
		JLabel etiquetaId = new JLabel("id hangar: ");
		etiquetaId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoId = new JTextField();
		textoId.setMaximumSize(new Dimension(200, 30));
		textoId.setMinimumSize(new Dimension(200, 30));
		textoId.setPreferredSize(new Dimension(200, 30));
		id.add(etiquetaId);
		id.add(textoId);
		centro.add(id);
		
		JPanel fecha_ini = new JPanel();
		fecha_ini.setLayout(new BoxLayout(fecha_ini, BoxLayout.LINE_AXIS));
		JLabel etiquetaIni = new JLabel("fecha inicio: ");
		etiquetaIni.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		LocalDate currentDate = LocalDate.now();
		Date initialDate = Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());//pasarlo a Date para el spinner
		SpinnerDateModel model = new SpinnerDateModel(initialDate, null, null, java.util.Calendar.DAY_OF_MONTH);
		JSpinner spinnerIni = new JSpinner(model);
		spinnerIni.setMaximumSize(new Dimension(200, 30));
		spinnerIni.setMinimumSize(new Dimension(200, 30));
		spinnerIni.setPreferredSize(new Dimension(200, 30));
	    JSpinner.DateEditor editor = new JSpinner.DateEditor(spinnerIni, "dd/MM/yyyy");//formato de la fecha
	    spinnerIni.setEditor(editor);
	    fecha_ini.add(etiquetaIni);
	    fecha_ini.add(spinnerIni);
	    centro.add(fecha_ini);
	    
	    JPanel fecha_fin = new JPanel();
	    fecha_fin.setLayout(new BoxLayout(fecha_fin, BoxLayout.LINE_AXIS));
		JLabel etiquetaFin = new JLabel("fecha fin: ");
		etiquetaFin.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		SpinnerDateModel model2 = new SpinnerDateModel(initialDate, null, null, java.util.Calendar.DAY_OF_MONTH);
		JSpinner spinnerFin = new JSpinner(model2);
		spinnerFin.setMaximumSize(new Dimension(200, 30));
		spinnerFin.setMinimumSize(new Dimension(200, 30));
		spinnerFin.setPreferredSize(new Dimension(200, 30));
	    JSpinner.DateEditor editor2 = new JSpinner.DateEditor(spinnerFin, "dd/MM/yyyy");//formato de la fecha
	    spinnerFin.setEditor(editor2);
	    fecha_fin.add(etiquetaFin);
	    fecha_fin.add(spinnerFin);
	    centro.add(fecha_fin);
	    
	    JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					int id_contrato = Integer.parseInt(textoContrato.getText());
					int id_hangar = Integer.parseInt(textoId.getText());
					Date seleccion = (Date) spinnerIni.getValue();
					ZonedDateTime zonedDateTime = seleccion.toInstant().atZone(ZoneId.systemDefault());//para transformar date a localDate
					LocalDate fecha_ini = zonedDateTime.toLocalDate();
					seleccion = (Date) spinnerFin.getValue();
					zonedDateTime = seleccion.toInstant().atZone(ZoneId.systemDefault());
					LocalDate fecha_fin = zonedDateTime.toLocalDate();
					TLineaContrato linea = new TLineaContrato(id_contrato, id_hangar, fecha_ini, fecha_fin, 0);
					controlador.accion(EventosControlador.MODIFICAR_LINEA_CONTRATO, linea);
					dispose();
				} catch (NumberFormatException n){
					
				}
			}

		});

		centro.add(aceptar);
		
		JButton atras = new JButton("ATRAS"); //boton para volver a la ventana principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				controlador.accion(EventosControlador.VISTA_CONTRATO, null);
			}

		});
	    
	    
	    principal.add(funcion);
		principal.add(centro);
		principal.add(atras, BorderLayout.PAGE_END);
	    
	    this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}