package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class V_LogoZorro extends JPanel {

	/**
	 * Create the panel.
	 */
	public V_LogoZorro() {
		setBounds(new Rectangle(0, 0, 1001, 530));
		setLayout(null);
		
		JLabel lblZorro = new JLabel("");
		lblZorro.setBounds(new Rectangle(278, 86, 425, 319));
		lblZorro.setHorizontalAlignment(SwingConstants.CENTER);
		lblZorro.setIcon(new ImageIcon(V_LogoZorro.class.getResource("/presentacion/zorroGrandeTransparencia.png")));
		add(lblZorro);
		

	}
}