package fila;

public class No {
	public int elemento;
	public No proximo;//autoreferenciamento
	
	//construtor
	public No(int elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}
}
