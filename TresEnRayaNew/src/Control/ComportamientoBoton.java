package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.MyBoton;
import modelo.MyBotonera;

public class ComportamientoBoton extends MyBotonera {
	
public ComportamientoBoton() {
		super();
	}


ActionListener comportaminetoBoton = new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		MyBoton boton = (MyBoton) e.getSource();
		boton.setText("X");
		
		
	}
};
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
