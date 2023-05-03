package socios;

public class Socio{

	protected int id;
	
	protected String nombre;
	
	protected int edad;

	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Socio de id=" + id + ", nombre=" + nombre + ", edad=" + edad;
	}
	
	
	
	
	
	
	
	
	
}
