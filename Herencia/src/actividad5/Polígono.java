package actividad5;

public abstract class Polígono {

	int numeroDeLados;
	
	public Polígono(int numeroDeLados) {
		super();
		this.numeroDeLados = numeroDeLados;
	}

	
	
	public int getNumeroDeLados() {
		return numeroDeLados;
	}



	abstract protected double area ();

	@Override
	public String toString() {
		return "El número de lados es igual a: "+ numeroDeLados;
	}
	
	
	
	
}
