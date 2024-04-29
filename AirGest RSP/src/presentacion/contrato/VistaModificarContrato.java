
package presentacion.contrato;

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

import negocio.contrato.TCarrito;
import negocio.contrato.TContrato;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaModificarContrato extends JFrame implements Observador {
	
	public VistaModificarContrato(){
		super("Modificar contrato");
		this.setSize(1000, 750);
	}
	
	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));

		Controlador controlador = Controlador.getInstance();
		TCarrito carrito = (TCarrito) datos;

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Modificar contrato");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel id = new JPanel();
		id.setLayout(new BoxLayout(id, BoxLayout.LINE_AXIS));
		JLabel etiquetaId = new JLabel("id contrato: ");
		etiquetaId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoId = new JTextField();
		textoId.setMaximumSize(new Dimension(200, 30));
		textoId.setMinimumSize(new Dimension(200, 30));
		textoId.setPreferredSize(new Dimension(200, 30));
		id.add(etiquetaId);
		id.add(textoId);
		centro.add(id);
		
		JPanel aerolinea = new JPanel();
		aerolinea.setLayout(new BoxLayout(aerolinea, BoxLayout.LINE_AXIS));
		JLabel etiquetaAerolinea = new JLabel("id aerolinea: ");
		etiquetaAerolinea.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoAerolinea = new JTextField();
		textoAerolinea.setMaximumSize(new Dimension(200, 30));
		textoAerolinea.setMinimumSize(new Dimension(200, 30));
		textoAerolinea.setPreferredSize(new Dimension(200, 30));
		aerolinea.add(etiquetaAerolinea);
		aerolinea.add(textoAerolinea);
		centro.add(aerolinea);
		
		JPanel precio = new JPanel();
		precio.setLayout(new BoxLayout(precio, BoxLayout.LINE_AXIS));
		JLabel etiquetaPrecio = new JLabel("precio: ");
		etiquetaPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoPrecio = new JTextField();
		textoPrecio.setMaximumSize(new Dimension(200, 30));
		textoPrecio.setMinimumSize(new Dimension(200, 30));
		textoPrecio.setPreferredSize(new Dimension(200, 30));
		precio.add(etiquetaPrecio);
		precio.add(textoPrecio);
		centro.add(precio);
		
		JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					int id_contrato = Integer.parseInt(textoId.getText());
					int id_aerolinea = Integer.parseInt(textoAerolinea.getText());
					double precio = Double.parseDouble(textoPrecio.getText());
					TContrato c = new TContrato(id_contrato, id_aerolinea, precio);
					controlador.accion(EventosControlador.MODIFICAR_CONTRATO, c);
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
				controlador.accion(EventosControlador.VISTA_CARRITO, carrito);
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