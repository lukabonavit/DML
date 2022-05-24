package Datos;

public class Administradores extends Persona {

	private int legajoAdmin;

	public int getLegajoAdmin() {
		return legajoAdmin;
	}

	public void setLegajoAdmin(int legajoAdmin) {
		this.legajoAdmin = legajoAdmin;
	}

	public Administradores(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
		// TODO Auto-generated constructor stub
	}

	public Administradores() {
		super();
	}

	@Override
	public String toString() {
		return "Administradores [Legajo de Administrador=" + legajoAdmin + "]";
	}

}
