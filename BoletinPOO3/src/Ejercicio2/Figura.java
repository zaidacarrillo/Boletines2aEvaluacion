package Ejercicio2;
import Ejercicio3.ICalculosFigura;
import Ejercicio3.IImpresionFigura;

public abstract class Figura implements ICalculosFigura, IImpresionFigura{
      private static double area;
      private double perimetro;
      
      
  	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
      
      public abstract void calcularArea();
      
      public void imprimirArea() {
    	  System.out.println("El área de la figura es: "+area);
      }

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void imprimirPerimetro() {
		
	}


      
     
		
}

