package IU;

import java.util.Scanner;

import Datos.Cargas;
import Datos.Productos;
import Negocios.Galpon;
import Negocios.Cargas_N;

public class Interfaz {

	static Scanner entrada = new Scanner(System.in);

	static Galpon listaProducto = new Galpon();

	static Cargas_N listaCarga = new Cargas_N();

	public void Login() {

		System.out.println("Bienvenido Administrador");
		System.out.println("Para acceder a la opción escriba el numero que corresponda");
		System.out.println("1.Ingresar al galpon de productos ");
		System.out.println("2.Ingresar a las cargas ");

		int opcionAdm = entrada.nextInt();
		switch (opcionAdm) {
		case 1:

			SobreCarga();
			System.out.println("Bienvenido al galpon de productos | Administrador");
			imprimirMenu();
			break;

		case 2:
			SobreCarga2();
			System.out.println("Bienvenido a las cargas | Administrador");
			imprimirMenuCargas();
			break;

		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}
	}

	private void SobreCarga() {
		Productos producto = new Productos();
		producto.setNombre("Barra-20KG");
		producto.setId(0);
		producto.setpeso(20);
		producto.setPrecio(20.000);
		producto.setCantidad(1);
		producto.setEstado(true);
		listaProducto.add(producto);
	}

	private void imprimirMenu() {
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("Para acceder a la opción escriba el numero que corresponda");
		System.out.println("1.Ingresar productos al galpon ");
		System.out.println("2.Ver productos del galpon ");
		System.out.println("3.Buscar productos del galpon ");
		System.out.println("4.Mover productos del galpon a las cargas"); // Tienen que programar este boton!!
		System.out.println("5.Salir ");

		int opcionMenu = entrada.nextInt();
		switch (opcionMenu) {
		case 1:
			Ingresar();
			break;
		case 2:
			verPerfiles();
			break;
		case 3:
			Buscar();
			break;
		case 4:
			MoverProductos(); // Crear el metodo 
			break;
		case 5:
			Salir();
			break;
		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}
	}

	private void menuAlter(Productos producto) {
		System.out.println("1.Borrar producto del galpon ");
		System.out.println("2.Editar producto del galpon ");
		System.out.println("3.Menu principal ");

		int opcionProductos = entrada.nextInt();
		switch (opcionProductos) {
		case 1:
			Borrar(producto);
			break;
		case 2:
			Editar(producto);
			break;
		case 3:
			imprimirMenu();
			break;
		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}
	}

	private void Borrar(Productos producto) {
		System.out.println("¿Esta seguro de querer borrar a " + producto + " del galpon?");
		System.out.println("si esta seguro presione 1");
		int aux = entrada.nextInt();
		if (aux == 1) {
			if (listaProducto.Borrar(producto)) {
				System.out.println("se borro exitosamente");
			}
		} else {
			imprimirMenu();
		}
	}

	private void Editar(Productos producto) {
		System.out.println("Ingrese el nombre del producto");
		System.out.println("Debe ser un nombre de minimo 3 letras y maximo 60");
		producto.setNombre(entrada.next());
		System.out.println("Ingrese el nuevo nombre del producto");
		producto.setId(entrada.nextInt());
		System.out.println("Ingrese el nuevo ID del producto");
		producto.setpeso(entrada.nextDouble());
		System.out.println("Ingrese el nuevo peso (sabiendo que es en KG) del producto");
		producto.setPrecio(entrada.nextDouble());
		System.out.println("Ingrese el nuevo precio del producto");
		producto.setCantidad(entrada.nextInt());
		System.out.println("Ingrese la nueva cantidad del producto");
		producto.setEstado(entrada.nextBoolean());
		System.out.println("Ingrese el nuevo estado del producto");
		if (listaProducto.Editar(producto)) {
			System.out.println("el producto se pudo editar correctamente");
		} else {
			System.out.println("no se pudo editar el producto");
		}

		imprimirMenu();
	}

	private void Ingresar() {
		Productos producto = new Productos();
		System.out.println("Ingrese el nombre del producto");
		producto.setNombre(entrada.next());
		System.out.println("Ingrese el ID del producto");
		producto.setId(entrada.nextInt());
		System.out.println("Ingrese el peso (sabiendo que es en KG) del producto");
		producto.setpeso(entrada.nextDouble());
		System.out.println("Ingrese el precio del producto");
		producto.setPrecio(entrada.nextDouble());
		System.out.println("Ingrese la cantidad del producto");
		producto.setCantidad(entrada.nextInt());
		System.out.println("Ingrese el estado del producto");
		producto.setEstado(entrada.nextBoolean());
		if (listaProducto.add(producto) == true) {
			System.out.println("Se agrego correctamente el producto al galpon");
		} else {
			System.out.println("no se pudo agregar correctamente el producto");
			System.out.println("si deseas agregar nuevamente un producto al galpon ");
			System.out.println("seleccionar opcion 1");
		}
		imprimirMenu();

	}

	private void Buscar() {
		System.out.println("Ingrese el id del producto a buscar");
		int id = entrada.nextInt();
		Productos producto = new Productos();
		producto = listaProducto.Buscar(id);
		if (producto.getId() == 0) {
			System.out.println("el producto no se encontro en el galpon");
		} else {
			System.out.println("El producto es");
			System.out.println(producto);
			menuAlter(producto);
		}
		imprimirMenu();
	}

	private void verPerfiles() {
		System.out.println(listaProducto);
		imprimirMenu();

	}

	private void Salir() {
		System.out.println("El programa finalizo");
		System.exit(0);
	}

	/**********************************************
	 * CARGAS
	 ************************************************/

	private void SobreCarga2() {
		Cargas carga = new Cargas();
		carga.setNombreDeCarga("Vietnam-0001");
		carga.setIdDeCarga(0);
		carga.setLegajoConductores(22032003);
		carga.setNombre("Gamaliel");
		carga.setApellido("Quiroz");
		carga.setDni("41098774");
		listaCarga.add(carga);
	}

	private void imprimirMenuCargas() {
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("Para acceder a la opción escriba el numero que corresponda");
		System.out.println("1.Ingresar cargas ");
		System.out.println("2.Ver cargas ");
		System.out.println("3.Buscar cargas ");
		System.out.println("4.Salir ");

		int opcionCargas = entrada.nextInt();
		switch (opcionCargas) {
		case 1:
			IngresarCargas();
			break;
		case 2:
			verCargas();
			break;
		case 3:
			BuscarCargas();
			break;
		case 4:
			SalirCargas();
			break;
		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}
	}

	private void menuAlterCargas(Cargas carga) {
		System.out.println("1.Borrar carga ");
		System.out.println("2.Editar carga ");
		System.out.println("3.Menu principal ");

		int opcionModCargas = entrada.nextInt();
		switch (opcionModCargas) {
		case 1:
			BorrarCargas(carga);
			break;
		case 2:
			EditarCargas(carga);
			break;
		case 3:
			imprimirMenuCargas();
			break;
		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}
	}

	private void BorrarCargas(Cargas carga) {
		System.out.println("Esta seguro de querer borrar a " + carga + " de cargas?");
		System.out.println("si esta seguro presione 1");
		int aux = entrada.nextInt();
		if (aux == 1) {
			if (listaCarga.BorrarCargas(carga)) {
				System.out.println("se borro exitosamente");
			}
		} else {
			imprimirMenuCargas();
		}
	}

	private void EditarCargas(Cargas carga) {
		System.out.println("Ingrese el nuevo ID de la carga");
		carga.setIdDeCarga(entrada.nextInt());
		System.out.println("Ingrese el nuevo nombre de la carga");
		carga.setNombreDeCarga(entrada.next());
		System.out.println("Ingresar el nuevo legajo del conductor a asignar");
		carga.setLegajoConductores(entrada.nextInt());
		System.out.println("Ingrese el nuevo nombre del conductor");
		carga.setNombre(entrada.next());
		System.out.println("Ingrese el nuevo apellido del conductor");
		carga.setApellido(entrada.next());
		System.out.println("Ingrese el nuevo dni del conductor");
		carga.setDni(entrada.next());
		if (listaCarga.EditarCargas(carga)) {
			System.out.println("la carga se pudo editar correctamente");
		} else {
			System.out.println("no se pudo editar la carga");
		}

		imprimirMenuCargas();
	}

	private void IngresarCargas() {
		Cargas carga = new Cargas();
		System.out.println("Ingrese el ID de la carga");
		carga.setIdDeCarga(entrada.nextInt());
		System.out.println("Ingrese el nombre de la carga");
		carga.setNombreDeCarga(entrada.next());
		System.out.println("Ingresar el legajo del conductor a asignar");
		carga.setLegajoConductores(entrada.nextInt());
		System.out.println("Ingrese el nombre del conductor");
		carga.setNombre(entrada.next());
		System.out.println("Ingrese el apellido del conductor");
		carga.setApellido(entrada.next());
		System.out.println("Ingrese el dni del conductor");
		carga.setDni(entrada.next());
		if (listaCarga.add(carga) == true) {
			System.out.println("la carga se agrego correctamente");
		} else {
			System.out.println("no se pudo agregar correctamente");
			System.out.println("si deseas agregar nuevamente una carga ");
			System.out.println("seleccionar opcion 1");
		}
		imprimirMenuCargas();
	}

	private void BuscarCargas() {
		System.out.println("Ingrese id de carga a buscar");
		int idDeCarga = entrada.nextInt();
		Cargas carga = new Cargas();
		carga = listaCarga.BuscarCargas(idDeCarga);
		if (carga.getIdDeCarga() == 0) {
			System.out.println("la carga no se encontro");
		} else {
			System.out.println("La carga es");
			System.out.println(carga);
			menuAlterCargas(carga);
		}
		imprimirMenuCargas();
	}

	private void verCargas() {
		System.out.println(listaCarga);
		imprimirMenuCargas();

	}

	private void SalirCargas() {
		System.out.println("El programa finalizo");
		System.exit(0);
	}

}
