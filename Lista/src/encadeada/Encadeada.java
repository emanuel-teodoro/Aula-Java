package encadeada;

public class Encadeada {
	
	//apontando inicio da lista
	public No inicio;
	//indicando total de elementos na lista
	public int n;
	
	//metodo contrutor para iniciar atributos
	public Encadeada() {
		this.inicio = null;
		this.n = 0;
	}
	
	//adicionando elemento no inicio da lista
	public void addFirst(int elemento) {
		No novo = new No(elemento);
		
		//ponteiro de inicio apontando para o elemento novo
		if(inicio == null) {
			inicio = novo;
		}else {
			//novo elemento apontando para o proximo elemento
			novo.proximo = inicio;
			inicio = novo;
		}
		
		n++;
	}
	
	//adicionando elemento ao final da lista
	public void add (int elemento) {
		
		No novo = new No(elemento);
		
		//caso a lista esteja vazia
		if (inicio == null) {
			inicio = novo;
		//caso ja tenha algum elemento na lista
		}else {
			No atual = inicio;
			
			//percorre lista
			while (atual.proximo != null) {
				atual = atual.proximo;
			}
			
			atual.proximo = novo;
		}
		
		n++;
	}
	
	public void imprimir() {
		No atual = inicio;
		
		while(atual != null) {
			System.out.print(atual.elemento + " ");
			atual = atual.proximo;
		}
	}
}
