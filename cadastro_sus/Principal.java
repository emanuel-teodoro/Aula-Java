package cadastro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		GerenciadorPacientes gerenciador = new GerenciadorPacientes();
		
		int op = 0;
		int aux;
		
		do {
			System.out.println("cadastro paciente\n");
			System.out.println("1 - cadastro paciente\n");
			System.out.println("2 - listar paciente\n");
			System.out.println("3 - gerar fila de etendimento\n");
			
			op = Integer.parseInt(teclado.nextLine());
					
			switch (op) {
			
				case 1:
					System.out.print("nome: ");
					String nome = teclado.nextLine();
					
					System.out.print("idade: ");
					int idade = Integer.parseInt(teclado.nextLine());
					
					System.out.print("cpf: ");
					String cpf = teclado.nextLine();
					
					System.out.print("sexo 1-masculino 2-feminino: ");
					aux = Integer.parseInt(teclado.nextLine());
					
					String sexo;
					if(aux == 1) {
						sexo = "masculino";
					}else if(aux == 2) {
						sexo = "feminino";
					}else {
						sexo = "outro";
					}
					
					System.out.print("PCD 1-SIM 2-NAO: ");
					aux = Integer.parseInt(teclado.nextLine());
					
					boolean pcd = false;
					if(aux == 1) {
						pcd = true;
					}
					
					System.out.print("gestante 1-SIM 2-NAO: ");
					aux = Integer.parseInt(teclado.nextLine());
					
					boolean gestLacCrian = false;
					if(aux == 1) {
						gestLacCrian = true;
					}
					
					gerenciador.cadastrarPaciente(nome, cpf, idade, sexo, pcd, gestLacCrian);
					System.out.println("paciente cadastrado\n");
					
					break;
					
				case 2:
					gerenciador.listarPacientes();
					break;
					
				case 3:
					gerenciador.gerarFilaAtendimento();
					break;
					
				default:
					System.out.println("opcao invalida!!");
					break;
			}
			
			
		} while (op != 3);

	}

}
