package array;
import java.util.Scanner;

public class IntroducionDatosArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int LongitudArray;
		System.out.println("Introduce la logitud del array, por favor");
		LongitudArray=sc.nextInt();
		int [] usuario = new int [LongitudArray];
		for( int posicion=0;posicion<usuario.length;posicion++) {
			System.out.println("Introduce un valor hasta que la colección de datos termine:");
			int ValorUsuario=sc.nextInt();
			usuario [posicion]= ValorUsuario; 
	
		}for(int posicion=0; posicion< usuario.length; posicion++) {
			System.out.println("El valor es:"+usuario[posicion]);
		}	
		//for(int lectura:usuario) {
		//	System.out.println(lectura);
		//}
	}

}
