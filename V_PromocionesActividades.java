package presentacion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import presentacion.V_VerReservasParcelas.RoundedBorder;

//import presentacion.V_Actividades.BtnInscritosActionListener;

public class V_PromocionesActividades extends JPanel {
	private JPanel pnlContenido;
	
	/**
	 * Create the panel.
	 */	
		public V_PromocionesActividades(JPanel referenciaPnlContenido) {
		pnlContenido = referenciaPnlContenido;
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlContenido = new JPanel();
		add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(null);
		
		JLabel lblIconOferta2 = new JLabel("");
		lblIconOferta2.setIcon(new ImageIcon(V_PromocionesActividades.class.getResource("/presentacion/IconPromo1.png")));
		lblIconOferta2.setBounds(521, 255, 53, 44);
		pnlContenido.add(lblIconOferta2);
		
		JLabel lblIconOferta1 = new JLabel("");
		lblIconOferta1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconOferta1.setIcon(new ImageIcon(V_PromocionesActividades.class.getResource("/presentacion/IconCalendario.png")));
		lblIconOferta1.setBounds(32, 367, 102, 93);
		pnlContenido.add(lblIconOferta1);
		
		JLabel lblTiroConArco = new JLabel("");
		lblTiroConArco.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/TiroConArcox64.png")));
		lblTiroConArco.setBounds(48, 180, 124, 119);
		pnlContenido.add(lblTiroConArco);
		
		JLabel lblNatacion = new JLabel("");
		lblNatacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/natacionx64.png")));
		lblNatacion.setBounds(48, 36, 124, 119);
		pnlContenido.add(lblNatacion);
		
		JLabel lblkayak = new JLabel("");
		lblkayak.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/kayakx64.png")));
		lblkayak.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak.setBounds(77, 334, 77, 83);
		pnlContenido.add(lblkayak);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.ORANGE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(491, 22, 11, 421);
		pnlContenido.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.ORANGE);
		separator_1.setBounds(58, 157, 408, 18);
		pnlContenido.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.ORANGE);
		separator_1_1.setBounds(58, 305, 408, 18);
		pnlContenido.add(separator_1_1);
		
		JTextArea txtrComienzaElDa_1 = new JTextArea();
		txtrComienzaElDa_1.setLineWrap(true);
		txtrComienzaElDa_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_1.setText(MessagesV_PromocionesActividades.getString("V_PromocionesActividades.txtrComienzaElDa_1.text")); //$NON-NLS-1$
		txtrComienzaElDa_1.setEditable(false);
		txtrComienzaElDa_1.setBounds(164, 172, 302, 122);
		pnlContenido.add(txtrComienzaElDa_1);
		
		JButton btnInscribirse = new JButton(MessagesV_PromocionesActividades.getString("V_PromocionesActividades.btnInscribirse.text")); //$NON-NLS-1$
		btnInscribirse.setBounds(new Rectangle(0, 0, 60, 50));
		btnInscribirse.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnInscribirse.addActionListener(new BtnActionListener());
		btnInscribirse.setBackground(new Color(255, 165, 0));
		btnInscribirse.setBounds(433, 469, 124, 23);
		btnInscribirse.setBorder(new RoundedBorder(10));
		pnlContenido.add(btnInscribirse);
		
		JTextArea txtrComienzaElDa_2 = new JTextArea();
		txtrComienzaElDa_2.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_2.setLineWrap(true);
		txtrComienzaElDa_2.setText(MessagesV_PromocionesActividades.getString("V_PromocionesActividades.txtrComienzaElDa_2.text")); //$NON-NLS-1$
		txtrComienzaElDa_2.setEditable(false);
		txtrComienzaElDa_2.setBounds(164, 323, 302, 122);
		pnlContenido.add(txtrComienzaElDa_2);
		
		JTextArea txtrComienzaElDa = new JTextArea();
		txtrComienzaElDa.setLineWrap(true);
		txtrComienzaElDa.setText(MessagesV_PromocionesActividades.getString("V_PromocionesActividades.txtrComienzaElDa.text")); //$NON-NLS-1$
		txtrComienzaElDa.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa.setEditable(false);
		txtrComienzaElDa.setBounds(164, 22, 302, 122);
		pnlContenido.add(txtrComienzaElDa);
		
		JLabel lblNatacion_1 = new JLabel("");
		lblNatacion_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconCiclismo.png")));
		lblNatacion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNatacion_1.setBounds(511, 38, 124, 119);
		pnlContenido.add(lblNatacion_1);
		
		JTextArea txtrComienzaElDa_3 = new JTextArea();
		txtrComienzaElDa_3.setLineWrap(true);
		txtrComienzaElDa_3.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_3.setText(MessagesV_PromocionesActividades.getString("V_PromocionesActividades.txtrComienzaElDa_3.text")); //$NON-NLS-1$
		txtrComienzaElDa_3.setEditable(false);
		txtrComienzaElDa_3.setBounds(627, 24, 302, 122);
		pnlContenido.add(txtrComienzaElDa_3);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.ORANGE);
		separator_1_2.setBounds(521, 159, 408, 18);
		pnlContenido.add(separator_1_2);
		
		JTextArea txtrComienzaElDa_4 = new JTextArea();
		txtrComienzaElDa_4.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_4.setText(MessagesV_PromocionesActividades.getString("V_PromocionesActividades.txtrComienzaElDa_4.text")); //$NON-NLS-1$
		txtrComienzaElDa_4.setLineWrap(true);
		txtrComienzaElDa_4.setEditable(false);
		txtrComienzaElDa_4.setBounds(627, 174, 302, 122);
		pnlContenido.add(txtrComienzaElDa_4);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.ORANGE);
		separator_1_1_1.setBounds(521, 307, 408, 18);
		pnlContenido.add(separator_1_1_1);
		
		JTextArea txtrComienzaElDa_5 = new JTextArea();
		txtrComienzaElDa_5.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtrComienzaElDa_5.setLineWrap(true);
		txtrComienzaElDa_5.setText(MessagesV_PromocionesActividades.getString("V_PromocionesActividades.txtrComienzaElDa_5.text")); //$NON-NLS-1$
		txtrComienzaElDa_5.setEditable(false);
		txtrComienzaElDa_5.setBounds(627, 325, 302, 122);
		pnlContenido.add(txtrComienzaElDa_5);
		
		JLabel lblkayak_1 = new JLabel("");
		lblkayak_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconYoga.png")));
		lblkayak_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblkayak_1.setBounds(511, 328, 124, 119);
		pnlContenido.add(lblkayak_1);
		
		JLabel lblTiroConArco_1 = new JLabel("");
		lblTiroConArco_1.setIcon(new ImageIcon(V_Actividades.class.getResource("/presentacion/IconFutbol.png")));
		lblTiroConArco_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiroConArco_1.setBounds(511, 182, 124, 119);
		pnlContenido.add(lblTiroConArco_1);
		
	}
	private class BtnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "actInscribirse");
		}
	}
		
	public class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width-1, height-1, radius, radius);
		}
	}
}