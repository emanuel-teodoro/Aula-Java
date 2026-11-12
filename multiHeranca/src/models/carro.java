package models;

public class carro extends veiculo{
	private int numPortas;
	
	public carro(String placa, String chasis, String cor, int ano, int numPortas) {
		super(placa, chasis, cor, ano);
		this.numPortas = numPortas;
	}
	
	public void exibirDetalhes() {
		System.out.println("o numero de porta " + numPortas);
	}
}
