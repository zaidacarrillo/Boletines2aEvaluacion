package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		Vehiculo miVehiculo = new Vehiculo("3333BD",200,"Sed�n");
		Conductor conduct = new Conductor("11111B","Jesucristo");
	    Coche v1 = new Coche("AAAA","Sed�n",4,4,conduct);
	    Remolque r1 = new Remolque("66666JF",56);
	    Camion c1 = new Camion("77777F","R�gido",5,r1,conduct);
       
	    v1.mostrarDatos();
	
	  
	    c1.mostrarDatos();
	    System.out.println(r1.toString()); 
	}

}


