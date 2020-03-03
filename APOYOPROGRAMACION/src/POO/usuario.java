package POO;
import java.util.Calendar;
import java.util.Date;

public class usuario {
	
	String email;
	String nombre;
	String password;
	private boolean activado = false;
	private Date fechaDeActivacion;
	int edad = 0;
	
	public usuario() {
	  System.out.println("Objeto creandose!!");
	}
	public usuario(int edad) {
		System.out.println("Mi segundo constructor");
		this.edad = edad;
	}
	public usuario(String email, String nombre, int edad) {
		System.out.println("Mi tercer constructor");
		this.email = email;
		this.nombre = email;
		this.edad = edad;
		
	}
	
	public void activar() {
		this.activado = true;
		Date fechaActual = new Date();
		this.fechaDeActivacion = fechaActual;
	}
	
	
	
	
}

