package Ejercicio21;
import java.util.Scanner;

public class areaTriangulo {
      
	double base, altura, areaTriangulo;
	 public areaTriangulo() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Introduce la base y la altura de tu triangulo, por favor.");
		 this.base = sc.nextDouble();
		 this.altura = sc.nextDouble();
		 areaTriangulo = base*altura/2;
		 System.out.println("La área de tu triángulo es:"+areaTriangulo);
		
		 
		 
	 }	
	
}
