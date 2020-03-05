package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		Vehiculo miVehiculo = new Vehiculo("3333BD",200,"Sedán");
		Conductor conduct = new Conductor("11111B","Jesucristo");
	    Coche v1 = new Coche("AAAA","Sedán",4,4,conduct);
	    Remolque r1 = new Remolque("66666JF",56);
	    Camion c1 = new Camion("77777F","Rígido",5,r1,conduct,15);
       
	    v1.mostrarDatos();
	    System.out.println(conduct.toString());
	    c1.mostrarDatos();
	    System.out.println(conduct.toString());
	    System.out.println(r1.toString());
	    impresionPolimorfismo(v1);
	    impresionPolimorfismo(c1);
	    
	    Camion c2 = new Camion("33333FG",300,"Grande",100);
	    c2.mostrarDatos();	
	    
	   
	}
	 public static void impresionPolimorfismo(Vehiculo miVehiculo) { //se obtiene objeto de tipo vehiculo, o sea, coche o camión
	    	miVehiculo.mostrarDatos();
	    	if(miVehiculo instanceof Camion ) { //se evalúa que si es Camion y no coche. En caso de serlo hace el if 
	    		Camion miCamion = (Camion) miVehiculo; //cast o sea, conversión forzosa de obj vehiculo a camion.
	    		System.out.println(miCamion.getRemolque());
	    	}
	    }

}


