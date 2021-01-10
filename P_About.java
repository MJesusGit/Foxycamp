package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import presentacion.P_Principal.RoundedBorder;
import java.awt.Cursor;


@SuppressWarnings("serial")
public class P_About extends JFrame {
	private String nombreAux;
	private Icon iconAux;
	private JPanel contentPane;
	JFrame frmAbout;


	/**
	 * Create the frame.
	 */
	public P_About(String nombre, Icon icon) {
		nombreAux = nombre;	
		iconAux = icon;
		frmAbout = new JFrame();
		frmAbout.setIconImage(Toolkit.getDefaultToolkit().getImage(P_About.class.getResource("/presentacion/IconAboutUs.png")));
		frmAbout.setTitle(MessagesP_About.getString("P_About.frmAbout.title")); //$NON-NLS-1$
		//Propiedades generales de todos los frames
		frmAbout.setBounds(new Rectangle(0, 0, 1375, 800));
		frmAbout.setResizable(false);
		frmAbout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmAbout.getContentPane().add(contentPane);
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		
		GridBagLayout gbl_pnlHeader = new GridBagLayout();
		gbl_pnlHeader.columnWidths = new int[] { 50, 44, 64, 300, 0, 0, 358, 92, 50, 50, 64, 46, 18, 0, 0, 0, 0 };
		gbl_pnlHeader.rowHeights = new int[] { 50, 0, 50, 0 };
		gbl_pnlHeader.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlHeader.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlHeader.setLayout(gbl_pnlHeader);

		JLabel lblLogoZorro = new JLabel("");
		lblLogoZorro.setBackground(new Color(255, 228, 181));
		lblLogoZorro.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/fox.png")));
		GridBagConstraints gbc_lblLogoZorro = new GridBagConstraints();
		gbc_lblLogoZorro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogoZorro.gridx = 2;
		gbc_lblLogoZorro.gridy = 1;
		pnlHeader.add(lblLogoZorro, gbc_lblLogoZorro);

		JLabel lblFoxycamp = new JLabel("FOXYCAMP");
		lblFoxycamp.setForeground(new Color(210, 105, 30));
		lblFoxycamp.setFont(new Font("Verdana", Font.BOLD, 40));
		GridBagConstraints gbc_lblFoxycamp = new GridBagConstraints();
		gbc_lblFoxycamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoxycamp.gridx = 3;
		gbc_lblFoxycamp.gridy = 1;
		pnlHeader.add(lblFoxycamp, gbc_lblFoxycamp);

		JLabel lblAyuda = new JLabel("");
		lblAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAyuda.addMouseListener(new LblAyudaMouseListener());
		lblAyuda.setToolTipText(MessagesP_About.getString("P_About.lblAyuda.toolTipText")); //$NON-NLS-1$
		lblAyuda.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/signo-de-interrogacion-dibujar.png")));
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.anchor = GridBagConstraints.SOUTH;
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_lblAyuda.gridx = 10;
		gbc_lblAyuda.gridy = 1;
		pnlHeader.add(lblAyuda, gbc_lblAyuda);
		
				JLabel lblTraductor = new JLabel("");
				lblTraductor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblTraductor.setToolTipText(MessagesP_About.getString("P_About.lblTraductor.toolTipText")); //$NON-NLS-1$
				lblTraductor.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/traductor.png")));
				GridBagConstraints gbc_lblTraductor = new GridBagConstraints();
				gbc_lblTraductor.anchor = GridBagConstraints.SOUTH;
				gbc_lblTraductor.insets = new Insets(0, 0, 5, 5);
				gbc_lblTraductor.gridx = 11;
				gbc_lblTraductor.gridy = 1;
				pnlHeader.add(lblTraductor, gbc_lblTraductor);
		
		JLabel lblFlechaTraductor = new JLabel(MessagesP_About.getString("")); //$NON-NLS-1$
		lblFlechaTraductor.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));
		
		JPopupMenu pmFlecha2 = new JPopupMenu();
		pmFlecha2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addPopup(lblFlechaTraductor, pmFlecha2);
		
		JButton btnEspanol = new JButton(MessagesP_About.getString("P_About.btnNewButton_1.text")); //$NON-NLS-1$
		btnEspanol.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnEspanol.setHorizontalAlignment(SwingConstants.LEFT);
		btnEspanol.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/lengua-espanola.png")));
		btnEspanol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("español"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("español");
				MessagesP_Login.setIdioma("español");
				MessagesP_Perfil.setIdioma("español");
				MessagesP_Registro.setIdioma("español");
				MessagesPrincipal.setIdioma("español");
				
				MessagesV_ActHistorial.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Actividades.setIdioma("español");
				MessagesV_Bungalows.setIdioma("español");
				MessagesV_BungalowsPromociones.setIdioma("español");
				MessagesV_Formacion.setIdioma("español");
				MessagesV_Informacion.setIdioma("español");
				MessagesV_Inscribirse.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Inscritos.setIdioma("español");
				MessagesV_Parcela.setIdioma("español");
				MessagesV_PerfilCerrarCuenta.setIdioma("español");
				MessagesV_PerfilContrasena.setIdioma("español");
				MessagesV_PromocionesActividades.setIdioma("español");
				MessagesV_Reservas.setIdioma("español"); //$NON-NLS-1$
				MessagesV_Ruta.setIdioma("español");
				MessagesV_RutaCrear.setIdioma("español");
				MessagesV_RutaElegida.setIdioma("español");
				MessagesV_RutaInscribirse.setIdioma("español");
				MessagesV_RutaInscritos.setIdioma("español");
				MessagesV_VerReservasBungalows.setIdioma("español");
				MessagesV_VerReservasParcelas.setIdioma("español");
				
				P_About frm = new P_About(nombre,icon);
				frmAbout.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha2.add(btnEspanol);
		
		JButton btnIngles = new JButton(MessagesP_About.getString("P_About.btnNewButton_2.text")); //$NON-NLS-1$
		btnIngles.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnIngles.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/idioma-en-ingles.png")));
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessagesP_About.setIdioma("inglés"); //$NON-NLS-1$
				MessagesP_Ayuda.setIdioma("inglés");
				MessagesP_Login.setIdioma("inglés");
				MessagesP_Perfil.setIdioma("inglés");
				MessagesP_Registro.setIdioma("inglés");
				MessagesPrincipal.setIdioma("inglés");
				
				MessagesV_ActHistorial.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Actividades.setIdioma("inglés");
				MessagesV_Bungalows.setIdioma("inglés");
				MessagesV_BungalowsPromociones.setIdioma("inglés");
				MessagesV_Formacion.setIdioma("inglés");
				MessagesV_Informacion.setIdioma("inglés");
				MessagesV_Inscribirse.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Inscritos.setIdioma("inglés");
				MessagesV_Parcela.setIdioma("inglés");
				MessagesV_PerfilCerrarCuenta.setIdioma("inglés");
				MessagesV_PerfilContrasena.setIdioma("inglés");
				MessagesV_PromocionesActividades.setIdioma("inglés");
				MessagesV_Reservas.setIdioma("inglés"); //$NON-NLS-1$
				MessagesV_Ruta.setIdioma("inglés");
				MessagesV_RutaCrear.setIdioma("inglés");
				MessagesV_RutaElegida.setIdioma("inglés");
				MessagesV_RutaInscribirse.setIdioma("inglés");
				MessagesV_RutaInscritos.setIdioma("inglés");
				MessagesV_VerReservasBungalows.setIdioma("inglés");
				MessagesV_VerReservasParcelas.setIdioma("inglés");
				
				P_About frm = new P_About(nombre, icon);
				frmAbout.dispose();
				frm.getFrame().setVisible(true);
			}
		});
		pmFlecha2.add(btnIngles);
		GridBagConstraints gbc_lblFlechaTraductor = new GridBagConstraints();
		gbc_lblFlechaTraductor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFlechaTraductor.anchor = GridBagConstraints.SOUTH;
		gbc_lblFlechaTraductor.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaTraductor.gridx = 12;
		gbc_lblFlechaTraductor.gridy = 1;
		pnlHeader.add(lblFlechaTraductor, gbc_lblFlechaTraductor);
		
		JLabel lblPerfil = new JLabel("");
		lblPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/usuario.png")));
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.anchor = GridBagConstraints.SOUTH;
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 13;
		gbc_lblPerfil.gridy = 1;
		pnlHeader.add(lblPerfil, gbc_lblPerfil);
		
		JLabel lblFlechaPerfil = new JLabel("");
		lblFlechaPerfil.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/flecha-hacia-abajo-del-angulo.png")));
		GridBagConstraints gbc_lblFlechaPerfil = new GridBagConstraints();
		gbc_lblFlechaPerfil.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblFlechaPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlechaPerfil.gridx = 14;
		gbc_lblFlechaPerfil.gridy = 1;
		pnlHeader.add(lblFlechaPerfil, gbc_lblFlechaPerfil);
		JPopupMenu pmFlecha = new JPopupMenu();
		pmFlecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addPopup(lblFlechaPerfil, pmFlecha);
		
		JLabel lblPerfilOption = new JLabel(nombre);
		lblPerfilOption.setIcon(nuevoIcono(nombre));
		pmFlecha.add(lblPerfilOption);
		
		LocalDate date = LocalDate.now(); // Gets the current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date_cu = date.format(formatter);
		JLabel lblUltimaFecha = new JLabel("Última fecha: " + date_cu);
		lblUltimaFecha.setFont(new Font("Verdana", Font.PLAIN, 9));
		pmFlecha.add(lblUltimaFecha);
		
		JButton btnAjustes = new JButton(MessagesP_About.getString("P_About.btnAjustes.text")); //$NON-NLS-1$
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Perfil frmPerfil = new P_Perfil(nombre, icon);
				frmPerfil.getFrame().setVisible(true);
				frmAbout.dispose();
			}
		});
		btnAjustes.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/configuraciones.png")));
		pmFlecha.add(btnAjustes);
		
		JButton btnDesconectar = new JButton(MessagesP_About.getString("P_About.btnDesconectar.text")); //$NON-NLS-1$
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P_Login frmLogin = new P_Login();
				frmLogin.getFrame().setVisible(true);
				frmAbout.dispose();
			}
		});
		btnDesconectar.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/desconectar.png")));
		pmFlecha.add(btnDesconectar);
		
		lblFlechaPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		lblFlechaTraductor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pmFlecha2.show(e.getComponent(), e.getX(), e.getY());
			}
		});

		JLabel lblLeftLine = new JLabel("");
		lblLeftLine.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLeftLine.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLeftLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeftLine.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		GridBagConstraints gbc_lblLeftLine = new GridBagConstraints();
		gbc_lblLeftLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLeftLine.gridwidth = 13;
		gbc_lblLeftLine.insets = new Insets(0, 0, 0, 5);
		gbc_lblLeftLine.gridx = 1;
		gbc_lblLeftLine.gridy = 2;
		pnlHeader.add(lblLeftLine, gbc_lblLeftLine);
		
		JPanel pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(null);
		
		JLabel lblIconMJ = new JLabel("");
		lblIconMJ.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/mj.png")));
		lblIconMJ.setBounds(910, 176, 327, 321);
		pnlContenido.add(lblIconMJ);
		
		JLabel lblIconAdrian = new JLabel("");
		lblIconAdrian.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/adrian.png")));
		lblIconAdrian.setBounds(489, 176, 327, 321);
		pnlContenido.add(lblIconAdrian);
		
		JLabel lblIconMaria = new JLabel("");
		lblIconMaria.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/Maria.png")));
		lblIconMaria.setBounds(103, 176, 327, 321);
		pnlContenido.add(lblIconMaria);
		
		JLabel lblMiembros = new JLabel(MessagesP_About.getString("P_About.lblMiembros.text")); //$NON-NLS-1$
		lblMiembros.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiembros.setForeground(new Color(210, 105, 30));
		lblMiembros.setFont(new Font("Verdana", Font.BOLD, 46));
		lblMiembros.setBounds(93, 11, 1106, 50);
		pnlContenido.add(lblMiembros);
		
		JButton btnNewButton = new JButton(MessagesP_About.getString("P_About.btnNewButton.text")); //$NON-NLS-1$
		btnNewButton.setBounds(new Rectangle(0, 0, 0, 50));
		btnNewButton.setBackground(new Color(255, 204, 102));
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/volver-flecha (1).png")));
		btnNewButton.setBounds(23, 756, 146, 25);
		pnlContenido.add(btnNewButton);
		
		JLabel lblMAria = new JLabel(MessagesP_About.getString("P_About.lblMAria.text")); //$NON-NLS-1$
		lblMAria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMAria.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblMAria.setBounds(93, 461, 320, 79);
		pnlContenido.add(lblMAria);
		
		JTextArea txtrSomosUnGrupo = new JTextArea();
		txtrSomosUnGrupo.setEditable(false);
		txtrSomosUnGrupo.setForeground(new Color(0, 0, 0));
		txtrSomosUnGrupo.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtrSomosUnGrupo.setText(MessagesP_About.getString("P_About.txtrSomosUnGrupo.text")); //$NON-NLS-1$
		txtrSomosUnGrupo.setBackground(new Color(255, 228, 196));
		txtrSomosUnGrupo.setLineWrap(true);
		txtrSomosUnGrupo.setBounds(93, 72, 1106, 111);
		pnlContenido.add(txtrSomosUnGrupo);
		
		JLabel lblAdrinRuizEsteban = new JLabel(MessagesP_About.getString("P_About.lblAdrinRuizEsteban.text")); //$NON-NLS-1$
		lblAdrinRuizEsteban.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdrinRuizEsteban.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblAdrinRuizEsteban.setBounds(471, 461, 320, 79);
		pnlContenido.add(lblAdrinRuizEsteban);
		
		JLabel lblMJ = new JLabel(MessagesP_About.getString("P_About.lblMJ.text")); //$NON-NLS-1$
		lblMJ.setHorizontalAlignment(SwingConstants.CENTER);
		lblMJ.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblMJ.setBounds(905, 461, 320, 79);
		pnlContenido.add(lblMJ);
		
		JButton btnVolver = new JButton(MessagesP_About.getString("P_About.btnVolver.text")); //$NON-NLS-1$
		btnVolver.addActionListener(new BtnVolverActionListener());
		btnVolver.setIcon(new ImageIcon(P_About.class.getResource("/presentacion/volver-flecha (1).png")));
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20));
		btnVolver.setBorder(new RoundedBorder(12));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setBounds(23, 534, 146, 33);
		pnlContenido.add(btnVolver);
		
		

	}
	
	private Icon nuevoIcono(String nombre) {
        Icon icon = null;

        if(MessagesP_Login.getString("P_Login.48") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMj.png")); //$NON-NLS-1$ //$NON-NLS-2$
        if(MessagesP_Login.getString("P_Login.46") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilAdri.png")); //$NON-NLS-1$ //$NON-NLS-2$
        if(MessagesP_Login.getString("P_Login.50") == nombre) icon = new ImageIcon(P_Principal.class.getResource("/presentacion/PerfilMaria.png"));; //$NON-NLS-1$ //$NON-NLS-2$
        if(MessagesP_Login.getString("P_Login.48") != nombre && 
                MessagesP_Login.getString("P_Login.46") != nombre &&
                MessagesP_Login.getString("P_Login.50") != nombre) icon = iconAux;
        return icon;
    }
	
	public class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}
	
	private class LblAyudaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			P_Ayuda frmAyuda = new P_Ayuda(nombreAux, iconAux);
			frmAyuda.getFrame().setVisible(true);
			frmAbout.dispose();
		}
	}
	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			P_Principal frmPrincipal = new P_Principal(nombreAux, iconAux);
			frmPrincipal.getFrame().setVisible(true);
			frmAbout.dispose();
		}
	}
	
	public JFrame getFrame() {
		return frmAbout;
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {

		});
	}
}