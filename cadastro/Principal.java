package cadastro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		GerenciadorPacientes gerenciador = new GerenciadorPacientes();
		
		int op = 0;
		int aux;
		
		do {
			System.out.println("======= CADASTRO PACIENTE - SUS =======");
			System.out.println("1 - Cadastrar paciente");
			System.out.println("2 - Listar pacientes");
			System.out.println("3 - Gerar fila atendimento");
			op = Integer.parseInt(teclado.nextLine());
			
			switch (op) {
				case 1:
					System.out.print("Nome: ");
					String nome = teclado.nextLine();
					System.out.print("Idade: ");
					int idade = Integer.parseInt(teclado.nextLine());
					System.out.print("CPF: ");
					String cpf = teclado.nextLine();
					System.out.print("Sexo (1 - Feminino; 2 - Masculino; 3 - Outro): ");
					aux = Integer.parseInt(teclado.nextLine());
					
					String sexo;
					if (aux == 1) {
						sexo = "Feminino";
					}
					else if (aux == 2) {
						sexo = "Masculino";
					}
					else {
						sexo = "Outro";
					}
					
					System.out.print("Possui deficiencia (1 - Sim; 2 - Não): ");
					aux = Integer.parseInt(teclado.nextLine());
					
					boolean pcd = false;
					if (aux == 1) {
						pcd = true;
					}
					
					System.out.print("Gestante, Lactante ou Criança de colo (1 - Sim; 2 - Não): ");
					aux = Integer.parseInt(teclado.nextLine());
					
					boolean gestLacCrian = false;
					if (aux == 1) {
						gestLacCrian = true;
					}
					
					gerenciador.cadastrarPaciente(nome, cpf, idade, sexo, pcd, gestLacCrian);
					System.out.println("Paciente cadastrado.\n");
					break;
				case 2:
					gerenciador.listarPacientes();
					break;
				case 3:
					gerenciador.gerarFilaAtendimento();
					break;
				default:
					System.out.println("Opção invalida.\n");
					break;	
			}
		} while (op != 3);
	}
}