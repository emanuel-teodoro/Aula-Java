package CADASTRO;

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
	
	public void imprime() {
		System.out.println("ID " + this.id);
		System.out.println("nome " + this.nome);
		System.out.println("cpf " + this.cpf);
		System.out.println("idade" + this.idade);
		System.out.println("sexo " + this.sexo);
	}
}
