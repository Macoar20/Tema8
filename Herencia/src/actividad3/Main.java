package actividad3;

public class Main {

	public static void main(String[] args) {
		
		Productos array[] = new Productos[5];
		
		array [0] = new Noperecedero("Conservas", 7, "latas");
		array [1] = new Perecedero("Queso",1 ,4);
		array [2] = new Perecedero("Cerezas",4 ,2);
		array [3] = new Perecedero("Filete",3 ,1);
		array [4] = new Noperecedero("Sal", 2, "Especias");
		
		System.out.println(array[0].calcular(3));
		System.out.println(array[1].calcular(4));
		System.out.println(array[2].calcular(5));
		System.out.println(array[3].calcular(2));
		System.out.println(array[4].calcular(1));
	}

}
