package Ejercicio2;

public abstract class Figura {
      private static double area;
      
      
      protected abstract void calcularArea();
      
      protected static void imprimirArea() {
    	  System.out.println("El área de la figura es: "+area);
      }

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
      
     
		
}

