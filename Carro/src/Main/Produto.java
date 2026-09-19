package Main;

public class Produto {
	
	//atributo
	String nome;
	double preco;
	double quantidade;
	
	//calcular total a pagar
	public double calcular(double preco, double quantidade) {
		return preco * quantidade;
		
	}

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Caneta";
		p1.preco = 2.5;
		p1.quantidade = 3;
		
		Produto p2 = new Produto();
		p2.nome = "Caderno";
		p2.preco = 22.90;
		p2.quantidade = 8;
		
		System.out.println("Total: " + p1.nome + " : " + p1.calcular(p1.preco, p1.quantidade));
		System.out.println("Total: " + p2.nome + " : " + p2.calcular(p2.preco, p2.quantidade));
	}

}