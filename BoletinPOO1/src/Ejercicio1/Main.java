package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		
		Persona Jose = new Persona();
		Jose.edad = 55;
		Jose.nombre = "Jose Rodriguez Mata";
		Jose.altura = 165;
		Jose.fechaNacimiento = "15/01/1965";
		Persona Maria = new Persona();
		Maria.edad = 40;
		Maria.altura = 170; 
	    Maria.nombre = "María Sánchez Gómez";
	    Maria.fechaNacimiento = "26/12/1980";
		Persona Alejandro = new Persona();
		Alejandro.edad = 18;
		Alejandro.altura = 190;
	    Alejandro.nombre = "Alejandro Gómez Gómez" ;
	    Alejandro.fechaNacimiento = "01/11/2001";
		Persona joseManuel = new Persona(); 
		joseManuel.edad = 11;
		joseManuel.altura = 127;
		joseManuel.nombre = "Jose Manuel Pérez Pons";
		joseManuel.fechaNacimiento = "01/05/2010";
		
		Jose.mostrarDatos();
		Maria.mostrarDatos();
		Alejandro.mostrarDatos();
		joseManuel.mostrarDatos();
		
		Jose.obtenerEdad();
		Maria.obtenerEdad();
		Alejandro.obtenerEdad();
		joseManuel.obtenerEdad();
		
		
		Persona Lorena = new Persona("Lorena Remeseiro Neira",19, 160,"12/06/2000");
		Lorena.mostrarDatos();
		Persona Patricia = new Persona("Patricia Seoane Álvarez",44,175,"23/08/1976");
		Patricia.mostrarDatos();
	    
		
		
		
		
		
		
	}

}
