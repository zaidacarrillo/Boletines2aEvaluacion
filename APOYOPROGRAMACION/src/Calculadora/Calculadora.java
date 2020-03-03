package Calculadora;
import java.util.Date;
import java.util.Scanner;

public class Calculadora {
	Scanner sc=new Scanner(System.in);
	int resultadoOperacion;
	
	
	public Calculadora() {
		System.out.println("Nueva Calculadora creada!!");
	}	
	
	public  int suma(int op1, int op2) {
		this.resultadoOperacion= op1+ op2;
		return this.resultadoOperacion;
	
	}
	
	public  int resta(int op2) {
		System.out.println("Introduce dos operandos");
		int operandoResta1=sc.nextInt();
		int operandoResta2=sc.nextInt();
		return op2;
		
		
	}
	
	
	
}
