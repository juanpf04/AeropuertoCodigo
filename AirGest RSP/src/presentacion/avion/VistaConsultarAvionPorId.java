
package presentacion.avion;

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

import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaConsultarAvionPorId extends JFrame implements Observador {
	
	private static final long serialVersionUID = 1L;

	public VistaConsultarAvionPorId() {
		super("Consultar Avion por id");
		this.setSize(1000, 750);
	}
	
	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());
		
		JPanel panelFuncion = new JPanel();
		JLabel funcion = new JLabel("Consultar avion por id");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));
		panelFuncion.add(funcion);
		panelFuncion.setAlignmentX(CENTER_ALIGNMENT);

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel id = new JPanel();
		id.setLayout(new BoxLayout(id, BoxLayout.LINE_AXIS));
		JLabel etiquetaId = new JLabel("id: ");
		etiquetaId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoId = new JTextField();
		textoId.setMaximumSize(new Dimension(200, 30));
		textoId.setMinimumSize(new Dimension(200, 30));
		textoId.setPreferredSize(new Dimension(200, 30));
		id.add(etiquetaId);
		id.add(textoId);
		centro.add(id);

		Controlador controlador = Controlador.getInstance();
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.PAGE_AXIS));

		JButton aceptar = new JButton("ACEPTAR");
		aceptar.setAlignmentX(CENTER_ALIGNMENT);
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(textoId.getText());
					controlador.accion(EventosControlador.CONSULTAR_AVION_POR_ID, id);
				} catch (NumberFormatException n) {
					controlador.accion(EventosControlador.CONSULTAR_AVION_POR_ID, 0);
				}
			}
		});

		panelBotones.add(aceptar);
		principal.add(panelFuncion, BorderLayout.NORTH);
		principal.add(centro, BorderLayout.CENTER);

		JButton atras = new JButton("ATRAS"); //boton para volver a la ventana principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				controlador.accion(EventosControlador.VISTA_AVION, null);
			}
		});
		
		atras.setAlignmentX(CENTER_ALIGNMENT);
		panelBotones.add(atras);
		principal.add(panelBotones, BorderLayout.SOUTH);
		
		this.setContentPane(principal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.pack();
	}
}