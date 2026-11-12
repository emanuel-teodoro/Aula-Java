package encadeada;

import java.util.Scanner;
import java.util.LinkedList;

public class exeLinkedLista {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		int opcao, numero, n;
		int tam = lista.size();
		
		do {
			System.out.println("1 - inserir no inicio");
			System.out.println("2 - inserir no final");
			System.out.println("3 - insere nume posicao");
			System.out.println("4 - remover de uma posicao");
			System.out.println("5 - imprimir");
			System.out.println("0 - sair");
			
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("informe o valor");
				numero = teclado.nextInt();
				
				lista.addFirst(numero);
				
				System.out.println("numero inserido");
				break;
				
			case 2:
				System.out.println("informe o valor");
				numero = teclado.nextInt();
				
				lista.add(numero);
				break;
				
			case 3:
				System.out.println("informe a posicao de insercao");
				n = teclado.nextInt();
				
				if(tam <= 0 || tam > tam) {
					System.out.println("posicao invalida");
				}else {
					System.out.println("informe o valor");
					numero = teclado.nextInt();
				
					lista.add(n, numero);
				}
				break;
				
			case 4:
				System.out.println("informe posicao de exclusao");
				n = teclado.nextInt();
				
				lista.remove(n);
				break;
			
			case 5:
				System.out.println(lista + " ");
				break;
			
			}
			
		}while (opcao != 0);
	}

}
