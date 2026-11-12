package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaExe {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Queue<Integer> fila = new LinkedList<Integer>();
		
		int op = 0;
		int elemento;
		
		do {
			System.out.println("1 - inserir");
			System.out.println("2 - remover");
			System.out.println("3 - imprimir");
			System.out.println("4 - sair");
			//coletar input do teclado
			op = Integer.parseInt(teclado.nextLine());
			
			switch (op) {
			case 1:
				System.out.println("informe o valor");
				//recebendo input do teclado
				elemento = Integer.parseInt(teclado.nextLine());
				
				//fila nao tem metodo enquen e dequeue é add mesmo
				fila.add(elemento);
				System.out.println("elemento adicionado");
				break;
				
			case 2:
				//verificar se fila esta vazia
				if (!fila.isEmpty()) {
					//removendo elemento
					elemento = fila.remove();
					System.out.println("elemento removido " + elemento);
				}else {
					System.out.println("fila vazia");
				}
				
				break;
				
			case 3:
				System.out.println(fila);
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("opcao invalida");
				break;
			}
			//fim estetico
			System.out.println();
		}while(op != 4);

	}

}
