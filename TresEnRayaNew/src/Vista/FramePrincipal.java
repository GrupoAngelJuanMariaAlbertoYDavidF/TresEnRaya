package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class FramePrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel panelTresEnRaya;
	private JPanel panelBotones;
	private JPanel panelInfo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;

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
		contentPane.setLayout(null);
		
		panelInfo = new JPanel();
		panelInfo.setBounds(10, 310, 801, 152);
		contentPane.add(panelInfo);
		
		panelBotones = new JPanel();
		panelBotones.setBounds(10, 10, 206, 290);
		contentPane.add(panelBotones);
		
		panelTresEnRaya = new JPanel();
		panelTresEnRaya.setBounds(226, 10, 585, 290);
		contentPane.add(panelTresEnRaya);
		panelTresEnRaya.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton_1 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_3);
		
		btnNewButton_5 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_5);
		
		btnNewButton_8 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_8);
		
		btnNewButton_2 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_2);
		
		btnNewButton_7 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_7);
		
		btnNewButton_6 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_6);
		
		btnNewButton_4 = new JButton("New button");
		panelTresEnRaya.add(btnNewButton_4);
		
		btnNewButton = new JButton("New button");
		panelTresEnRaya.add(btnNewButton);
	}

	public JPanel getPanelTresEnRaya() {
		return panelTresEnRaya;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public JPanel getPanelInfo() {
		return panelInfo;
	}

}
