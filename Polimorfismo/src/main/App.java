package main;
//importando todas as classes dentro do pacote models
import models.*;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		/*
		//instanciando objetos
		Funcionario f1 = new Funcionario("Zé");
		
		//Funcionario se comporta como gerente -> acessa metodos apenas de funcionario
		Funcionario f2 = new Gerente("Carlos");
		
		Funcionario f3 = new Dev("Albiano");
		
		//se comporta apenas como gerente -> acessa metodos da classe gerente
		Gerente g1 = new Gerente("Ramiro");
		
		Dev d1 = new Dev("Eu");
		
		
		//get do nome
		System.out.println(g1.getNome());
		System.out.println(f1.getNome());
		System.out.println(f2.getNome());
		System.out.println(f3.getNome());
		System.out.println(d1.getNome());
		
		
		f1.calcularSalario();
		f2.calcularSalario();
		f3.calcularSalario();
		g1.calcularSalario();
		d1.calcularSalario();*/
		
		//input do teclado
		Scanner teclado = new Scanner(System.in);
		
		//criando array lista das classes
		ArrayList<Funcionario> funcionaio = new ArrayList<Funcionario>();
		ArrayList<Gerente> gerente = new ArrayList<Gerente>();
		ArrayList<Dev> dev = new ArrayList<Dev>();
		
		//criando menu		
		int opcao;
		int i;
		
		do {
			System.out.println("1 - Cadastrar Funcionario");
			System.out.println("2 - Cadastrar Gerente");
			System.out.println("3 - Cadastrar Desenvolvedor");
			System.out.println("4 - Listar funcionarios");
			System.out.println("5 - Listar gerente");
			System.out.println("6 - Listar desenvolvedores");
			System.out.println("7 - Sair");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcao) {
			case 1: {
				System.out.println("Digite o nome");
				//coletando input do teclado
				String nome = teclado.nextLine();
				//adicionando nome ao array
				funcionaio.add(new Funcionario(nome));
				
				break;
			}
			
			case 2: {
				System.out.println("Digite o nome");
				String nome = teclado.nextLine();
				
				gerente.add(new Gerente(nome));
				
				break;
			}
			
			case 3: {
				System.out.println("Digite o nome");
				String nome = teclado.nextLine();
				
				dev.add(new Dev(nome));
				
				break;
			}
			
			case 4: {
				System.out.println("Lista de funcionarios");
				
				//percorrendo o array
				for(i = 0; i < funcionaio.size(); i++) {
					//imprimindo nomes no array
					System.out.println("lista de funcionario");
					System.out.println(funcionaio.get(i).getNome());
					
					System.out.println("lista de gerentes");
					System.out.println(gerente.get(i).getNome());
					
					System.out.println("lista de desenvolvedores");
					System.out.println(dev.get(i).getNome());
				}
				
				break;
			}
			
			case 5: {
				System.out.println("Lista de gerentes");
				
				for(i=0; i< gerente.size(); i++) {
					System.out.println(gerente.get(i).getNome());
				}
				
				break;
			}
			
			case 6: {
				System.out.println("Lista de desenvolvedores");
				
				for(i=0; i< dev.size(); i++) {
					System.out.println(dev.get(i).getNome());
				}
				
				break;
			}
			
			case 7: {
				System.out.println("Encerrando");
				break;
			}
			
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 7);
	}

}
