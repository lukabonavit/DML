package Datos;

public class Conductores extends Persona {

	private int legajoConductores;

	public int getLegajoConductores() {
		return legajoConductores;
	}

	public void setLegajoConductores(int legajoConductores) {
		this.legajoConductores = legajoConductores;
	}

	public Conductores(String nombre, String apellido, String dni, int legajoConductores) {
		super(nombre, apellido, dni);
		this.legajoConductores = legajoConductores;
	}

	public Conductores() {
		super();
	}

	@Override
	public String toString() {
		return "Conductores [legajoConductores=" + legajoConductores + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getDni()=" + getDni() + "]";
	}

}
