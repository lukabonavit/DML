package Datos;

public class Cargas extends Conductores {

	private int idDeCarga;
	private String nombreDeCarga;

	public int getIdDeCarga() {
		return idDeCarga;
	}

	public void setIdDeCarga(int idDeCarga) {
		this.idDeCarga = idDeCarga;
	}

	public String getNombreDeCarga() {
		return nombreDeCarga;
	}

	public void setNombreDeCarga(String nombreDeCarga) {
		this.nombreDeCarga = nombreDeCarga;
	}

	public Cargas(String nombre, String apellido, String dni, int legajoConductores) {
		super(nombre, apellido, dni, legajoConductores);
	}

	public Cargas() {
		super();
	}

	@Override
	public String toString() {
		return "Cargas [idDeCarga=" + idDeCarga + ", nombreDeCarga=" + nombreDeCarga + ", getLegajoConductores()="
				+ getLegajoConductores() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getDni()=" + getDni() + "]";
	}

}
