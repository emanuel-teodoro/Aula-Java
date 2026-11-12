package encadeada;
//usando biblioteca lista encadeada mas não tem imprimir
import java.util.LinkedList;

public class mainLinked {
	
	public class Main {

		public static void main(String[] args) {
			
			//criando lista
			LinkedList<Integer> lista = new LinkedList<Integer>();
			
			//adicionando ao inicio
			lista.addFirst(5);
			lista.addFirst(8);
			//adicionando ao final
			lista.add(2);			
			//usando for each para imprimir
			for (Integer atual: lista) {
				System.out.print(atual + " ");
			}
		}
	}
}
