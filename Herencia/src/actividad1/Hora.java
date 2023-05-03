package actividad1;

import actividad1.Hora;
/**
 * 
 * @author Macocar
 *
 */
public class Hora {
	/*
	 * Variable hora y minutos
	 */
	int Hora;
	int Minutos;
	/*
	 * 
	 */
	public Hora (int hora, int minutos) {
	
		if (hora >= 0 && hora <= 23) {
		this.Hora = hora;
		}
		if (minutos >= 0 && minutos <= 59) {
		this.Minutos = minutos;
		}
	}
	/*
	 * 
	 */
	public void inc() {
		 if (Minutos < 60) {
	            Minutos++;
	        } else {
	            Minutos = 0;
	        }	
	}
	/*
	 * 
	 */
	public boolean setMinutos(int minutos) {
		
		boolean modificacion = false;
		
		if (minutos < 60 && minutos >= 0) {
			this.Minutos = minutos;
			modificacion = true;
		}
		
		return modificacion;
		
	}
	/*
	 * 
	 */
	public boolean setHora(int hora) {
		
		boolean comp = false;
		if (hora < 24 && hora >= 0) {
			this.Hora = hora;
			comp = true;
		}
		
		return comp;
		
	}
	
	public String toString() {
		return super.toString();
	}
				
}

