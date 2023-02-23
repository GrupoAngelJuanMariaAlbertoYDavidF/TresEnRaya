package modelo;

import java.awt.Label;
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
	GestionDatosPartida gestionDatosPartida = new GestionDatosPartida();
	private MyLabelVictory myLabelVictory;
	private MyBoton botonera[][] = new MyBoton[3][3];
	private int coordenadaX;
	private int coordenadaY;
	private int turno;
	private int numeroTablero;
	private int moverFicha; 

	public MyBotonera(MyLabelVictory myLabelVictory) {
		this.myLabelVictory = myLabelVictory;
		crearBotones();
		moverFicha = 0;
	}

	private void crearBotones() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				botonera[i][j] = new MyBoton(new Coordenada(i, j));
				botonera[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						MyBoton boton = (MyBoton) e.getSource();
						if (gestionDatosPartida.getTurno() <= 6) { 
							colocarFichas(boton);
							System.out.println(gestionDatosPartida.getTurno());
						}
						if (gestionDatosPartida.getTurno() > 6) {
							switch (moverFicha) { //PUEDE TOCARSE
							case 0: {
								moverFicha = colocarFichaaTurnoMayorQueSeis(boton, gestionDatosPartida);
								cogerPosicionAntigua(boton);
								System.out.println(moverFicha);
								System.out.println(gestionDatosPartida.getTurno());
								break;
							}
							case 1: {
								cogerPosicionNueva(boton);
								colocarFichasX(boton);
								System.out.println(moverFicha);
								System.out.println(gestionDatosPartida.getTurno());
								moverFicha = 0;
								gestionDatosPartida.aumentarTurno();
								break;
							}
							case 2:
								cogerPosicionNueva(boton);
								colocarFichasO(boton);
								moverFicha = 0;
								System.out.println(gestionDatosPartida.getTurno());
								System.out.println(moverFicha);
								gestionDatosPartida.aumentarTurno();
								break;

							default:
								throw new IllegalArgumentException("Unexpected value: " + moverFicha);
							}

						} 
						//NO SE PUEDE TOCAR
						comprovacionTresEnRaya();
						comprobarVictoria();
					}

				}

				);
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

	public void comprobarVictoria() {
		if (gestionDatosPartida.isVictoria() == true) {
			myLabelVictory.setText("VICTORIA");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					botonera[i][j].setEnabled(false);
					;
				}
			}
		}

	}

	public void colocarFichas(MyBoton boton) {

		if (gestionDatosPartida.getTurno() % 2 == 0) {
			boton.setText("X");
			gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 1);
			gestionDatosPartida.aumentarTurno();
		} else {

			boton.setText("O");
			gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 2);
			gestionDatosPartida.aumentarTurno();
		}

	}

	public void comprovacionTresEnRaya() {
		gestionDatosPartida.setVictoria(gestionDatosPartida.tablero.comprobarTresEnRaya());

	}

	public int colocarFichaaTurnoMayorQueSeis(MyBoton boton, GestionDatosPartida tablero) {

		if (gestionDatosPartida.tablero.getValorPosicion(boton.getCoordenada()) == 1 && boton.getText().equalsIgnoreCase("X") ) {
			gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 0);
			boton.setText("");
			return 1;
		}
		if (gestionDatosPartida.tablero.getValorPosicion(boton.getCoordenada()) == 2 && boton.getText().equalsIgnoreCase("O")) {
			gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 0);
			boton.setText("");
			return 2;
		}

		return 0;
	}

	public void colocarFichasX(MyBoton boton) { //Puede TOCARSE

		if (gestionDatosPartida.getPosicionAnterior() != gestionDatosPartida.getPosicionNueva()&& !boton.getText().equalsIgnoreCase("O")) {
			gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 1);
			boton.setText("X");
		} else {
			System.out.println("Error");
		}
	}

	public void colocarFichasO(MyBoton boton) { //PUEDE TOCARSE

		if (gestionDatosPartida.getPosicionAnterior() != gestionDatosPartida.getPosicionNueva() && !boton.getText().equalsIgnoreCase("X")) {
			gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 2);
			boton.setText("O");
		} else {
			
			System.out.println("Error");
		}
	}

	public void cogerPosicionAntigua(MyBoton boton) {
		gestionDatosPartida.setPosicionAnterior(boton.getCoordenada());

	}

	public void cogerPosicionNueva(MyBoton boton) {
		gestionDatosPartida.setPosicionNueva(boton.getCoordenada());
	}

}
