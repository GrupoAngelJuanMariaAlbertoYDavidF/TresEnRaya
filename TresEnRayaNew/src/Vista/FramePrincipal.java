package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.GestionDatosPartida;
import modelo.GestionDatos;
import modelo.MyBotonera;
import modelo.MyLabelVictory;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class FramePrincipal extends JFrame {

	private JPanel contentPane;
	protected MyBotonera panelTresEnRaya;
	protected JPanel panelBotones;
	private JPanel panelInfo;
	protected GestionDatosPartida gestionDatosPartida = new GestionDatosPartida();
	private MyLabelVictory lblMensajeVictori;

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));

		panelInfo = new JPanel();
		contentPane.add(panelInfo);
		panelInfo.setLayout(null);

		JLabel lblTitulo = new JLabel("TRES EN RAYA");
		lblTitulo.setForeground(new Color(255, 0, 0));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblTitulo.setBounds(10, 105, 471, 213);
		panelInfo.add(lblTitulo);

		panelBotones = new JPanel();
		contentPane.add(panelBotones);
		panelBotones.setLayout(new GridLayout(0, 1, 0, 0));

		lblMensajeVictori = new MyLabelVictory("");
		lblMensajeVictori.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajeVictori.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblMensajeVictori.setForeground(new Color(0, 255, 64));
		panelBotones.add(lblMensajeVictori);

		panelTresEnRaya = new MyBotonera(lblMensajeVictori);
		contentPane.add(panelTresEnRaya);
		panelTresEnRaya.setLayout(new GridLayout(3, 3, 4, 3));

	}

	public MyBotonera getPanelTresEnRaya() {

		return panelTresEnRaya;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public JPanel getPanelInfo() {
		return panelInfo;
	}

	public MyLabelVictory getLblMensajeVictori() {
		return lblMensajeVictori;
	}

	public void setLblMensajeVictori(MyLabelVictory lblMensajeVictori) {
		this.lblMensajeVictori = lblMensajeVictori;
	}
}
