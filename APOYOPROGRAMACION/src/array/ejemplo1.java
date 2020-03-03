package array;

public class ejemplo1 {

	public static void main(String[] args) {
		int [] miArray = new  int [8];
		miArray[0] = 123;
		miArray[1] = 12;
		miArray[2] = 23;
		miArray[3] = 13;
		miArray[4] = 23;
		miArray[5]= 234;
		miArray[6] = 3;
		miArray[7] = 3;
			
		//for(int lectura:miArray) {
			//System.out.println(lectura);
		//}
		for(int posicion=0; posicion < miArray.length; posicion++) {
			System.out.println("La posición ficticia para el usuario es:"+(posicion+1));
			System.out.println("EL valor es:"+miArray[posicion]);
			
		}
		
		
		}

}
