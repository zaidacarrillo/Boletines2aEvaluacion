package ClaseRectangulo;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double area, perimetro;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la altura");
		double altura=sc.nextDouble();
		double base=sc.nextDouble();
		
		Rectangulo miRectangulo = new Rectangulo(altura, base);
		area = miRectangulo.getArea();
		perimetro = miRectangulo.getPerimetro();
		System.out.println(area);
		System.out.println(perimetro);
		
              
	}

}
