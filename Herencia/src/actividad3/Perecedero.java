package actividad3;

public class Perecedero extends Productos{

	
	private int diasacaducar;

	public Perecedero(String nombre, int precio, int diasacaducar) {
		super(nombre, precio);
		this.diasacaducar = diasacaducar;
	}

	public int getDiasacaducar() {
		return diasacaducar;
	}

	public void setDiasacaducar(int diasacaducar) {
		this.diasacaducar = diasacaducar;
	}

	@Override
	public String toString() {
		return "Perecedero [diasacaducar=" + diasacaducar + "]";
	}

	@Override
	double calcular(int cantidad) {
		
		if (diasacaducar == 1) {
			
			return super.calcular(cantidad)*0.25;
			
		} else if (diasacaducar == 2) {
			
			return super.calcular(cantidad)*0.33;
			
		} else if (diasacaducar == 3) {
			
			return super.calcular(cantidad)*0.5;
			
		} else {
			
			return super.calcular(cantidad);
			
		}
	}
	
	
	
}
