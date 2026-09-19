package main;
import models.produto;
import models.pessoa;
public class app {

	public static void main(String[] args) {
		produto batatinha = new produto("iphone 12", 2300, 10, 2090.90, "1234567890", true);
		pessoa abc = new pessoa("joao");
		
		System.out.println("Antes da alteração: ");
		batatinha.detalhes();
		
		//alterando preco venda
		batatinha.precoVenda = -210;
		
		System.out.println("depois da alteração: ");
		batatinha.detalhes();
		
		//outra classe mudando o preço de venda
		abc.mudarPrecoCusto(batatinha, -1500);
		System.out.println("outro valor: ");
		batatinha.detalhes();

	}

}