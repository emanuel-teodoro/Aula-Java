package ifelse;
import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe nota: ");
		double nota = scan.nextDouble();
		
		if(nota >= 7) {
			System.out.println("aprovado!!");
		}else {
			System.out.println("reprovado!!");
		}
		
		scan.close();

	}

}
