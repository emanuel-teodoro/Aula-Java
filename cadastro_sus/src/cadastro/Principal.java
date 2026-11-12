package cadastro;
import java.util.Scanner;

public class Principal {
	
	//FUNÇÃO DO MENU
	public static void menu() {
		System.out.println("======Cadastro de aluno======");
		System.out.println("1 - cadastrar");
		System.out.println("2 - listar");
		System.out.println("3 - pesquisar por matricula");
		System.out.println("4 - pesquisar pelo nome");
		System.out.println("5 - remover");
		System.out.println("6 - atualizar");
		System.out.println("0 - sair");
		System.out.println("=============================");
		
	}

	public static void main(String[] args) {
		//TESTE DO SISTEMA
		//Gerenciadora gerenciadora = new Gerenciadora();
		//cadastrando
		//gerenciadora.cadastroAluno("ana", "ADS");
		//gerenciadora.cadastroAluno("maria", "ADM");
		//imprimindo na tela
		//gerenciadora.listarAluno();
		//pesquisando pelo numero de matricula
		//gerenciadora.pesquisarMatricula(2);
		//pesquisando pelo nome do aluno
		//gerenciadora.pesquisarNome("ana");
		
		//MENU INTERATIVO		
		Scanner teclado = new Scanner(System.in);
		Gerenciadora gerenciadora = new Gerenciadora();
		int op = 0;
		int Matricula;
		String Nome;
		String Curso;
		
		do {
			menu();
			System.out.print("Escolha uma opcao!!\n");
			
			//CONVERTENDO A LEITURA DO TECLADO DE INT PARA STRING
			//String aux = teclado.nextLine();
			//op = Integer.parseInt(Curso);
			
			op = Integer.parseInt(teclado.nextLine());
			
			switch(op) {
			
				case 0:
					break;
					
				case 1:
					System.out.println("informe nome: ");
					Nome = teclado.nextLine();
					System.out.println("informe o curso: ");
					Curso = teclado.nextLine();
					
					Matricula = gerenciadora.cadastroAluno(Nome, Curso);
					System.out.println("Seu numero de matricula: " + Matricula);
					break;
				
				case 2:
					gerenciadora.listarAluno();
					break;
					
				case 3:
					System.out.println("Informe matricula: ");
					Matricula = Integer.parseInt(teclado.nextLine());
					
					gerenciadora.pesquisarMatricula(Matricula);
					break;
					
				case 4:
					System.out.println("informe o nome: ");
					Nome = teclado.nextLine();
					
					gerenciadora.pesquisarNome(Nome);
					break;
					
				case 5:
					System.out.println("Informe a matricula a ser removida");
					Matricula = Integer.parseInt(teclado.nextLine());
					
					gerenciadora.removerAluno(Matricula);
					break;
					
				case 6:
					System.out.println("informe a matricula: ");
					Matricula = Integer.parseInt(teclado.nextLine());
					System.out.println("informe novo nome: ");
					Nome = teclado.nextLine();
					
					gerenciadora.atualizar(Matricula, Nome);
					break;
					
				default:
					System.out.println("Opcao invalida!!!");
					break;
			
			}
			System.out.println();
			
		} while(op != 0);
		
		teclado.close();

	}

}
