package entity;

//classe pai
public class animal {
	protected String nome;
	protected String raca;
	
	public animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public void fazerSom() {
		System.out.println(nome + " esta fazendo som !!");
	}
}
