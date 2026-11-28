package models;

public class Cachorro extends Animal{
	
	int faro;
	
	
	public Cachorro(String nome, int idade, int faro) {
		super(nome, idade);
		this.faro = faro;
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("wolf wolf");
	}
}
