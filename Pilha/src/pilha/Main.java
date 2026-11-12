package pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		int elemento;
		
		pilha.push(5);
		pilha.push(2);
		pilha.push(8);
		
		pilha.imprimir();
		
		//verificando se a pilha esta vazia
		if(!pilha.isEmpty()) {
			elemento = pilha.pop();
			System.out.println("\nSaiu da pilha: " + elemento);
		}		
		
		pilha.imprimir();
	}

}
