package main;

public class Produto {
	private String nome;
	private double preco;
	private static int totalProduto = 0; //contador
	
	//metodo construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.totalProduto = totalProduto +1;//incrementa com base na quantidade de produtos cadastrados
	}
	
	public void exibirInfo() {
		System.out.println("Produto " + nome + " R$ " + preco);
	}
	
	public static int totalProduto() {
		return totalProduto;
	}
}
