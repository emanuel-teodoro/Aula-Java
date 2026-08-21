package ifelse;
import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe nota final: ");
		double nota = scan.nextDouble();
		
		System.out.println("informe percentual de presenca: ");
		int presenca = scan.nextInt();
		
		if(nota >= 7 && presenca >= 75) {
			System.out.println("aprovado!!");
		}else if(nota >= 40 || nota <= 69 && presenca >= 75){
			System.out.println("recuperacao!!");
		}else {
			System.out.println("reprovado!!");
		}
		
		scan.close();

	}

}