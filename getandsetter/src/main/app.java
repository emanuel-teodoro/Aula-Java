package main;
import model.bicicleta;

public class app {

	public static void main(String[] args) {
		bicicleta b1 = new bicicleta("plastico", 22, "caloi", "aluminio", "chinelo", "azul", "oleo");
		
		b1.detalhes();
		
		//b1.cor = "amarelo"; não funciona pois  classe é privada
		b1.setCor("Amarelo");
		b1.getCor();
		
		System.out.println("Cor alterada");
		b1.detalhes();

	}

}
