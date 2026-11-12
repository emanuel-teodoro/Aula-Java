package models;
//classe pai
public class Funcionario {
	protected String nome;
	
	//metodo constructor
	public Funcionario(String nome) {
		this.nome = nome;
	}
	//metodo get
	public String getNome() {
		return nome;
	}
	
	//metodo exebir informação
	public void calcularSalario() {
		System.out.println("Calcular salario de funcionario");
	}
}
