package ClaseDate;

public class Date {
	private int a�o, mes, dia;

	// constructor
	public Date() {
		System.out.println("Constructor vac�o");
	}

	// getters y setters
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void aumentarDia() {
		if (this.dia > 31) {
			this.dia = 1;
		} else {
			this.dia = this.dia + 1;
		}
	}

	public void aumentarMes() {
		if (this.mes > 12) {
			this.mes = 1;
			
		}else {
			this.mes = this.mes + 1;
	     	}
		}
	

	public void aumentarA�o() {	
		this.a�o = this.a�o + 1;

	}

	public String toString() {
		int diaNuevo = this.dia;
		int mesNuevo = this.mes;
		int a�oNuevo = this.a�o;

		return "Vivimos en el d�a " + diaNuevo + " del mes " + mesNuevo + " y del a�o " + a�oNuevo;
	}
}
