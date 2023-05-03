package actividad5;

import java.util.Scanner;

import actividad4.Lavadora;

public class Main {

	public static void main(String[] args) {
		
		int elección;
		
		int nlado;
		
		double lado1;
		
		double lado2;
		
		double lado3;
		
		
		Scanner ma = new Scanner(System.in);
		
		Polígono array[] = new Polígono [5]; 
		
		for (int i = 0; i<array.length;i++) {
		
		System.out.println("[1] Introducir triángulo");
		System.out.println("[2] Introducir rectángulo");
		System.out.println("[3] Mostrar contenido del array");
		
		elección = ma.nextInt(); 
			
		switch (elección) {
		case 1:
			System.out.println("Introduce la cantidad de lados, y la medida de estos");
			
			nlado = ma.nextInt();
			
			lado1 = ma.nextDouble();
			
			lado2 = ma.nextDouble();
			
			lado3 = ma.nextDouble();
			
			array [i] = new Triangulo(nlado,lado1,lado2,lado3);
			break;
		case 2:
			System.out.println("Introduce la cantidad de lados, y la medida de estos");
			
			nlado = ma.nextInt();
			
			lado1 = ma.nextDouble();
			
			lado2 = ma.nextDouble();
			
			array [i] = new Rectangulo(nlado,lado1,lado2);
			break;
		case 3: 
			
			break;
		
			}
		}
		
		ma.close();
	}

}
