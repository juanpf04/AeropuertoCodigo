package presentacion.hangar;

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

import negocio.hangar.THangar;
import negocio.modelo.TModelo;
import presentacion.Observador;
import presentacion.controlador.Controlador;
import presentacion.controlador.EventosControlador;

public class VistaAltaHangar extends JFrame implements Observador {
	public VistaAltaHangar() {
		super("Alta Hangar");
		this.setSize(1000, 750);
	}

	public void actualizaVista(Object datos) {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("recursos/iconos/avion.png"));

		JPanel principal = new JPanel();
		principal.setLayout(new BoxLayout(principal, BoxLayout.PAGE_AXIS));

		JLabel funcion = new JLabel("Alta Hangar");
		funcion.setFont(new Font("Times New Roman", Font.ITALIC, 85));

		JPanel centro = new JPanel();
		centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));

		JPanel direccion = new JPanel();
		direccion.setLayout(new BoxLayout(direccion, BoxLayout.LINE_AXIS));
		JLabel etiquetaDir = new JLabel("direccion: ");
		etiquetaDir.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoDir = new JTextField();
		textoDir.setMaximumSize(new Dimension(200, 30));
		textoDir.setMinimumSize(new Dimension(200, 30));
		textoDir.setPreferredSize(new Dimension(200, 30));
		direccion.add(etiquetaDir);
		direccion.add(textoDir);
		centro.add(direccion);

		JPanel stock = new JPanel();
		stock.setLayout(new BoxLayout(stock, BoxLayout.X_AXIS));
		JLabel etiquetaStock = new JLabel("stock:    ");
		etiquetaStock.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoStock = new JTextField();
		textoStock.setMaximumSize(new Dimension(200, 30));
		textoStock.setMinimumSize(new Dimension(200, 30));
		textoStock.setPreferredSize(new Dimension(200, 30));
		stock.add(etiquetaStock);
		stock.add(textoStock);
		centro.add(stock);

		JPanel costeDia = new JPanel();
		costeDia.setLayout(new BoxLayout(costeDia, BoxLayout.X_AXIS));
		JLabel etiquetacosteDia = new JLabel("costeDia:    ");
		etiquetacosteDia.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textocosteDia = new JTextField();
		textocosteDia.setMaximumSize(new Dimension(200, 30));
		textocosteDia.setMinimumSize(new Dimension(200, 30));
		textocosteDia.setPreferredSize(new Dimension(200, 30));
		costeDia.add(etiquetacosteDia);
		costeDia.add(textocosteDia);
		centro.add(costeDia);

		JPanel espacioAlmacenaje = new JPanel();
		espacioAlmacenaje.setLayout(new BoxLayout(espacioAlmacenaje, BoxLayout.X_AXIS));
		JLabel etiquetaespacioAlmacenaje = new JLabel("espacioAlmacenaje:    ");
		etiquetaespacioAlmacenaje.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JTextField textoespacioAlmacenaje = new JTextField();
		textoespacioAlmacenaje.setMaximumSize(new Dimension(200, 30));
		textoespacioAlmacenaje.setMinimumSize(new Dimension(200, 30));
		textoespacioAlmacenaje.setPreferredSize(new Dimension(200, 30));
		espacioAlmacenaje.add(etiquetaespacioAlmacenaje);
		espacioAlmacenaje.add(textoespacioAlmacenaje);
		centro.add(espacioAlmacenaje);

		Controlador controlador = Controlador.getInstance();

		JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String dirLeido = textoDir.getText();
					int stockLeido = Integer.parseInt(textoStock.getText());
					double costeLeido = Double.parseDouble(textocosteDia.getText());//tiene que ser con ., no con , xq sino da error
					int espacioLeido = Integer.parseInt(textoespacioAlmacenaje.getText());
					THangar transfer = new THangar(0, dirLeido, stockLeido, costeLeido, espacioLeido, true);
					controlador.accion(EventosControlador.ALTA_HANGAR, transfer);
				} catch (NumberFormatException n) {
					THangar hangar = new THangar(0, "", 0, 0, 0, false);
					controlador.accion(EventosControlador.ALTA_HANGAR, hangar);
				}
			}

		});

		centro.add(aceptar);
		principal.add(funcion);
		principal.add(centro);

		JButton atras = new JButton("ATRAS"); //boton para volver a la ventana principal
		atras.setToolTipText("Esto vuelve a la ventana anterior");
		atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				controlador.accion(EventosControlador.VISTA_HANGAR, null);
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