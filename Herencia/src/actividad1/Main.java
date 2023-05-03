package actividad1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Necesitamos poder llamar a los métodos de las clases
		 */
		HoraExacta ma = new HoraExacta(23,59,59);
		ma.inc();
		System.out.println(ma);
		
		Hora hora = new Hora(23,59);
		hora.setHora(56);
		hora.setMinutos(60);
		hora.inc();
		System.out.println(hora);
	}

}

