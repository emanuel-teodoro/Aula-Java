package cadastro;

public class Pessoa {
	
	private int id;
	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	
	public Pessoa(int id, String nome, String cpf, int idade, String sexo) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo; 
	}
	
	public void exibirDados() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
	}	
}
