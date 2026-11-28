package models;

//EXER - implementar metodo desenhar e calcular area passando como parametro

//Declara a classe Circulo que herda de Forma
public class Circulo extends Forma {
	
	// Atributo privado que armazena o raio
	private double raio;
	
	// Construtor que recebe o raio como parâmetro
	public Circulo(double raio) {
		// Armazena o valor recebido no atributo da classe
		this.raio = raio;
	}
	
	// Sobrescreve o método desenhar da classe Forma
	@Override
	public void desenhar() {
		System.out.println("O");
	}
	
	// Sobrescreve o método calculoArea da classe Forma
	@Override
	public double calculoArea() {
		// Calcula a área utilizando o raio
		double area = 3.14159 * (raio * raio);
		// Retorna o resultado do cálculo
		return area;
	}
}