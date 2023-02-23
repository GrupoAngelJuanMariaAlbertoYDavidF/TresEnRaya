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
	private JLabel lblNumeroMovimientosJX;
	private JLabel lblNumeroMovimientosJO;
	protected GestionDatosPartida gestionDatosPartida= new GestionDatosPartida();
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
		
		JLabel lblMovimientosJX = new JLabel("Movimientos JX:");
		lblMovimientosJX.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMovimientosJX.setBounds(22, 93, 179, 86);
		panelInfo.add(lblMovimientosJX);
		
		JLabel lblMovimientosJo = new JLabel("Movimientos JO:");
		lblMovimientosJo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMovimientosJo.setBounds(22, 255, 179, 86);
		panelInfo.add(lblMovimientosJo);
		
		lblNumeroMovimientosJX = new JLabel("0");
		lblNumeroMovimientosJX.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroMovimientosJX.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNumeroMovimientosJX.setBounds(188, 93, 72, 86);
		panelInfo.add(lblNumeroMovimientosJX);
		
		lblNumeroMovimientosJO = new JLabel("0");
		lblNumeroMovimientosJO.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroMovimientosJO.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNumeroMovimientosJO.setBounds(188, 255, 72, 86);
		panelInfo.add(lblNumeroMovimientosJO);
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones);
		
		lblMensajeVictori = new MyLabelVictory("");
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

	public JLabel getLblNumeroMovimientosJX() {
		return lblNumeroMovimientosJX;
	}

	public JLabel getLblNumeroMovimientosJO() {
		return lblNumeroMovimientosJO;
	}

	public MyLabelVictory getLblMensajeVictori() {
		return lblMensajeVictori;
	}

	public void setLblMensajeVictori(MyLabelVictory lblMensajeVictori) {
		this.lblMensajeVictori = lblMensajeVictori;
	}

	
}
