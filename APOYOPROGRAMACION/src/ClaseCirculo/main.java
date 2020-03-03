package ClaseCirculo;
import Calculadora.Calculadora;

public class main {

	public static void main(String[] args) {
		double area, resultadoArea;
		
		Circulo circ = new Circulo();
		Circulo miOtroCirc = new Circulo();
		
		//setear nuevos valores.
		circ.radio = 3;
		miOtroCirc.radio = 7;
		circ.color = "rojo";
		//referenciar método.
		resultadoArea = circ.getArea();
		System.out.println(resultadoArea);
		
		
	   Circulo Circulo = new Circulo();
	   Circulo.radio = 5;
		Circulo.color = "Hola";
	}
}
