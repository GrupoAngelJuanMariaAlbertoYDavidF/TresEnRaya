package modelo;

import javax.swing.JButton;

import modelo.Coordenada;

public class MyBoton extends JButton {
	private Coordenada coordenada;
	
	public MyBoton (Coordenada coordenada) {
		super("");
		this.coordenada = coordenada;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}
	

}
