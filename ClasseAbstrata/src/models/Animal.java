package models;
//declarando abstract não permite instanciar
public abstract class Animal {
	String nome;
	int idade;
	
	public Animal(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	public void dormir() {
		System.out.println("ZZZ");
	}
	
	//nao usa chaves{} pois ele entende que tem implementação e o abstract não permite implementação
	public abstract void emitirSom();
}
