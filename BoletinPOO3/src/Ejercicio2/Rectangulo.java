package Ejercicio2;

public class Rectangulo extends Cuadrado {
	private double base;

	public Rectangulo(double lado, double base) {
		super(lado);
		this.base= base;
	
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void calcularArea() {
	     this.setArea(getLado()*base);
	}
	
	//Lo dejo como error y no elimino el "final" para mostrar el cometido del ejercicio el cual es, mostrar que no se puede sobreescribir el método en las clases hijas.
	


}
