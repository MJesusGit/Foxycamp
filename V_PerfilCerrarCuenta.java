package presentacion;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.border.Border;


import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_PerfilCerrarCuenta extends JPanel {
	private JFrame frmPerfilAux;
	/**
	 * Create the panel.
	 */
	
	public V_PerfilCerrarCuenta(JFrame frmPerfil) {
		frmPerfilAux = frmPerfil;
		setBackground(Color.WHITE);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{150, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 150, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 100, 0, 41, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblCierreCuenta = new JLabel(MessagesV_PerfilCerrarCuenta.getString("V_PerfilCerrarCuenta.lblCierreCuenta.text")); //$NON-NLS-1$
		lblCierreCuenta.setForeground(new Color(153, 0, 0));
		lblCierreCuenta.setFont(new Font("Verdana", Font.BOLD, 32));
		GridBagConstraints gbc_lblCierreCuenta = new GridBagConstraints();
		gbc_lblCierreCuenta.fill = GridBagConstraints.VERTICAL;
		gbc_lblCierreCuenta.gridwidth = 23;
		gbc_lblCierreCuenta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCierreCuenta.gridx = 1;
		gbc_lblCierreCuenta.gridy = 0;
		panel.add(lblCierreCuenta, gbc_lblCierreCuenta);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(V_PerfilCerrarCuenta.class.getResource("/presentacion/advertencia.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextPane txtpnSiCierraLa = new JTextPane();
		txtpnSiCierraLa.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtpnSiCierraLa.setEditable(false);
		txtpnSiCierraLa.setText(MessagesV_PerfilCerrarCuenta.getString("V_PerfilCerrarCuenta.txtpnSiCierraLa.text")); //$NON-NLS-1$
		txtpnSiCierraLa.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtpnSiCierraLa = new GridBagConstraints();
		gbc_txtpnSiCierraLa.anchor = GridBagConstraints.WEST;
		gbc_txtpnSiCierraLa.gridwidth = 16;
		gbc_txtpnSiCierraLa.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnSiCierraLa.gridx = 4;
		gbc_txtpnSiCierraLa.gridy = 3;
		panel.add(txtpnSiCierraLa, gbc_txtpnSiCierraLa);
		
		JButton btnCerrarCuenta = new JButton(MessagesV_PerfilCerrarCuenta.getString("V_PerfilCerrarCuenta.btnCerrarCuenta.text")); //$NON-NLS-1$
		btnCerrarCuenta.addActionListener(new BtnCerrarCuentaActionListener());
		btnCerrarCuenta.setBackground(new Color(153, 0, 0));
		btnCerrarCuenta.setForeground(SystemColor.text);
		btnCerrarCuenta.setFont(new Font("Verdana", Font.BOLD, 16));
		GridBagConstraints gbc_btnCerrarCuenta = new GridBagConstraints();
		gbc_btnCerrarCuenta.gridwidth = 3;
		gbc_btnCerrarCuenta.insets = new Insets(0, 0, 5, 5);
		gbc_btnCerrarCuenta.gridx = 4;
		gbc_btnCerrarCuenta.gridy = 4;
		panel.add(btnCerrarCuenta, gbc_btnCerrarCuenta);
		btnCerrarCuenta.setBorder(new RoundedBorder(12));
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
	private class BtnCerrarCuentaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Quieres borrar tu cuenta?", "Operación irreversible", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);//0=yes, 1=no, 2=cancel	
			if(ventanaYesNotCancel == 0) {			  
				JOptionPane.showMessageDialog(null, "Cuenta cancelada.");
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmPerfilAux.dispose();
			}
		}
	}
}