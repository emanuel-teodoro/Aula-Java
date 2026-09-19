package model;

public class bicicleta {
	//atributos            (definindo regra de negocios)
	private String guidao; //get e set
	private int aro; // get
	private String banco; // get e set
	private String marca; // get
	private String pedal; // get e set
	private String freio; // get
	private String cor; // get e set 
	private String corrente; // get
	
	public bicicleta(String guidao, int aro, String marca, String pedal, String freio, String cor, String corrente) {
		this.guidao = guidao;
		this.aro = aro;
		this.marca = marca;
		this.pedal = pedal;
		this.freio = freio;
		this.cor = cor;
		this.corrente = corrente;
		
	}
	
	public void detalhes() {
		System.out.println("marca da bicicleta: " + marca + " Cor " + cor);
	}
	/*
	//criando getter e setters
	//getter guidao
	public String getguidao() {
		return guidao;
	}
	//seter guidao
	public void setguidao(String guidao) {
		this.guidao = guidao;
	}*/

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getPedal() {
		return pedal;
	}

	public void setPedal(String pedal) {
		this.pedal = pedal;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAro() {
		return aro;
	}

	public String getMarca() {
		return marca;
	}

	public String getFreio() {
		return freio;
	}

	public String getCorrente() {
		return corrente;
	}
	
	

}
