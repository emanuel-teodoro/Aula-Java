package fila;

import java.util.LinkedList;
import java.util.Queue;

public class PrincipalQueue {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		int elemento;
		
		fila.add(5);
		fila.add(8);
		
		System.out.println(fila);
		
		elemento = fila.remove();
		System.out.println("saiu da fila " + elemento);
		
		if(!fila.isEmpty()) {
			elemento = fila.remove();
			System.out.println("\nSaiu da fila " + elemento);
		}else {
			System.out.println("\nfila vazia");
		}
	}

}