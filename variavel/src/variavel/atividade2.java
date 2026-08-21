//declarar e iniciar 3 variaveis
//nome/batimento cardiaco/renda
//batimento = 220 - idade
//renda = batimento * 4

package variavel;

public class atividade2 {

	public static void main(String[] args) {
		int idade = 30;
		int batimento;
		float renda;
		
		batimento = 220 - idade;
		renda = batimento * 4;
		
		System.out.println("Idade: " + idade + "\n" + "batimento cardiaco " + batimento + "\n" + "renda R$" + renda);

	}

}
