package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		Circulo miCirculo = new Circulo(5.5);
		Cuadrado miCuadrado = new Cuadrado(6);
		Triangulo miTriangulo = new Triangulo(4,2.2);
		Rectangulo miRectangulo= new Rectangulo(6,2);
		
		miTriangulo.calcularArea();
		System.out.printf("El área de mi triangulo es:%f\n",miTriangulo.getArea());
		miCirculo.calcularArea();
		System.out.printf("El área de mi circulo es:%f\n",miCirculo.getArea());
		miCuadrado.calcularArea();
		System.out.printf("El área de mi cuadrado es:%f\n",miCuadrado.getArea());
		miRectangulo.calcularArea();
		System.out.printf("El área de mi rectangulo es:%f\n",miRectangulo.getArea());
		

	}

}
