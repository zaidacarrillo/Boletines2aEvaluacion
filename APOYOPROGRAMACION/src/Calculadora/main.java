package Calculadora;
import java.util.Scanner;
import Calculadora.Calculadora;;

public class main {
	

	public static void main(String[] args) {
		int resultado;
		Scanner sc=new Scanner(System.in);

		Calculadora calc = new Calculadora();
		
		resultado= calc.suma(2,3);
		
		System.out.println("El resultado de sumar 2 y 3 es;"+resultado);
		

	}

}
