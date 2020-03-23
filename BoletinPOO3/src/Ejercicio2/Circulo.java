package Ejercicio2;

public class Circulo extends Figura {
	
	private double radio;
	private double PI = 3.14;
	
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	
	protected void calcularArea() {
	     this.setArea(radio*radio*PI);
	}

}
