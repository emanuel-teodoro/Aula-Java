package scanner;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("informe o valor 1 ");
		int valor1 = leitura.nextInt();
		
		System.out.println("informe o valor 2 ");
		int valor2 = leitura.nextInt();
		
		int soma = valor1 + valor2;
		int multiplicacao = soma * valor1;
		int media = (valor1 + valor2)/2;
		
		System.out.println("o resultado a soma: " + soma + " o resultado da multiplicacao: " + multiplicacao + " a media: " + media);
		
		
		leitura.close();

	}

}
