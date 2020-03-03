package ClaseTime;

public class Time {
    private int horas, minutos, segundos;
    
    
    public Time(int horas, int minutos, int segundos) {
    	this.setHoras(horas);
    	this.setMinutos(minutos);

    }


	public int getMinutos() {
		return minutos;
	}


	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}


	public int getSegundos() {
		return segundos;
	}


	public void setSegudos(int segundos) {
		this.segundos = segundos;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public String toString() {
		return this.horas +":"+ this.minutos+":"+this.segundos;
	}
	
	public void aumentarMinutos(int minutos) {
		int numeroTotalMinutos = this.minutos + minutos;
		
		int numeroHoras = numeroTotalMinutos / 60;
		int numeroFinalMinutos = (numeroHoras*60);
		
		this.horas = this.horas + numeroHoras;
		this.minutos = minutos;
	}
    
    
}
