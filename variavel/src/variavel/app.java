

package variavel;

public class app {

	public static void main(String[] args) {
		//variaveis
		
		int idade = 35;
		String nome = "lucas";
		
		System.out.println("meu nome: " + nome);
		System.out.println("minha idade: " + idade);
		
		//tipos inteiros
		//byte tamanho maximo na memoria 8bits -128 ate +127
		byte numero1 = 60;
		//short tamanho maximo 16bits -32.768 ate +32.767
		short numero2 = -32768;
		//int tamanho maximo 32bits mais ou menos 2 trilhoes
		int numero3 = 2000000000;
		//long tamanho maximo 64bits uma cacetada de numeros
		long numero4 = 1900000000000000000l;
		
		System.out.println(numero1 + "\n" + numero2 + "\n" + numero3 + "\n" + numero4 + "\n");
		
		//DECIMAIS
		//float tamanho maximo 32bits
		float numero5 = 4.561f;
		//double tamanho maximo 64bits
		double numero6 = 2.13235645;
		System.out.println(numero5 + "\n" + numero6 + "\n");
		
		//LITERAIS
		//char unico caractere independe se é numero/letra/especial
		char letra1 = 'a';
		char letra2 = '#';
		//string multiplos caracteres
		String frase1 = "hello wordl!!";
		
		//BOOLEANO
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		//final - reservada para definir variavel como constante
		

		
	}

}
