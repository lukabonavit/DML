package Negocios;

import IU.Interfaz;

import java.util.LinkedList;

import Datos.Productos;

public class Galpon {

	public static void main(String[] args) {
		Interfaz i1 = new Interfaz();
		i1.Login();
	}

	LinkedList<Productos> Galpon = new LinkedList<Productos>();

	public boolean add(Productos producto) {
		char[] letras = producto.getNombre().toCharArray();
		if (letras.length >= 3 && letras.length <= 60) {
			Galpon.add(producto);
			return true;
		}
		return false;
	}

	public Productos Buscar(int id) {
		Productos producto = new Productos();
		for (int i = 0; i < Galpon.size(); i++) {
			System.out.println(Galpon.get(i));
			producto = Galpon.get(i);
			int aux = producto.getId();

			if (aux == id) {
				return producto;
			}
		}
		int aux = 0;
		producto.setId(aux);
		return producto;
	}

	public boolean Borrar(Productos producto) {
		if (Galpon.remove(producto)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Mover(Productos producto) {
		if (Galpon.remove(producto)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Editar(Productos producto) {
		int index = IndexProductos(producto);
		Galpon.set(index, producto);
		return true;
	}

	public int IndexProductos(Productos producto) {
		Productos aux2 = new Productos();
		for (int i = 0; i < Galpon.size(); i++) {
			System.out.println(Galpon.get(i));
			aux2 = Galpon.get(i);
			int aux = aux2.getId();
			if (aux == producto.getId()) {
				return i;
			}
		}
		return 0;

	}

	public LinkedList<Productos> getProducto() {
		return Galpon;
	}

	public void setProductos(LinkedList<Productos> producto) {
		Galpon = producto;
	}

	@Override
	public String toString() {
		return "Listado de Productos [Lista=" + Galpon + "]\n";
	}

}
