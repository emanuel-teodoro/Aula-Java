package encadeada;

public class No {
	
	//todo objeto é um ponteiro -> ao menos no java
	public int elemento;
	public No proximo;
	
	//metodo construtor
	public No(int elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}
}
