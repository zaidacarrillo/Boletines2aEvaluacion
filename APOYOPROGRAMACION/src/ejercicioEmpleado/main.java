package ejercicioEmpleado;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double salarioAnual, salarioAnual2;
	       Empleado empleado = new Empleado();
	       
	       Empleado miEmpleado2 = new Empleado("Manolo","lopez",150);
	       
           System.out.println(empleado.getSalario());
           empleado.setSalario(2000);
           miEmpleado2.setSalario(3000);
           
           System.out.println(miEmpleado2.toString());
      salarioAnual = empleado.getSalario();
      System.out.println("El salario de un empleado al año es:"+salarioAnual);
      
      salarioAnual2 = miEmpleado2.getSalario();
      System.out.println("El salario de un empleado2 al año es:"+salarioAnual);
      System.out.println("Introduce el porcentaje de subida que quieres para tu salario:");
      double porcentaje = sc.nextDouble();
      
      empleado.SubirSalario(porcentaje);
      miEmpleado2.SubirSalario(porcentaje);
           
           
	}

}
