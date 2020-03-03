package ejer1;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	int opcion;
	int restaNumeroMayor;
	int restaNumeroMenor;
	int resultado=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce una opcion suma (1) resta2 o division3");
	opcion=sc.nextInt();
	System.out.println("Introducce dos números por favor");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	if(opcion== 1) {
		int suma=num1+num2;
		System.out.println(suma);
		
	}if(opcion==2) {
		if(num1>num2) { 
		   resultado=num1-num2;
		   System.out.println(resultado);
		
		}else {
		   resultado=num2-num1;
		   System.out.println(resultado);
		}
		
	}if(opcion==3) {
		if(num1>num2) {
		   resultado=num1/num2;
		System.out.println(resultado);
		}else {
		   resultado=num2/num1;
		   System.out.println(resultado);
		}
		sc.close();
		
	}
	

	}

}