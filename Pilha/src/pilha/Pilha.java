package pilha;

public class Pilha {
	private No topo;
	private int n;
	
	//construtor
	public Pilha() {
		//topo aponta para null pois pilha esta vazia
		topo = null;
		n = 0;
	}
	
	public int size() {
		//retorna tamanho da pilha
		return this.n;
	}
	
	public boolean isEmpty() {
		//verifica se topo esta vazio
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	//inserindo elemento
	public void push(int elemento) {
		//criando novo no (novo elemento)
		No novo = new No(elemento);
		
		//perguntando se é o primeiro elemento
		if(topo == null) {
			//topo apontando para primeiro elemento
			topo = novo;
		}
		//criando novo no(novo elemento)
		else {
			//novo elemento aponta para elemento anterior
			novo.proximo = topo;
			//topo aponta para novo elemento
			topo = novo;
		}
		
		n++;
	}
	
	//retirar elemento
	public int pop() {
		
		int elemento = topo.elemento;
		
		//apontando para o proximo elemento
		topo = topo.proximo;
		n--;
		
		return elemento;
	}
	
	public void imprimir() {
		No atual = topo;
		
		while(atual != null) {
			System.out.print(atual.elemento + " ");
			atual = atual.proximo;
		}
	}
}
