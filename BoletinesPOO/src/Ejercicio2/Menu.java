package Ejercicio2;
import java.util.Scanner;

public class Menu {
	Scanner sc=new Scanner(System.in);
	double resultadoOperacion;
	
	
	
	public Menu() {
		System.out.println("Bienvenido/a a la calculadora de Áreas POO! escoje tu operación preferida para comenzar\n 1-Triángulo\n 2-Cuadrado\n 3-Rectangulo\n 4-Rombo.");
	}
	
	public  double getareaTriangulo() {
		System.out.println("Introduce la base y la altura de tu triángulo, por favor.");
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		this.resultadoOperacion = base*altura/2;
		return this.resultadoOperacion;
		
	}
	public double getareaCuadrado() {
		System.out.println("Introduce el valor de tu cuadrado, por favor.");
		double lado = sc.nextDouble();
		this.resultadoOperacion = lado*lado;
		return this.resultadoOperacion;
	}
	public double getareaRectangulo() {
		System.out.println("Introduce la base y altura de tu rectángulo, por favor.");
		double base =  sc.nextDouble();
		double altura = sc.nextDouble();
		this.resultadoOperacion = base*altura;
		return this.resultadoOperacion;
	}
	public double getareaRombo() {
		System.out.println("Introduce la la diagonal mayor y menor de tu rombo, por favor.");
		double diagonalMayor = sc.nextDouble();
		double diagonalMenor = sc.nextDouble();
		this.resultadoOperacion = diagonalMayor*diagonalMenor/2;
		return this.resultadoOperacion;
	}
}
