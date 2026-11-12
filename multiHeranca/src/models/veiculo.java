package models;

public class veiculo {
	//atributos
	protected String placa;
	protected String chasis;
	protected String cor;
	protected int ano;
	
	//metodo construtor
	public veiculo(String placa, String chasis, String cor, int ano) {
		this.placa = placa;
		this.chasis = chasis;
		this.cor = cor;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
