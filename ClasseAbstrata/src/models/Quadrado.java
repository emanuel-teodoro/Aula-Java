package models;

//EXER - implementar metodo desenhar e calcular area passando como parametro

//Declara a classe Quadrado que herda de Forma
public class Quadrado extends Forma {
	
	// Atributo privado que armazena o lado
	private double lado;
	
	// Construtor que recebe o lado como parâmetro
	public Quadrado(double lado) {
		// Armazena o valor recebido no atributo da classe
		this.lado = lado;
	}
	
	// Sobrescreve o método desenhar da classe Forma
	@Override
	public void desenhar() {
		// Exibe a representação de um quadrado
		System.out.println("_____");
		System.out.println("|    |");
		System.out.println("|    |");
		System.out.println("|    |");
		System.out.println("|____|");
	}
	
	// Sobrescreve o método calculoArea da classe Forma
	@Override
	public double calculoArea() {
		// Calcula a área multiplicando o lado por ele mesmo
		double area = lado * lado;
		// Retorna o resultado do cálculo
		return area;
	}
}