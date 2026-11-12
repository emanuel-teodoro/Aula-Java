package ordenacao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, n, vetor[];
		
		Scanner teclado = new Scanner(System.in);
		
		//alocando tamanho de memoria para o vetor
		System.out.println("informa tamanho do vetor");
		n = teclado.nextInt();
		vetor = new int[n];
		
		//preenchendo vetor
		System.out.println("informe valores do vetor");
		for(i=0; i<n; i++) {
			vetor[i] = teclado.nextInt();
		}
		
		Ordenacao ordena = new Ordenacao(vetor, n);
		
		//ordena.selecao();//ordenacao de selecao
		//ordena.insercao();//ordenacao de insercao
		//ordena.bolha();//ordenacao de bolha
		
		ordena.quicksort(0, n-1);//ordenação quicksort necessario declarar inicio e fim utiliza n-1 por conta do indice
		
		ordena.imprimir();
	}

}
