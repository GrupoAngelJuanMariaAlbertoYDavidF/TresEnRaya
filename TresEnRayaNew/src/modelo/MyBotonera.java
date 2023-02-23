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
	private boolean moverFicha;

	public MyBotonera(MyLabelVictory myLabelVictory) {
		this.myLabelVictory = myLabelVictory;
		crearBotones();
		moverFicha = false;
	}

	private void crearBotones() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				botonera[i][j] = new MyBoton(new Coordenada(i, j));
				botonera[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						MyBoton boton = (MyBoton) e.getSource();

						colocarFichasParaTurnoMenorDeSeis(boton);

						if (gestionDatosPartida.getTurno() >= 6 && moverFicha == false) {
							moverFicha = colocarFichaaTurnoMayorQueSeis(boton, gestionDatosPartida, moverFicha);
							cogerPosicionAntigua(boton);
						} if (moverFicha==true){
							moverFicha(boton, gestionDatosPartida, moverFicha);
						}

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
			myLabelVictory.setText("Victoria");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					botonera[i][j].setEnabled(false);
					;
				}
			}
		}

	}

	public void colocarFichasParaTurnoMenorDeSeis(MyBoton boton) {
		if (gestionDatosPartida.getTurno() < 6) {
			if (gestionDatosPartida.getTurno() % 2 == 0 && boton.getText().equals("")) {
				boton.setText("X");
				gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 1);
				gestionDatosPartida.aumentarTurno();
			} else {

				boton.setText("O");
				gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 2);
				gestionDatosPartida.aumentarTurno();
			}

		}

	}

	public void comprovacionTresEnRaya() {
		gestionDatosPartida.setVictoria(gestionDatosPartida.tablero.comprobarTresEnRaya());

	}

	public boolean colocarFichaaTurnoMayorQueSeis(MyBoton boton, GestionDatosPartida tablero, boolean moverFicha) {

		if (boton.getText().equalsIgnoreCase("X")
				&& gestionDatosPartida.tablero.comprobarBloqueada(boton.getCoordenada()) == false && moverFicha==false) {
			gestionDatosPartida.tablero.setValorPosicion(boton.getCoordenada(), 0);
			boton.setText("");
			return true;
		}
		if (boton.getText().equals("O")) {
			return true;

		}
		return false;

	}

	public void moverFicha(MyBoton boton, GestionDatosPartida gestionDatosPartida, boolean moverFicha) {
		gestionDatosPartida.setPosicionNueva(boton.getCoordenada());
		if (gestionDatosPartida.getPosicionNueva() != gestionDatosPartida.getPosicionAnterior()
				&& boton.getText().equalsIgnoreCase("")&& moverFicha==true) {
			gestionDatosPartida.tablero.setValorPosicion(gestionDatosPartida.getPosicionNueva(), 1);
			boton.setText("X");

		} else {

		}
	}

	public void cogerPosicionAntigua(MyBoton boton) {
		gestionDatosPartida.setPosicionAnterior(boton.getCoordenada());

	}

}
