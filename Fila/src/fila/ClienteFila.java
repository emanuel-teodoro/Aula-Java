package fila;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class ClienteFila {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		int op = 0;
		String elemento;
		
		do {
			System.out.println("1 - adicionar cliente na fila");
			System.out.println("2 - atender cliente");
			System.out.println("3 - exibir clientes na fila");
			System.out.println("0 - sair");
			
			op = Integer.parseInt(teclado.nextLine());
			
			switch (op) {
			case 1:
				System.out.println("entre com nome do cliente ");
				elemento = teclado.nextLine();
				
				fila.add(elemento);
				break;
				
			case 2:
				if(!fila.isEmpty()) {
					elemento = fila.remove();
					System.out.println("atendendo " + elemento);
				}else {
					System.out.println("Fila vazia! nem um cliente para atender");
				}
				break;
				
			case 3:
				if(!fila.isEmpty()) {
					System.out.println(fila);
				}else {
					System.out.println("Fila vazia! nem um cliente para atender");
				}
				break;
			}
		}while (op != 0);
	}

}
