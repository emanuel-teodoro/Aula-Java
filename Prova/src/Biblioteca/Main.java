package Biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//estanciando objeto da classe gerenciadora
		Gerenciadora gerenciadora = new Gerenciadora();
		
		String titulo, autor;
		int op = 0;
		
		do {
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Registrar devolução");
			System.out.println("3 - Desfazer última devolução");
			System.out.println("4 - Exibir livros cadastrados");
			System.out.println("0 - sair");
			
			op = Integer.parseInt(teclado.nextLine());
			
			switch (op) {
			
			case 0:
				
				break;
			
			case 1:
				System.out.println("entre com nome do livro ");
				titulo = teclado.nextLine();
				
				System.out.println("entre com nome do autor do livro ");
				autor = teclado.nextLine();
				
				//chamando metodo cadastrar na gerenciadora
				gerenciadora.cadastro(titulo, autor);
				
				break;
				
			case 2:
				
				System.out.println("entre com nome do livro ");
				titulo = teclado.nextLine();
				
				gerenciadora.devolucao(titulo);
				break;
				
			case 3:
				gerenciadora.desfazerUltimaDevolucao();
				break;
				
			case 4:
				gerenciadora.listar();
				break;
				
			default:
				System.out.println("opcao invalida!!");
				break;
				
			}
		}while(op != 0);
		
		teclado.close();
	}

}
