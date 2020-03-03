package ejercicioEmpleado;
import java.util.Scanner;

public class Empleado {
    private	int id;
	private String nombre;
	private String apellido;
	private double salario;
	
	//constructores
	public Empleado() {
		System.out.println("Constructor vacío");
	}
	public double getsalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el valor de tu salario:");
		this.salario = sc.nextInt();
		return this.salario;
	}
	public Empleado(String nombre, String apellido, double salario) {
		System.out.println("Constructor con datos");
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
			
	}
	//getters
	public double getSalario() {
		return this.salario;
	}
	//setters
	public void setSalario(double  salario) {
		this.salario = salario;
	}
	//toString  necesario para printear atributos
	public  String toString() {
		return "Soy el empleado "+this.nombre+" y cobro\n"+this.salario+"$";
	}
	public double getSalarioAnual() {
		return this.salario*12;
		
	}
	//no printea simplemente actualiza el salario
	public void SubirSalario(double porcentaje) {
	     this.salario = this.salario + (this.salario * (porcentaje/100));
		
	}

}
