package fila;

public class Fila {
	private No inicio;
	private No fim;
	//numero de elementos da fila
	private int n;
	
	//construtor
	public Fila() {
		this.inicio = null;
		this.fim = null;
		this.n = 0;
	}
	
	//inserir na fila
	public void enqueue(int elemento) {
		//criando novo no
		No novo = new No(elemento);
		
		//inicio e fim apontando para o primieiro elemento cadastrado
		if(inicio == null && fim == null) {
			inicio = novo;
			fim = novo;
		} else {
			//inserindo novo no
			fim.proximo = novo;//ponteiro fim aponta para proximo
			fim = novo;
		}
		//incremento total de elementos na fila
		n++;
	}
	
	//removendo da fila
	public int dequeue() {
		int elemento = inicio.elemento;
		
		//acessando primeiro no da fila
		inicio = inicio.proximo;
				
		if(inicio == null) {
			fim = null;
		}
		
		n--;
		
		return elemento;
	}
	
	//conferindo total de elementos da fila
	public int size() {
		return n;
	}
	
	//conferindo se fila esta vazia usando boolean
	/*public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}
		return false;
	}*/
	
	//imprimindo fila
	public void imprimir() {
		No atual = inicio;
		
		while(atual != null) {
			System.out.print(atual.elemento + " ");
			atual = atual.proximo;
		}
	}
}
