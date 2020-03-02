package Ejercicio21;

import java.util.Scanner;

import Ejercicio1.Persona;
import Ejercicio2.Menu;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenido/a a la calculadora de Áreas POO! escoje tu operación preferida para comenzar\\n 1-Triángulo\\n 2-Cuadrado\\n 3-Rectangulo\\n 4-Rombo.");
		Scanner sc=new Scanner(System.in);
		int opcion = sc.nextInt();
	    if(opcion == 1) {
	    	System.out.println("Has seleccionado area triángulo");
	    	areaTriangulo triangulo = new areaTriangulo();
	    }if(opcion == 2) {
	    	System.out.println("Has seleccionado area cuadrado");
	    	areaCuadrado cuadrado = new areaCuadrado();
	    }if(opcion == 3) {
	    	System.out.println("Has seleccionado area rectangulo");
	    	areaRectangulo rectangulo = new areaRectangulo();
	    }
	    if(opcion == 4) {
	    	System.out.println("Has seleccionado area rombo");
	    	areaRombo rombo = new areaRombo();
	    }
		
	}

}
