package ClaseRectangulo;

public class Rectangulo {
     double altura;
     double base;
    
    
  public Rectangulo(){
	  System.out.println("No se setea valor.");
  }
   public Rectangulo(double altura, double base){
	   System.out.println("Valores inicializados");
	   this.altura = altura;
	   this.base = base;
	   
   }
   public  double getArea() {
	   double area = base*altura;
	   return area;
   }
   public  double getPerimetro() {
	   double perimetro = base+base+altura+altura;
	   return perimetro;
   }
}
