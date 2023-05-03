package actividad4;

public class Lavadora extends Electrodomestico{

	protected int carga;

	public Lavadora() {
		super();		
		carga = 5;
	}

	public Lavadora(int preciobase, int peso) {
		super(preciobase, peso);
		carga = 5;
	}

	public Lavadora(int preciobase, String color, String consumo, int peso, int carga) {
		super(preciobase, color, consumo, peso);
		
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	
	
	@Override
	public int preciofinal() {
		int precio = super.preciofinal();
		
		if (carga > 30) {
			
			precio += 50;
			
		} 
		
		return precio;
	}
	
	
}
