package testeJAR;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Vamos calcular a media!!");
		System.out.println("Informe o valor 1: ");
		double num1 = leitor.nextDouble();
		
		System.out.println("Informe o valor 2: ");
		double num2 = leitor.nextDouble();
		
		System.out.println("Informe o valor 3: ");
		double num3 = leitor.nextDouble();
		
		double media = (num1 + num2 + num3)/3;
		System.out.println("A media é: " + media);
		leitor.close();
	}

}
