package ClaseDate;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		int dia, mes, a�o;
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();

		System.out.println("�A qu� d�a estamos hoy?");
		dia = sc.nextInt();
		if (dia > 31) {
			System.out.println("D�a no v�lido, finalizando sistema. Presione cualquier tecla para continuar.");
			sc.next();
			System.exit(0);
		}else {
			fecha.setDia(dia);
		}
		
		System.out.println("�En que mes vivimos?");
		mes = sc.nextInt();
		if (mes > 13) {
			System.out.println("Mes no v�lido, finalizando sistema. Presione cualquier tecla para continuar.");
			sc.next();
			System.exit(0);
		}
		else{
			fecha.setMes(mes);
		}

		System.out.println("�En que a�o vivimos?");
		a�o = sc.nextInt();
		fecha.setA�o(a�o);

		System.out.println("El sistema procede a actualizarse un d�a del que se ha introducido.");
		fecha.aumentarDia();

		System.out.println("El sistema procede a actualizarse un mes del que se ha introducido");
		fecha.aumentarMes();

		System.out.println("El sistema procede a actualizarse un a�o del que se ha introducido");
		fecha.aumentarA�o();

		System.out.println(fecha.toString());
	}

}
