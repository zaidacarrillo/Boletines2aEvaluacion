package ClaseDate;

public class Date {
	private int año, mes, dia;

	// constructor
	public Date() {
		System.out.println("Constructor vacío");
	}

	// getters y setters
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
	

	public void aumentarAño() {	
		this.año = this.año + 1;

	}

	public String toString() {
		int diaNuevo = this.dia;
		int mesNuevo = this.mes;
		int añoNuevo = this.año;

		return "Vivimos en el día " + diaNuevo + " del mes " + mesNuevo + " y del año " + añoNuevo;
	}
}
