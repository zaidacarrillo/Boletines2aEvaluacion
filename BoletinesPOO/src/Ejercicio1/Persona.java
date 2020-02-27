package Ejercicio1;

public class Persona {
	String nombre;
	int altura;
	String fechaNacimiento;
	int edad;

	public Persona () {
		
	}
	public Persona(String nombre, int edad, int altura, String fechaNacimiento) {
		this.nombre = nombre;
		 this.edad = edad;
		 this.altura = altura;
		 this.fechaNacimiento = fechaNacimiento;
	}
	public  void mostrarDatos() {
		System.out.printf("%s\n,%d\n,%s\n",nombre, altura, fechaNacimiento);
	}
	public void  obtenerEdad() {
		System.out.printf("La edad es %d\n",edad);
	}
		
}





