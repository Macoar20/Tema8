package actividad4;

public class Television extends Electrodomestico{

	protected int resolucion;
	protected boolean sintonizadorTDT;
	
	public Television() {
		super();
		resolucion = 20;
		sintonizadorTDT = false;
	}
	
	public Television(int preciobase, int peso) {
		super(preciobase, peso);
		resolucion = 20;
		sintonizadorTDT = false;
	}
	
	public Television(int preciobase, String color, String consumo, int peso, int resolucion, boolean TDT) {
		super(preciobase, color, consumo, peso);
	this.resolucion = resolucion;
	this.sintonizadorTDT = TDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public int preciofinal() {
			
			int precio = super.preciofinal();
			
			if (resolucion > 40) {
				
				precio *= 1.3;
				
			} 
			if (sintonizadorTDT) {
				precio += 50;
			}
			return precio;
	}
	
}
