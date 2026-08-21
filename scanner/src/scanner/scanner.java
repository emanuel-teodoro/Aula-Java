package scanner;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner batatinha = new Scanner(System.in);//deu o nome do scanner e quando for usa-lo so chamar pelo nome
		
		System.out.println("digite sua idade: ");
		int idade = batatinha.nextInt();
		
		System.out.println("digite seu nome: ");
		String nome = batatinha.next();
		
		System.out.println("sua idade: " + idade);
		System.out.println("Seu nome: " + nome);
		
		batatinha.close();//fecha o espeço de memoria aberto
	}

}
