package Ejercicio2;

public class Cuadrado extends Figura{
	
	private double lado;

	
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public final void calcularArea() {
	    this.setArea(lado*lado);
		
	}


	@Override
	public void calcularPerimetro() {
		this.setPerimetro(lado*4);
		
	}


	@Override
	public void imprimirDatosFigura() {
		
		
	}

}
