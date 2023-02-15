package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.MyBotonera;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class FramePrincipal extends JFrame {

	private JPanel contentPane;
	protected MyBotonera panelTresEnRaya;
	private JPanel panelBotones;
	private JPanel panelInfo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones);
		
		panelTresEnRaya = new MyBotonera();
		contentPane.add(panelTresEnRaya);
		panelTresEnRaya.setLayout(new GridLayout(3, 3, 0, 0));
		
		
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

}
