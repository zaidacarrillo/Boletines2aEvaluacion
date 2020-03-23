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
	
	protected void calcularArea() {
	     this.setArea(getLado()*base);
	}


}
