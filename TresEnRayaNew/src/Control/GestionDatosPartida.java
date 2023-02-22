package Control;

import modelo.Coordenada;
import modelo.Tablero;

public class GestionDatosPartida {
	private boolean Victoria;
	public Tablero tablero = new Tablero();
	private int turno=0;
	private int fichasLibres;
	private int fichaColumna[][]=new int [3][1];
	
	public GestionDatosPartida() {
		super();
		Victoria=false;
		
		
	}

	public int getTurno() {
		return turno;
	}



	public void setTurno(int turno) {
		this.turno = turno;
	}

	public int getFichasLibres() {
		return fichasLibres;
	}

	public void setFichasLibres(int fichasLibres) {
		this.fichasLibres = fichasLibres;
	}

	public int[][] getFichaColumna() {
		return fichaColumna;
	}

	public void setFichaColumna(int[][] fichaColumna) {
		this.fichaColumna = fichaColumna;
	}

	public void setFichaColumna(int x, int i) {
		
		
	}

	public boolean isVictoria() {
		return Victoria;
	}

	public void setVictoria(boolean victoria) {
		Victoria = victoria;
	}
	
	
	
	
}
