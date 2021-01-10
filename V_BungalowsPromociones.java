package presentacion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import presentacion.V_PromocionesActividades.RoundedBorder;

public class V_BungalowsPromociones extends JPanel {
	private JSlider sliderPrecio;
	private JScrollPane scrollPane;
	private JPanel pnlContenido;
	/**
	 * Create the panel.
	 */
	public V_BungalowsPromociones(JPanel referenciaPnlContenido) {
		pnlContenido = referenciaPnlContenido;
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 50, 1001, 530));
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(new Rectangle(0, 0, 75, 500));
		panel.add(panel_2, BorderLayout.WEST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 25, 177, 70, 35, 0 };
		gbl_panel_2.rowHeights = new int[] { 100, 0, 50, 0, 50, 0, 0, 50, 0, 0, 100, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 11;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 3;
		gbc_separator.gridy = 0;
		panel_2.add(separator, gbc_separator);

		JLabel lblNewLabel = new JLabel(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.lblNewLabel.text")); //$NON-NLS-1$
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);

		JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 1;
		panel_2.add(dateChooser, gbc_dateChooser);

		JLabel lblSalida = new JLabel(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.lblSalida.text")); //$NON-NLS-1$
		lblSalida.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblSalida = new GridBagConstraints();
		gbc_lblSalida.anchor = GridBagConstraints.WEST;
		gbc_lblSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblSalida.gridx = 1;
		gbc_lblSalida.gridy = 3;
		panel_2.add(lblSalida, gbc_lblSalida);

		JDateChooser dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 2;
		gbc_dateChooser_1.gridy = 3;
		panel_2.add(dateChooser_1, gbc_dateChooser_1);

		JLabel lblPrecio = new JLabel(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.lblPrecio.text")); //$NON-NLS-1$
		lblPrecio.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 5;
		panel_2.add(lblPrecio, gbc_lblPrecio);

		sliderPrecio = new JSlider(JSlider.HORIZONTAL, 50, 500, 250);
		sliderPrecio.setBackground(Color.WHITE);
		sliderPrecio.setValue(50);
		sliderPrecio.setMaximum(550);
		sliderPrecio.setMinimum(50);
		sliderPrecio.setMajorTickSpacing(250);
		sliderPrecio.setSnapToTicks(true);
		sliderPrecio.setPaintTicks(true);
		sliderPrecio.setPaintLabels(true);
		sliderPrecio.setFont(new Font("Verdana", Font.PLAIN, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_sliderPrecio = new GridBagConstraints();
		gbc_sliderPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_sliderPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_sliderPrecio.gridx = 1;
		gbc_sliderPrecio.gridy = 6;
		panel_2.add(sliderPrecio, gbc_sliderPrecio);

		JLabel lblNewLabel_4 = new JLabel(""); //$NON-NLS-1$
		lblNewLabel_4.setIcon(new ImageIcon(V_Parcela.class.getResource("/presentacion/IconEuro.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 6;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.lblNewLabel_3.text")); //$NON-NLS-1$
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 14)); //$NON-NLS-1$
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 8;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] {MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.7"), MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.8"), MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.9"), MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.10"), MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.11")})); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 14)); //$NON-NLS-1$
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 8;
		panel_2.add(comboBox, gbc_comboBox);

		scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(Color.WHITE);
		panel.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		JPanel pnlBungalows = new JPanel();
		pnlBungalows.setBackground(Color.WHITE);
		scrollPane.setViewportView(pnlBungalows);
		GridBagLayout gbl_pnlBungalows = new GridBagLayout();
		gbl_pnlBungalows.columnWidths = new int[]{40, 0, 0, 35, 0};
		gbl_pnlBungalows.rowHeights = new int[]{35, 144, 35, 30, 144, 35, 30, 144, 35, 30, 144, 0, 25, 144, 0, 0, 0, 0};
		gbl_pnlBungalows.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlBungalows.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlBungalows.setLayout(gbl_pnlBungalows);

		JLabel lblBungalow1 = new JLabel(""); //$NON-NLS-1$
		lblBungalow1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		lblBungalow1.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow1.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblBungalow1 = new GridBagConstraints();
		gbc_lblBungalow1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBungalow1.gridx = 1;
		gbc_lblBungalow1.gridy = 1;
		pnlBungalows.add(lblBungalow1, gbc_lblBungalow1);

		JTextArea txtABungalow1 = new JTextArea();
		txtABungalow1.setFont(new Font("Verdana", Font.PLAIN, 13)); //$NON-NLS-1$
		txtABungalow1.setText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.txtABungalow1.text")); //$NON-NLS-1$
		txtABungalow1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		txtABungalow1.setEditable(false);
		txtABungalow1.setLineWrap(true);
		GridBagConstraints gbc_txtABungalow1 = new GridBagConstraints();
		gbc_txtABungalow1.insets = new Insets(0, 0, 5, 5);
		gbc_txtABungalow1.fill = GridBagConstraints.BOTH;
		gbc_txtABungalow1.gridx = 2;
		gbc_txtABungalow1.gridy = 1;

		pnlBungalows.add(txtABungalow1, gbc_txtABungalow1);

		JButton btnReservarBungalow1 = new JButton(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow1.text")); //$NON-NLS-1$
		btnReservarBungalow1.setToolTipText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow1.toolTipText")); //$NON-NLS-1$
		btnReservarBungalow1.setIcon(new ImageIcon(V_BungalowsPromociones.class.getResource("/presentacion/IconPromo2.png"))); //$NON-NLS-1$
		btnReservarBungalow1.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarBungalow1 = new GridBagConstraints();
		gbc_btnReservarBungalow1.gridwidth = 2;
		gbc_btnReservarBungalow1.fill = GridBagConstraints.BOTH;
		gbc_btnReservarBungalow1.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarBungalow1.gridx = 1;
		gbc_btnReservarBungalow1.gridy = 2;
		btnReservarBungalow1.setBorder(new RoundedBorder(10));
		btnReservarBungalow1.addActionListener(new BtnActionListener());
		btnReservarBungalow1.setBackground(new Color(255, 165, 0));
		pnlBungalows.add(btnReservarBungalow1, gbc_btnReservarBungalow1);

		JLabel lblBungalow2 = new JLabel(""); //$NON-NLS-1$
		lblBungalow2.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow2.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblBungalow2 = new GridBagConstraints();
		gbc_lblBungalow2.insets = new Insets(0, 0, 5, 5);
		gbc_lblBungalow2.gridx = 1;
		gbc_lblBungalow2.gridy = 4;
		pnlBungalows.add(lblBungalow2, gbc_lblBungalow2);

		JTextArea txtABungalow2 = new JTextArea();
		txtABungalow2.setFont(new Font("Verdana", Font.PLAIN, 10)); //$NON-NLS-1$
		txtABungalow2.setText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.txtABungalow2.text")); //$NON-NLS-1$
		txtABungalow2.setLineWrap(true);
		txtABungalow2.setEditable(false);
		txtABungalow2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtABungalow2 = new GridBagConstraints();
		gbc_txtABungalow2.insets = new Insets(0, 0, 5, 5);
		gbc_txtABungalow2.fill = GridBagConstraints.BOTH;
		gbc_txtABungalow2.gridx = 2;
		gbc_txtABungalow2.gridy = 4;
		pnlBungalows.add(txtABungalow2, gbc_txtABungalow2);

		JButton btnReservarBungalow2 = new JButton(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow2.text")); //$NON-NLS-1$
		btnReservarBungalow2.setToolTipText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow2.toolTipText")); //$NON-NLS-1$
		btnReservarBungalow2.setIcon(new ImageIcon(V_BungalowsPromociones.class.getResource("/presentacion/IconPromo1.png"))); //$NON-NLS-1$
		btnReservarBungalow2.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarBungalow2 = new GridBagConstraints();
		gbc_btnReservarBungalow2.fill = GridBagConstraints.BOTH;
		gbc_btnReservarBungalow2.gridwidth = 2;
		gbc_btnReservarBungalow2.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarBungalow2.gridx = 1;
		gbc_btnReservarBungalow2.gridy = 5;
		btnReservarBungalow2.setBorder(new RoundedBorder(10));
		btnReservarBungalow2.addActionListener(new BtnActionListener());
		btnReservarBungalow2.setBackground(new Color(255, 165, 0));
		pnlBungalows.add(btnReservarBungalow2, gbc_btnReservarBungalow2);

		JLabel lblBungalow3 = new JLabel(""); //$NON-NLS-1$
		lblBungalow3.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow3.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblBungalow3 = new GridBagConstraints();
		gbc_lblBungalow3.insets = new Insets(0, 0, 5, 5);
		gbc_lblBungalow3.gridx = 1;
		gbc_lblBungalow3.gridy = 7;
		pnlBungalows.add(lblBungalow3, gbc_lblBungalow3);

		JTextArea txtABungalow3 = new JTextArea();
		txtABungalow3.setFont(new Font("Verdana", Font.PLAIN, 10)); //$NON-NLS-1$
		txtABungalow3.setText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.txtABungalow3.text")); //$NON-NLS-1$
		txtABungalow3.setLineWrap(true);
		txtABungalow3.setEditable(false);
		txtABungalow3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtABungalow3 = new GridBagConstraints();
		gbc_txtABungalow3.insets = new Insets(0, 0, 5, 5);
		gbc_txtABungalow3.fill = GridBagConstraints.BOTH;
		gbc_txtABungalow3.gridx = 2;
		gbc_txtABungalow3.gridy = 7;

		pnlBungalows.add(txtABungalow3, gbc_txtABungalow3);

		JButton btnReservarBungalow3 = new JButton(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow3.text")); //$NON-NLS-1$
		btnReservarBungalow3.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarBungalow3 = new GridBagConstraints();
		gbc_btnReservarBungalow3.fill = GridBagConstraints.BOTH;
		gbc_btnReservarBungalow3.gridwidth = 2;
		gbc_btnReservarBungalow3.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarBungalow3.gridx = 1;
		gbc_btnReservarBungalow3.gridy = 8;
		btnReservarBungalow3.setBorder(new RoundedBorder(10));
		btnReservarBungalow3.addActionListener(new BtnActionListener());
		btnReservarBungalow3.setBackground(new Color(255, 165, 0));
		pnlBungalows.add(btnReservarBungalow3, gbc_btnReservarBungalow3);

		JLabel lblBungalow4 = new JLabel(""); //$NON-NLS-1$
		lblBungalow4.setIcon(new ImageIcon(V_Bungalow.class.getResource("/presentacion/Bungalow4.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblBungalow4 = new GridBagConstraints();
		gbc_lblBungalow4.insets = new Insets(0, 0, 5, 5);
		gbc_lblBungalow4.gridx = 1;
		gbc_lblBungalow4.gridy = 10;
		pnlBungalows.add(lblBungalow4, gbc_lblBungalow4);

		JTextArea txtABungalow4 = new JTextArea();
		txtABungalow4.setFont(new Font("Verdana", Font.PLAIN, 10)); //$NON-NLS-1$
		txtABungalow4.setText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.txtABungalow4.text")); //$NON-NLS-1$
		txtABungalow4.setLineWrap(true);
		txtABungalow4.setEditable(false);
		txtABungalow4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtABungalow4 = new GridBagConstraints();
		gbc_txtABungalow4.insets = new Insets(0, 0, 5, 5);
		gbc_txtABungalow4.fill = GridBagConstraints.BOTH;
		gbc_txtABungalow4.gridx = 2;
		gbc_txtABungalow4.gridy = 10;
		pnlBungalows.add(txtABungalow4, gbc_txtABungalow4);

		JButton btnReservarBungalow4 = new JButton(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow4.text")); //$NON-NLS-1$
		btnReservarBungalow4.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarBungalow4 = new GridBagConstraints();
		gbc_btnReservarBungalow4.fill = GridBagConstraints.BOTH;
		gbc_btnReservarBungalow4.gridwidth = 2;
		gbc_btnReservarBungalow4.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarBungalow4.gridx = 1;
		gbc_btnReservarBungalow4.gridy = 11;
		btnReservarBungalow4.setBorder(new RoundedBorder(10));
		btnReservarBungalow4.addActionListener(new BtnActionListener());
		btnReservarBungalow4.setBackground(new Color(255, 165, 0));
		pnlBungalows.add(btnReservarBungalow4, gbc_btnReservarBungalow4);

		JLabel lblBungalow5 = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblBungalow5 = new GridBagConstraints();
		gbc_lblBungalow5.insets = new Insets(0, 0, 5, 5);
		gbc_lblBungalow5.gridx = 1;
		gbc_lblBungalow5.gridy = 13;
		pnlBungalows.add(lblBungalow5, gbc_lblBungalow5);

		JTextArea txtABungalow5 = new JTextArea();
		txtABungalow5.setFont(new Font("Verdana", Font.PLAIN, 10)); //$NON-NLS-1$
		txtABungalow5.setText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.txtABungalow5.text")); //$NON-NLS-1$
		txtABungalow5.setLineWrap(true);
		txtABungalow5.setEditable(false);
		txtABungalow5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_txtABungalow5 = new GridBagConstraints();
		gbc_txtABungalow5.insets = new Insets(0, 0, 5, 5);
		gbc_txtABungalow5.fill = GridBagConstraints.BOTH;
		gbc_txtABungalow5.gridx = 2;
		gbc_txtABungalow5.gridy = 13;
		pnlBungalows.add(txtABungalow5, gbc_txtABungalow5);

		JButton btnReservarBungalow5 = new JButton(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow5.text")); //$NON-NLS-1$
		btnReservarBungalow5.setIcon(new ImageIcon(V_BungalowsPromociones.class.getResource("/presentacion/IconPromo2.png"))); //$NON-NLS-1$
		btnReservarBungalow5.setToolTipText(MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.btnReservarBungalow5.toolTipText")); //$NON-NLS-1$
		btnReservarBungalow5.setFont(new Font("Verdana", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_btnReservarBungalow5 = new GridBagConstraints();
		gbc_btnReservarBungalow5.fill = GridBagConstraints.BOTH;
		gbc_btnReservarBungalow5.gridwidth = 2;
		gbc_btnReservarBungalow5.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarBungalow5.gridx = 1;
		gbc_btnReservarBungalow5.gridy = 14;
		btnReservarBungalow5.setBorder(new RoundedBorder(10));
		btnReservarBungalow5.addActionListener(new BtnActionListener());
		btnReservarBungalow5.setBackground(new Color(255, 165, 0));
		pnlBungalows.add(btnReservarBungalow5, gbc_btnReservarBungalow5);

		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.anchor = GridBagConstraints.WEST;
		gbc_separator_3.insets = new Insets(0, 0, 0, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 3;
	}
	
	private class BtnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, MessagesV_BungalowsPromociones.getString("V_BungalowsPromociones.0")); //$NON-NLS-1$
		}
	}
	private static class __Tmp {
		private static void __tmp() {
			javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
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
