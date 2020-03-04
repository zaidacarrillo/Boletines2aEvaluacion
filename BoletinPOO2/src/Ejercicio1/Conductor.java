package Ejercicio1;

public class Conductor {
    String dni;
    String 	nombre;
    
    public Conductor(String dni, String nombre) {
    	this.dni = dni;
    	this.nombre = nombre;
    }
    @Override
    public String toString() {
    	return "    "+this.nombre+"   "+this.dni+"  ";
    	
    }
}
