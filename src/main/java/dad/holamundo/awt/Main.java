package dad.holamundo.awt;

public class Main {

	public static void main(String[] args) {

		MiClase clase = new MiClase();
		clase.saludar("Manolete", "Gómez");

//		MiInterfaz implementacion = new MiInterfaz() {
//			public void saludar(String nombre) {
//				System.out.println("Buenos días " + nombre);
//			}
//		};

		MiInterfaz implementacion = (n, a) -> {
			a += "!!!";
			System.out.println("Buenos días " + n + " " + a);
		};

		implementacion.saludar("Manolete", "Gómez");

	}

}
