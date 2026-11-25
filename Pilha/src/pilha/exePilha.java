package pilha;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class exePilha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//String elemento;
		
		Deque<String> pilha = new LinkedList<String>();
		
		int op = 0;
		String elemento;
		
		do {
			System.out.println("1 - acessar nova pagina");
			System.out.println("2 - voltar pagina");
			System.out.println("0 - sair");
			
			op = Integer.parseInt(teclado.nextLine());
			
			switch(op) {
			
			case 0:
				System.out.println("fechando navegador");
				break;
			
			case 1:
				System.out.println("Informe o site");
				
				elemento = teclado.nextLine();
				
				pilha.push(elemento);
				
				System.out.println("acessando pagina " + elemento);
				break;
				
			case 2:
				if(!pilha.isEmpty()) {
					elemento = pilha.pop();
					
					System.out.println("voltando da pagina " + elemento);
				} else {
					System.out.println("pilha vazia");
				}
				
				break;
				
			default:
				System.out.println("opcao invalida");
				break;
			}
			
		}while(op != 0);
		
		teclado.close();
	}

}