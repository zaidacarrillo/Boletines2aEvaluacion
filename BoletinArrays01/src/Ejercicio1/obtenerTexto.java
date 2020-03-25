package Ejercicio1;
import java.util.Scanner;

public class obtenerTexto {
	public static String obtenerTexto() {
		  String texto;
			Scanner sc=new Scanner(System.in);
		     System.out.println("Introduce un texto");
		     texto=sc.nextLine();
		     return texto;

	}

}
