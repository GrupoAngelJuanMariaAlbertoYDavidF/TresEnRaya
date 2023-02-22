package modelo;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;

import Control.GestionDatosPartida;
import Control.ParaFramePrincipal;
import Vista.FramePrincipal;
import modelo.*;

public class MyBotonera extends JPanel {
	
	private MyBoton botonera[][] = new MyBoton[3][3];
	private int coordenadaX;
	private int coordenadaY;
	private int turno;
	private int numeroTablero;
	

		
	public MyBotonera() {
		crearBotones();
		

	}

	private void crearBotones() {
		
		GestionDatosPartida gestionDatosPartida = new GestionDatosPartida();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				botonera[i][j] = new MyBoton(new Coordenada(i, j));
				botonera[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						MyBoton boton = (MyBoton) e.getSource();
						
						
						if(gestionDatosPartida.getTurno()<6) {
							if (gestionDatosPartida.getTurno()%2==0) {
								numeroTablero=1;
								boton.setText("X");
								gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(),numeroTablero);
							
							}else {
								numeroTablero=2;
								boton.setText("O");
								gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(),numeroTablero);


								
							}
							gestionDatosPartida.setTurno(gestionDatosPartida.getTurno()+1);	
							
						}
						gestionDatosPartida.setVictoria(gestionDatosPartida.tablero.comprobarTresEnRaya());
						if (gestionDatosPartida.isVictoria()==true) {
							
							

							
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
