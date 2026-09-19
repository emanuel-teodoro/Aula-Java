package Main;

public class aluno {
	//atributo
	String nome;
	String email;
	double nota;
	int matricula;
	int telefone;
	
	//metodo construtor
	public aluno(String nome, String email, double nota, int matricula, int telefone) {
		this.nome = nome;
		this.email = email;
		this.nota = nota;
		this.matricula = matricula;
		this.telefone = telefone;
		
	}
	
	//criando metodo para calcular media
	public double media(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	public static void main(String[] args) {
		//inserindo as informações dos alunos
		aluno aluno1 = new aluno("josnei", "josneil@josnei", 5.4, 1234, 123456);
		aluno aluno2 = new aluno("josneia", "josneia@josneia", 8.7, 1234567, 12345);
		aluno aluno3 = new aluno("seila", "seila@seila", 7.9, 12345, 78945);
		
		//inserido as notas dos alunos
		double resultado1 = aluno1.media(5.8, 7.0, 8.0);
		double resultado2 = aluno2.media(2.0, 6.5, 5.4);
		double resultado3 = aluno3.media(6.0, 6.0, 6.0);
		
		//imprimindo a saida
		System.out.println(aluno1);
		System.out.println(resultado1);
		System.out.println(aluno2);
		System.out.println(resultado2);
		System.out.println(aluno3);
		System.out.println(resultado3);
	}

}