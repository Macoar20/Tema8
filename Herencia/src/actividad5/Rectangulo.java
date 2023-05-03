package actividad5;

public class Rectangulo extends Polígono{

	protected double lado1;
	protected double lado2;
	
	
	
	public Rectangulo(int numeroDeLados) {
		super(4);
		// TODO Auto-generated constructor stub
	}



	public Rectangulo(int numeroDeLados, double lado1, double lado2) {
		super(numeroDeLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}



	public double getLado1() {
		return lado1;
	}



	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}



	public double getLado2() {
		return lado2;
	}



	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double area () {
		
		double area = 0;
		
		area = lado1*lado2;
		
		return area;
		
	}



	@Override
	public String toString() {
		return "Se trata de un rectángulo cuya base mide :"+lado1+" y cuya altura mide "+lado2;
	}
	
	
	
}
