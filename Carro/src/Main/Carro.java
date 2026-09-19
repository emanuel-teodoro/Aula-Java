package Main;

public class Carro {
	//atributos
	String marca;
	String modelo;
	int ano;
	boolean ligado;
	
	//metodo construtor
	//metodo construtor possui mesmo nome da classe
	public Carro(String marca, String modelo, boolean ligado) { //parametros obrigatorios ao instanciar
		this.marca = marca;
		this.modelo = modelo;
		this.ligado = false;
	}
	
	//metodo prorpio da classe
	void exibirInfo() {
		System.out.println("Meu carro é da marca " + marca + " do modelo " + modelo + " do ano " + ano);
	}

	public static void main(String[] args) {
		
		//instanciando objetos
		Carro batatinha = new Carro("toyota", "yaris GR", false);//dizendo ao programa que o objeto carro é chamado de batatinha
		Carro carro1 = new Carro("honda", "civic SI", true);
		Carro carro2 = new Carro("bmw", "m3 GTR", false);
		
		/* Não necessario mais ao utilizar o metodo constructor
		//atribuindo valores aos objetos
		batatinha.marca = "toyota";
		batatinha.modelo = "yaris GR";
		carro1.marca = "honda";
		carro1.modelo = "civic SI";*/
		
		System.out.println(batatinha);
		batatinha.exibirInfo();
		carro1.exibirInfo();
		carro2.exibirInfo();

	}

}
