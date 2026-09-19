package models;

public class pessoa {
	public String nome;
	
	public pessoa(String nome) {
		this.nome = nome;
	}
	
	public void exibirNome() {
		System.out.println(nome);
	}
	
	public void mudarPrecoCusto(produto produto, double novoprecoVenda) {
		System.out.println("\nalterar preco produto");
		produto.precoVenda = novoprecoVenda;
	}
	
}
