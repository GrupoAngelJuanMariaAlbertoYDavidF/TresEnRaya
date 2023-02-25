package Control;

import modelo.Coordenada;
import modelo.Tablero;

public class GestionDatosPartida {
	private boolean Victoria;
	public Tablero tablero = new Tablero();
	private int turno;
	private int fichaColumna[][]=new int [3][1];
	private Coordenada posicionAnterior;
	private Coordenada posicionNueva;
	
	public GestionDatosPartida() {
		super();
		Victoria=false;
		turno=0;
		
		
	}

	public int getTurno() {
		return turno;
	}



	public void setTurno(int turno) {
		this.turno = turno;
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

	public Coordenada getPosicionAnterior() {
		return posicionAnterior;
	}

	public void setPosicionAnterior(Coordenada posicionAnterior) {
		this.posicionAnterior = posicionAnterior;
	}

	public Coordenada getPosicionNueva() {
		return posicionNueva;
	}

	public void setPosicionNueva(Coordenada posicionNueva) {
		this.posicionNueva = posicionNueva;
	}
	public void aumentarTurno() {
		setTurno(getTurno()+1);
		
	}
	public void imprimirTablero() {
		  for (int i = 0; i < tablero.tablero.length; i++) {
	            for (int j = 0; j < tablero.tablero.length; j++) {
	                System.out.print(this.tablero.tablero[i][j] + "|");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	
}
	
	
	

