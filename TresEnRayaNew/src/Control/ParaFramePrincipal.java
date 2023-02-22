package Control;

import java.awt.GridLayout;

import Vista.FramePrincipal;
import modelo.MyBoton;
import modelo.MyBotonera;
import modelo.MyLabelVictory;

public class ParaFramePrincipal extends FramePrincipal {
		
	public ParaFramePrincipal() {
		super();
		
		
		}
	
	public void  aztualizarMensajeVictoria() {
		if (gestionDatosPartida.isVictoria()==true) {
			lblMensajeVictoria = new MyLabelVictory("");
			panelBotones.add(lblMensajeVictoria);
			}
		
	}
	
		
		
	}
		

	
		
	

