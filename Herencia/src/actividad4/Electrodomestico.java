package actividad4;

public class Electrodomestico {

	protected int preciobase = 100;
	
	protected Color color = Color.Blanco;
	
	protected ConsuEner consumo = ConsuEner.F;
	
	protected int peso;
	
	enum Color {
		Blanco, Negro, Rojo, Azul, Gris
	}
	
	enum ConsuEner {
		A, B, C, D, E, F
	}

	public Electrodomestico() {
		super();
		
	}

	public Electrodomestico(int preciobase, int peso) {
		super();
		this.preciobase = preciobase;
		this.peso = peso;
	}

	public Electrodomestico(int preciobase, String color, String consumo, int peso) {
		super();
		this.preciobase = preciobase;
		this.color = Color.valueOf(color);
		this.consumo = ConsuEner.valueOf(consumo);
		this.peso = peso;
		comprobarConsumoEnergetico(consumo.charAt(0));
		comprobarColor(color);
	}

	public int getPreciobase() {
		return preciobase;
	}

	public Color getColor() {
		return color;
	}

	public ConsuEner getConsumo() {
		return consumo;
	}

	public int getPeso() {
		return peso;
	}
	
	public void comprobarConsumoEnergetico(char letra) {
		
		if (!(letra >= 'A' && letra <= 'F')) {
			
			this.consumo = ConsuEner.F;
			
		}
		
	}
	
	protected void comprobarColor (String color) {
		
		
		
		if (color == "Blanco"||color == "Negro"||color == "Azul"||color == "Rojo"||color == "Gris") {
			
			
		} else {
			
			this.color = Color.Blanco;
			
		}
		
		
		
	}
	
	public int preciofinal() {
		
		int aumento = preciobase;
		
		switch (consumo) {
			case A:
				aumento += 100;
				break;
			case B:
				aumento += 80;
				break;
			case C:
				aumento += 60;
				break;
			case D:
				aumento += 50;
				break;
			case E:
				aumento += 30;
				break;
			case F:
				aumento += 10;
				break;
		}
		
		if (peso >= 0 && peso <= 19) {
			aumento += 10;
		} else if (peso >= 20 && peso <= 49) {
			aumento += 50;
		} else if (peso >= 50 && peso <= 79) {
			aumento += 80;
		} else {
			aumento += 100;
		}
		
		return aumento;
		
		
	}
	
	
	
	
	
	
	
	
	
}
