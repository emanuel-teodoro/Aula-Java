package entity;

//classe filho
//precisa do extend para informar que é uma classe filha
public class cachorro extends animal{
	private boolean correrAtrasDoMotoqueiro;
	
	//metodo construtor
	public cachorro(boolean correrAtrasDoMotoqueiro, String nome, String raca) {
		//passando atributo da classe pai usando super
		super(nome, raca);
		this.correrAtrasDoMotoqueiro = correrAtrasDoMotoqueiro;		
	}
	
	public void latir() {
		System.out.println(nome + " wolf wolf " + correrAtrasDoMotoqueiro);
	}
}
