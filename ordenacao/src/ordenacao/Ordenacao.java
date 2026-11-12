package ordenacao;

public class Ordenacao {
	private int vetor[];
	
	private int n;//numero de elementos do vetor
	
	//construtor receber vetor e o n
		public Ordenacao(int vetor[], int n) {
			this.vetor = vetor;
			this.n = n;
		}
		
		//algoritmo de seleção
		public void selecao() {
			int i, j;
			//variavel de menor valor e sua posição
			int menor, pos_menor;
			//variavel auxiliar para troca de posição
			int aux;
			
			for(i=0; i<n-1; i++) {
				//inicio o menor valor pois ainda não foi lido outros valores
				menor = vetor[i];
				//i recebe a posição do menor valor
				pos_menor = i;
				
				
				for(j=i+1; j<n; j++) {
					if(vetor[j] < menor) {
						menor = vetor[j];
						pos_menor = j;
					}
				}
				//auxiliar recebe valor de i
				aux = vetor[i];
				//valor de i passa a ser menor valor
				vetor[i] = vetor[pos_menor];
				//valor auxiliar passa para posição de menor valor
				vetor[pos_menor] = aux;
				
			}
		}
		
		public void insercao() {
			int i, j, copia;
			//i começa na posição 1
			for(i=1; i<n; i++) {
				//copiar o valor para comparação
				copia = vetor[i];
				//j sempre na posição anterioro ao i
				j = i-1;
				
				//comparação ate que j esteja na posição maior ou igual zero
				while(j>=0 && vetor[j] > copia) {
					vetor[j+1] = vetor[j];
					j--;
				}
				//troca o valor na posição j+1 pelo valor copiado para comparação
				vetor[j+1] = copia;
			}
		}
		
		public void bolha() {
			int i, aux; //valor aux = auxiliar para troca
			boolean troca = false; // validar se houve troca
			
			do {
				
				troca = false;//antes de iniciar valida troca como false para executar ao menos uma vez o codigo
				
				for(i=0; i<n-1; i++) {//percorre vetor
					if(vetor[i] > vetor[i+1]) {//compara valores e faz a troca
						aux = vetor[i];//aux recebe valor maior
						vetor[i] = vetor[i+1];//valor menor troca de posição
						vetor[i+1] = aux;//valor maior vai para proxima posição
						troca = true;//valida troca
					}
				}
				
				
			}while (troca);
		}
		
		public void quicksort(int inicio, int fim) {
			int i, j;//i e j definem inicio e fim do vetor
			int pivo;//tipo varia conforme tipo de variavel do vetor
			int aux;//variavel de auxilo para troca
			
			
			i = inicio;//inicio do vetor
			j = fim;//final do vetor
			
			pivo = vetor[(inicio + fim) /2];//calculo para selecionar elemento central do vetor
			
//===================PARTICIONANDO====================================================	
			while(i < j) {//repetir ate o i cruzar com j as posições do vetor
				//incremento de i nas posições do vetor
				while(vetor[i] < pivo) {
					i++;
				}
				//decremento de j nas posições do vetor
				while(vetor[j] > pivo) {
					j--;
				}
				
				//fazendo a troca dos valores se i menor que j
				if(i <= j ) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
					i++;
					j--;
				}
			}
//======================================================================================
			
//==========================RECURSÃO====================================================
			//conferindo necessidade de recursão
			if(inicio < j) {
				quicksort(inicio, j);
			}
			
			if(i < fim) {
				quicksort(i, fim);
			}			
//======================================================================================
			
		}
		
		public void imprimir() {
			int i;
			System.out.println("Vetor ordenado");
			for(i=0;i<n;i++) {
				System.out.print(vetor[i] + " ");
			}
		}
}
