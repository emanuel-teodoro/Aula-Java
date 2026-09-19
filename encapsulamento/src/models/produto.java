package models;

public class produto {
//atributos
public String nome;
public int id;
public double precoCusto;
public double precoVenda;
public double margem;
public String validade;
public String codigoBarras;
public String lote;
public boolean ativo;

//metodo construtor
public produto(String nome, double precoVenda, double margem, double precoCusto, String codigoBarras, boolean ativo) {
	
	this.nome = nome;
	this.precoVenda = precoVenda;
	this.precoCusto = precoCusto;
	this.margem = 10;
	this.codigoBarras = codigoBarras;
	this.ativo = ativo;
}

//metodo proprio da classe
public void detalhes() {
	System.out.println("Produto: " + nome + " Preco de venda: " + precoVenda);	
}

}