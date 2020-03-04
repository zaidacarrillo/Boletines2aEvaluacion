package Ejercicio1;

public class Camion extends Vehiculo {
	private int altura;
	private Remolque remolque;
	
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

	public Camion(String matricula,	String tipo, int vMaxima, Remolque remolque, Conductor conductor) {
	   this.setMatricula(matricula);
	   this.setTipo(tipo);
	   this.setVelocidadMaxima(vMaxima);
	   this.setRemolque(remolque);
	   this.setConductor(conductor);
	  
	}
	
	public void mostrarDatos() {
		
		System.out.println(altura);
		super.mostrarDatos();
	}
	
	

}
