package Ejercicio1;

public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		String contenido = obtenerTexto.obtenerTexto();
		char[] letras = obtenerArrayChar.obtenerArrayChar(contenido);
		imprimirArray(letras);
	}
	static void imprimirArray(char []letras) {
		System.out.print(letras);
		
	}
}



