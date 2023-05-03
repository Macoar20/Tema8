package actividad4;

public class Main {

	public static void main(String[] args) {
		
		int sumLav = 0;
		int sumTel = 0;
		int sumTotal = 0;
		
		Electrodomestico array[] = new Electrodomestico [10];

		array [0] = new Lavadora(50,"Negro","C",70,40);
		array [1] = new Television(60, "Blanco","E",34,32,true);
		array [2] = new Electrodomestico();
		array [3] = new Television(60, "Blanco","E",34,32,true);
		array [4] = new Electrodomestico(); 
		array [5] = new Television(20, "Blanco","E",34,32,true);
		array [6] = new Lavadora(80,"Negro","C",90,90);
		array [7] = new Electrodomestico();
		array [8] = new Lavadora(20,"Negro","C",20,10);
		array [9] = new Television(30, "Azul","E",34,32,false);
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].preciofinal());
			System.out.println(array[i].getPreciobase());
			
			sumTotal += array[i].preciofinal();
			
			if (array[i] instanceof Lavadora) {
				sumLav += array[i].preciofinal();
			} else if (array[i] instanceof Television) {
				sumTel += array[i].preciofinal();
			}
		}
		
		
		System.out.println("El precio total de las lavadoras es igual a: "+sumLav+" El de las televisiones es igual a: "+sumTel);
		System.out.println("El precio total de todos los electrodomesticos es igual a: "+sumTotal);
	}
	
	

}
