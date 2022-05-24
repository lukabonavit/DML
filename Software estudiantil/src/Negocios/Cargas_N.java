package Negocios;

import java.util.LinkedList;

import IU.Interfaz;

import Datos.Cargas;
import Datos.Conductores;

public class Cargas_N {

	public static void main(String[] args) {
		Interfaz i1 = new Interfaz();
		i1.Login();
	}

	LinkedList<Cargas> cargas = new LinkedList<Cargas>();

	LinkedList<Conductores> conductores = new LinkedList<Conductores>();

	public boolean add(Cargas carga) {
		char[] letras = carga.getNombreDeCarga().toCharArray();
		if (letras.length >= 3 && letras.length <= 60) {
			cargas.add(carga);
			return true;
		}

		cargas.add(carga);
		return false;

	}

	public boolean AsignarConductor(Conductores conductor) {
		char[] letras = conductor.getNombre().toCharArray();
		if (letras.length >= 3 && letras.length <= 60) {
			conductores.add(conductor);
			return true;
		}
		conductores.add(conductor);
		return false;
	}

	public Cargas BuscarCargas(int idDeCarga) {
		Cargas carga = new Cargas();
		for (int i = 0; i < cargas.size(); i++) {
			System.out.println(cargas.get(i));
			carga = cargas.get(i);
			int aux = carga.getIdDeCarga();

			if (aux == idDeCarga) {
				return carga;
			}
		}
		int aux = 0;
		carga.setIdDeCarga(aux);
		return carga;
	}

	public boolean BorrarCargas(Cargas carga) {
		if (cargas.remove(carga)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean EditarCargas(Cargas carga) {
		int index = IndexCarga(carga);
		cargas.set(index, carga);
		return true;
	}

	public int IndexCarga(Cargas carga) {
		Cargas aux2 = new Cargas();
		for (int i = 0; i < cargas.size(); i++) {
			System.out.println(cargas.get(i));
			aux2 = cargas.get(i);
			int aux = aux2.getIdDeCarga();
			if (aux == carga.getIdDeCarga()) {
				return i;
			}
		}
		return 0;

	}

	public LinkedList<Cargas> getCarga() {
		return cargas;
	}

	public void setCarga(LinkedList<Cargas> carga) {
		this.cargas = carga;
	}

	public LinkedList<Conductores> getConductor() {
		return conductores;
	}

	public void setConductor(LinkedList<Conductores> conductores) {
		this.conductores = conductores;
	}

	@Override
	public String toString() {
		return "Listado de Cargas [Lista=" + cargas + "]\n";
	}

}
