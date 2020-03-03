package POO;

public class main {

	public static void main(String[] args) {
		//creacion (instanciar) un objeto usuario
		
		usuario miPrimerObjUsuario = new usuario("email@mail.com","nombre",43);
		//ya hay un objeto en memoria
		System.out.println("La edad del primer usuario es"+ miPrimerObjUsuario.edad);
		
		miPrimerObjUsuario.edad = 123;
		
		System.out.println("La nueva edad del primer usuario es"+ miPrimerObjUsuario.edad);
		
		//miPrimerObjUsuario.activar() = true;
         
	}

}
