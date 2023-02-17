package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Vista.FramePrincipal;
import modelo.*;

public class MyBotonera extends JPanel {

	private MyBoton botonera[][] = new MyBoton[3][3];
	private int coordenadaX;
	private int coordenadaY;
	private int turno;
		
	public MyBotonera() {
		crearBotones();

	}

	private void crearBotones() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				botonera[i][j] = new MyBoton(new Coordenada(i, j));
				botonera[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						MyBoton boton = (MyBoton) e.getSource();
						coordenadaX = boton.getCoordenada().getX();
						coordenadaY = boton.getCoordenada().getY();
						if(turno<6) {
							if (turno%2==0) {
								
								boton.setText("X");
								
							}else {
								boton.setText("O");
							}
							turno++;
						}

					}
				});
				this.add(botonera[i][j]);
			}
		}

	}

	public MyBoton getBoton(int i, int j) {
		return botonera[i][j];
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public MyBoton[][] getBotonera() {
		return botonera;
	}

	public int getTurno() {
		return turno;
	}

}
