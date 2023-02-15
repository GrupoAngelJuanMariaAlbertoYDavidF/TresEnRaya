package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.*;

public class MyBotonera extends JPanel {

	private MyBoton botonera[][]=new MyBoton[3][3];
	
	public MyBotonera() {
		crearBotones();
	
	}

	private void crearBotones() {
		for (int i = 0; i < 3; i++) {
			for (int j= 0; j < 3; j++) {
				botonera[i][j] = new MyBoton(new Coordenada(i, j));
				botonera[i][j].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				System.out.println("hola soy "+((MyBoton)e.getSource()).getCoordenada().toString());
				}
			});
			this.add(botonera[i][j] );
			}
		}
		
	}

	public MyBoton getBoton(int i, int j) {
		return botonera[i][j];
	}

	
}
