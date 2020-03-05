package Ejercicio1;

public class Remolque {
    String matricula;
    int longitud;
    
    public Remolque(String matricula, int longitud) {
    	this.matricula = matricula;
    	this.longitud = longitud;
    }
    @Override
    public String toString() {
    	return " "+this.matricula+" "+this.longitud;
    	
    }
}
