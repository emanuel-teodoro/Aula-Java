package fila;

public class Main {

	public static void Main(String[] args) {
		Fila fila = new Fila();
		int elemento;
		
		//inserindo elementos
		fila.enqueue(5);
		fila.enqueue(8);
		
		fila.imprimir();
		
		elemento = fila.dequeue();
		System.out.println("\nSaiu da fila " + elemento);
		
		fila.imprimir();
		
		if(fila.size() > 0) {
			elemento = fila.dequeue();
			System.out.println("\nSaiu da fila " + elemento);
		}else {
			System.out.println("\nfila vazia");
		}
		
		//conferindo se fila esta vazia usando isEmpty
		/*if(!fila.isEmpty()) {
			elemento = fila.dequeue();
			System.out.println("\nSaiu da fila " + elemento);
		}else {
			System.out.println("\nfila vazia");
		}*/
		
		fila.imprimir();
	}

}
