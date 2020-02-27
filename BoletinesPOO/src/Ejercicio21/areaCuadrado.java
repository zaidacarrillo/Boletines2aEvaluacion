package Ejercicio21;
import java.util.Scanner;

public class areaCuadrado {
	double lado, areaCuadrado;
	
	public areaCuadrado() {
		Scanner sc=new Scanner(System.in);	
	    System.out.println("Introduce el valor de tu cuadrado, por favor.");
	    this.lado = sc.nextDouble();
	   this.areaCuadrado = lado*lado;
	   System.out.println("El área de este cuadrado es:"+this.areaCuadrado);
	
	}
	
}
