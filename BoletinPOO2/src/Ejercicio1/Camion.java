package Ejercicio1;

public class Camion extends Vehiculo {
	private int altura;
	private Remolque remolque;
	
	
	public Camion(String matricula, int velocidadMaxima, String tipo, int altura) {
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.altura = altura;
		this.setVelocidadMaxima(velocidadMaxima);
		
	}
	
	public Camion() {
		
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public Camion(String matricula,	String tipo, int vMaxima, Remolque remolque, Conductor conductor, int altura) {
	   this.setMatricula(matricula);
	   this.setTipo(tipo);
	   this.setVelocidadMaxima(vMaxima);
	   this.setRemolque(remolque);
	   this.setConductor(conductor);
	   this.setAltura(altura);
	   
	  
	}
	
	public void mostrarDatos() {
		
		System.out.println("altura: " + altura);
		super.mostrarDatos();
	}
	
	

}
