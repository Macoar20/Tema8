package actividad3;

public class Productos {

	private String nombre;
	private int precio;
	public Productos(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Poductos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	double calcular(int cantidad) {
		
		double precio;
		precio = cantidad * this.precio;
		return precio;
		
	}
	
	
}
