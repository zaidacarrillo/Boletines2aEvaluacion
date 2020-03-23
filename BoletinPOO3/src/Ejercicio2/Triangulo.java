package Ejercicio2;

public class Triangulo extends Figura{
	
	 private double base, altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	protected void calcularArea() {
		  this.setArea(base*altura/2);
			
		}
	 
	 
}
