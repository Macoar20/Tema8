package actividad3;

public class Noperecedero extends Productos{

	private String tipo;

	public Noperecedero(String nombre, int precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Noperecedero [tipo=" + tipo + "]";
	}
	
	
	
}
