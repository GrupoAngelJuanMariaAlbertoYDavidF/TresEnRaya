package Control;

import Vista.FramePrincipal;
import modelo.MyBoton;
import modelo.MyBotonera;

public class ParaFramePrincipal extends FramePrincipal {
		
	public ParaFramePrincipal() {
		super();
		StringBuilder turno= new StringBuilder (getPanelTresEnRaya().getTurno());
		String turnoConvertido = turno.toString(); 
		getLblNumeroMovimientosJX().setText(turnoConvertido);
		
		
		}

	}
		
	

