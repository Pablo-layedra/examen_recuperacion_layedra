package examen.finnal.rec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainBecados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		Scanner teclado4 = new Scanner(System.in);
		Scanner teclado5 = new Scanner(System.in);
		Scanner teclado6 = new Scanner(System.in);
		
		String usuario;
		String clave;
		String opcion;

		List<BecadoNotas> becadoNotas = new ArrayList<BecadoNotas>();
		List<BecadoDiscapacidad> becadoDiscapacidad = new ArrayList<BecadoDiscapacidad>();
		List<BecadoRecursos> becadoRecursos = new ArrayList<BecadoRecursos>();

		System.out.println("Ingrese usuario del sistema");
		usuario = teclado.nextLine();
		String usuarioMay = usuario.toUpperCase();

		while (usuarioMay.equals("ADMIN")) {

			System.out.println("Ingrese usuario del sistema");
			clave = teclado2.nextLine();
			do {
				System.out.println();
				System.out.println("SistemaSENESCYT");
				System.out.println("1. Ingresar Becado");
				System.out.println("2. Busqueda por tipo de becado");
				System.out.println("3. Busqueda general");
				System.out.println("4. SALIR");
				System.out.println();

				opcion = teclado3.nextLine();

				switch (opcion) {
				case "1":
					System.out.println();
					System.out.println("Seleccionar tipo de becado que desea ingresar: ");
					System.out.println("1. Becado por Notas");
					System.out.println("2. Becado por discapacidad");
					System.out.println("3. Becado por Recursos");

					String opcion2 = teclado4.nextLine();

					switch (opcion2) {
					case "1":
						
						System.out.println("Escriba nombre del estudiante: ");
						String nombreNotas = teclado5.nextLine();
						System.out.println("Escriba apellido del estudiante: ");
						String apellidoNotas = teclado5.nextLine();
						System.out.println("Escriba codigo del colegio del estudiante: ");
						String codigoColegio = teclado5.nextLine();
						System.out.println("Escriba cumpleaños del estudiante: ");
						System.out.println("Año (aaaa): ");
						int añoCumpleaños = teclado6.nextInt();
						System.out.println("Mes (mm): ");
						int mesCumpleaños = teclado6.nextInt();
						System.out.println("Dia: ");
						int diaCumpleaños = teclado6.nextInt();
						System.out.println("Asignar codigo de beca: ");
						String codigoBecaNotas = teclado5.nextLine();
						
						LocalDate fechaCumpleaños = LocalDate.of(añoCumpleaños, mesCumpleaños, diaCumpleaños);
						
						BecadoNotas becadoNotasNuevo=new BecadoNotas();
						becadoNotasNuevo.setNombre(nombreNotas);
						becadoNotasNuevo.setApellido(apellidoNotas);
						becadoNotasNuevo.setCodigoColegio(codigoColegio);
						becadoNotasNuevo.setFechaCumpleaños(fechaCumpleaños);
						becadoNotasNuevo.setCodigoBeca(codigoBecaNotas);
						
						System.out.println("Estudiante ingresado exitosamente");
						break;
					case "2":
						System.out.println("Escriba nombre del estudiante: ");
						String nombreDis = teclado5.nextLine();
						System.out.println("Escriba apellido del estudiante: ");
						String apellidoDis = teclado5.nextLine();
						
					}

					break;
				case "2":
					
					break;
				case "3":
					break;
				case "4":
					System.out.println("Saliendo del sistema");
					break;
				}
			} while (clave.equals("ABC"));
		}
	}
}
