package Ejercicio2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double areaTriangulo, areaCuadrado, areaRectangulo, areaRombo;
		Scanner sc=new Scanner(System.in);
		Menu calculadoraPOO = new Menu();
		int opcion = sc.nextInt();
	    if(opcion == 1) {
	    	System.out.println("Has seleccionado area triángulo");
	    	areaTriangulo = calculadoraPOO.getareaTriangulo();
	    	System.out.println(areaTriangulo);
	    }else if(opcion == 2) {
	    	System.out.println("Has seleccionado area cuadrado");
	    	areaCuadrado = calculadoraPOO.getareaCuadrado();
	    	System.out.println(areaCuadrado);
	    }else  if(opcion == 3) {
	    	System.out.println("Has seleccionado area rectangulo");
	    	areaRectangulo = calculadoraPOO.getareaRectangulo();
	    }
	    if(opcion == 4) {
	    	System.out.println("Has seleccionado area rombo");
	    	areaRombo = calculadoraPOO.getareaRombo();	
	    }
	    	
	}

}
