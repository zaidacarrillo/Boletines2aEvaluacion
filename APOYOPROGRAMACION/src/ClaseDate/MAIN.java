package ClaseDate;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		int dia, mes, año;
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();

		System.out.println("¿A qué día estamos hoy?");
		dia = sc.nextInt();
		if (dia > 31) {
			System.out.println("Día no válido, finalizando sistema. Presione cualquier tecla para continuar.");
			sc.next();
			System.exit(0);
		}else {
			fecha.setDia(dia);
		}
		
		System.out.println("¿En que mes vivimos?");
		mes = sc.nextInt();
		if (mes > 13) {
			System.out.println("Mes no válido, finalizando sistema. Presione cualquier tecla para continuar.");
			sc.next();
			System.exit(0);
		}
		else{
			fecha.setMes(mes);
		}

		System.out.println("¿En que año vivimos?");
		año = sc.nextInt();
		fecha.setAño(año);

		System.out.println("El sistema procede a actualizarse un día del que se ha introducido.");
		fecha.aumentarDia();

		System.out.println("El sistema procede a actualizarse un mes del que se ha introducido");
		fecha.aumentarMes();

		System.out.println("El sistema procede a actualizarse un año del que se ha introducido");
		fecha.aumentarAño();

		System.out.println(fecha.toString());
	}

}
