package Ejercicio1;

public class Vehiculo {
   private  String matricula;	
   private int velocidadMaxima;
   private String	tipo;
   private  Conductor conductor;
   
   public Vehiculo(String matricula, int velocidadMaxima, String tipo) {
	   this.matricula = matricula;
	   this.velocidadMaxima = velocidadMaxima;
	   this.tipo = tipo;
	    
   }
   public Vehiculo() {
	   
   }
   
public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public int getVelocidadMaxima() {
	return velocidadMaxima;
}

public void setVelocidadMaxima(int velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public Conductor getConductor() {
	return conductor;
}

public void setConductor(Conductor conductor) {
	this.conductor = conductor;
}
 
public void mostrarDatos() {
	System.out.printf("matricula: %s,vMax: %s,tipo: %s",matricula,velocidadMaxima,tipo);
}










}
