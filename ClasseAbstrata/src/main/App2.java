package main;

//Importa a classes
import models.Circulo;
import models.Forma;
import models.Quadrado;

//EXER - chamar metodo que vai chamar metodo desenhar e calcular area do circulo ou quadrado
public class App2 {

	public static void main(String[] args) {
		
		// Cria uma variável do tipo Forma
		Forma forma;
		
		// Cria um círculo com raio 5
		forma = new Circulo(5);
		// Calcula e exibe a área do círculo
		System.out.println(forma.calculoArea());
		
		// Exibe uma linha para separar os resultados
		System.out.println("===========");
		
		// Cria um quadrado com lado 8
		forma = new Quadrado(8);
		// Calcula e exibe a área do quadrado
		System.out.println(forma.calculoArea());
	}

}