package entity;

//classe filho
//precisa do extend para informar que é uma classe filha
public class gato extends animal{
	private int nivelPreguica;
	
	//metodo construtor
	public gato(int nivelPreguica, String nome, String raca) {
		//passando atributo da classe pai usando super
		super(nome,raca);
	}
	
	public void miar() {
		System.out.println("Meoww meow " + nome);
	}

}
