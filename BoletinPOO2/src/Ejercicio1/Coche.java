package Ejercicio1;

public class Coche extends Vehiculo {
	private int numeroPlazas;
	
	
   public Coche(String matricula,String tipo, int VelocidadMaxima, int NumeroPlazas, Conductor conductor){
	   this.setMatricula(matricula);
	   this.setTipo(tipo);
	   this.setVelocidadMaxima(VelocidadMaxima);
	   this.numeroPlazas = NumeroPlazas;
	   this.setConductor(conductor);
	   
   }


public int getNumeroPlazas() {
	return numeroPlazas;
}


public void setNumeroPlazas(int numeroPlazas) {
	this.numeroPlazas = numeroPlazas;
}

@Override
public void mostrarDatos() {
	super.mostrarDatos();
	System.out.printf("%d", numeroPlazas);
}

}
