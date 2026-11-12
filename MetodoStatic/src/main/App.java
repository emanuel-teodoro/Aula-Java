package main;

public class App {

	public static void main(String[] args) {
		//instanciando
		Produto p1 = new Produto("notebook", 1000);
		Produto p2 = new Produto("teclado", 500);
		Produto p3 = new Produto("mouse", 20);
		Produto p4 = new Produto("impresora", 800);
		
		p1.exibirInfo();
		p2.exibirInfo();
		p3.exibirInfo();
		p4.exibirInfo();
		
		System.out.println(Produto.totalProduto());
	}

}
