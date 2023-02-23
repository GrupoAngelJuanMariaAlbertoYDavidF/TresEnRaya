package modelo;

import javax.swing.JLabel;

public class MyLabelVictory extends JLabel {

	private String mensaje;

	public MyLabelVictory(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
