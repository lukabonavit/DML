package Datos;

public class Productos {

	private int cantidad, id;
	private boolean estado;
	private String nombre;
	private double peso, precio;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getpeso() {
		return peso;
	}

	public void setpeso(double peso) {
		this.peso = peso;
	}

	public Productos(int cantidad, int id, int precio, boolean estado, String nombre, double peso) {
		super();
		this.cantidad = cantidad;
		this.id = id;
		this.precio = precio;
		this.estado = estado;
		this.nombre = nombre;
		this.peso = peso;
	}
	
	public Productos() {
		super();
	}

	@Override
	public String toString() {
		return "Producto [Cantidad de Productos=" + cantidad + ", Id de Producto=" + id + ", Precio de Producto="
				+ precio + ", Estado de Producto=" + estado + ", Nombre de Producto=" + nombre + ", Peso de Producto="
				+ peso + "]";
	}

}
