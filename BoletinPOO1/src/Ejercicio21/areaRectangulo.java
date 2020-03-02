package Ejercicio21;

import java.util.Scanner;

public class areaRectangulo {
	double diagonalMenor, altura, areaRectangulo, resultadoOperacion, diagonalMayor;

	public  areaRectangulo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la base y altura de tu rectángulo, por favor.");
		 this.diagonalMayor =  sc.nextDouble();
		 this.diagonalMenor = sc.nextDouble();
		 this.resultadoOperacion = diagonalMayor*diagonalMenor/2;
		 System.out.println("El área de tu rectángulo es:"+this.resultadoOperacion);
	}	
}
