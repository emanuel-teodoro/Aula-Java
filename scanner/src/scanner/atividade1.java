package scanner;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner coleta = new Scanner(System.in);
		
		//FAZENDO MANUALMENTE A INSERÇÃO DOS VALORES
		/*System.out.println("informe a nota 1: ");
		int valor = coleta.nextInt();
		
		System.out.println("informe a nota 2: ");
		int valor2 = coleta.nextInt();
		
		System.out.println("informe a nota 3");
		int valor3 = coleta.nextInt();
		
		System.out.println("informe a nota 4: ");
		int valor4 = coleta.nextInt();
		
		System.out.println("informe a nota 5");
		int valor5 = coleta.nextInt();
		
		int media = (valor + valor2 + valor3 + valor4 + valor5)/5;
		
		System.out.println("media das notas: " + media);*/
		
		//============================================================
		//USANDO O FOR
		
		/*int soma = 0;
		System.out.println("informe total de notas: ");
		int totalNotas = coleta.nextInt();
		
		for(int i = 0; i < totalNotas; i++) {
			System.out.println("informe a nota" + i + " ");
			soma += coleta.nextInt();
		}
		
		int media = soma / totalNotas;
		
		System.out.println("media final: " + media);*/
		
		//==================================================================
		//USANDO O DO-WHILE
		
		int soma = 0;
		int contador = 0;
		
		System.out.println("informe total de valores: ");
		int valores = coleta.nextInt();
		
		do {
			System.out.println("informe o valor: ");
			soma += coleta.nextInt();
			
			contador ++;
			
		} while(contador < valores);
		
		int media = soma / valores;
		
		System.out.println("media dos valores: " + media);
		
		coleta.close();

	}

}
