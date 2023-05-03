package actividad5;

public class Triangulo extends Polígono{

	protected double lado1;
	protected double lado2;
	protected double lado3;


	public Triangulo(int numeroDeLados) {
		super(3);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Triangulo(int numeroDeLados, double lado1, double lado2, double lado3) {
		super(numeroDeLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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



	public double getLado3() {
		return lado3;
	}



	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}



	public double area () {
		
		double area = 0;
		
		area = (lado1+lado2+lado3)/2;
		
		return area;
		
	}



	@Override
	public String toString() {
		return "Se trata de un tríangulo, cuyos lados miden : "+lado1+", "+lado2+"y "+lado3+" respectivamente";
	}
	
	
	
}
