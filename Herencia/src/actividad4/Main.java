package actividad4;

public class Main {

	public static void main(String[] args) {
		
		int sumLav = 0;
		int sumTel = 0;
		int sumTotal = 0;
		
		Electrodomestico array[] = new Electrodomestico [10];

		array [0] = new Lavadora(50,"Negro","C",70,40);
		array [1] = new Television();
		array [2] = new Electrodomestico();
		array [3] = new Television();
		array [4] = new Electrodomestico(); 
		array [5] = new Television();
		array [6] = new Lavadora();
		array [7] = new Electrodomestico();
		array [8] = new Lavadora();
		array [9] = new Television();
		
		
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
