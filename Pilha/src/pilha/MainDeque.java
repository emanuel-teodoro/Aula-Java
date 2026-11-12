package pilha;

import java.util.Deque;
import java.util.LinkedList;

public class MainDeque {

	public static void main(String[] args) {
		
		int elemento;
		
		Deque<Integer> pilha = new LinkedList<Integer>();
		
		pilha.push(5);
		pilha.push(2);
		pilha.push(8);
		
		System.out.println("sua pilha " + pilha);
		
		if(!pilha.isEmpty()) {
			elemento = pilha.pop();
			System.out.println("Saiu da pilha " + elemento);
		}
		
		System.out.println(pilha);
	}

}
