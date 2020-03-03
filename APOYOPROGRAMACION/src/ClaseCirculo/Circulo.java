package ClaseCirculo;
import java.util.Scanner;

public class Circulo {
	Scanner sc=new Scanner(System.in);
	double radio;
	String color;
	
	public  Circulo() {
		System.out.println("No hay nada");
		this.color = "verde";
	}
    public Circulo(double radio) {
    	this.radio = radio;
    }
	
	public double getArea() {
		double area;
		System.out.println("Inserta un radio");
		radio = sc.nextInt();
		area = Math.PI*radio*radio;
		return area;		
		
	}
	
	
	
}
