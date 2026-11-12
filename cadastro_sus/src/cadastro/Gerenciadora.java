package cadastro;

import java.util.ArrayList;

public class Gerenciadora {
	
	private ArrayList<Aluno> listaAluno;
	private int Matricula;
//=============CADASTRO==============================================
	//meodo construtor
	public Gerenciadora() {
		//instaciar(alocando espaço de memoria)
		listaAluno = new ArrayList<Aluno>();
		Matricula = 1;
	}
	//utilizando CRUD e passando nome e disciplina por parametro
	public int cadastroAluno(String Nome, String Curso) {
		//chamando metodo construtor
		Aluno aluno = new Aluno(Matricula, Nome, Curso);
		//preenchendo a lista
		listaAluno.add(aluno);
		
		Matricula++;
		
		return aluno.getMatricula();
	}
	
//=============LISTAR==============================================
	
	public void listarAluno() {
		//usando for each
		for(Aluno alunoAtual: listaAluno) {
			alunoAtual.exibirdados();
		}
	}
	
	//pesquisando pelo numero dde matricula do aluno.
	public void pesquisarMatricula(int num) {
		
		boolean encontrou = false;
		
		for(Aluno alunoAtual: listaAluno) {
			if (alunoAtual.getMatricula() == num) {
				alunoAtual.exibirdados();
				encontrou = true;
				return;//ou break
			}
		}
		
		if (!encontrou) {
			System.out.println("Aluno nao encontrado\n");
		}
		
	}
	
	//pesquisando pelo nome do aluno
	public void pesquisarNome(String nome) {
		boolean encontrou = false;
		
		for(Aluno alunoAtual: listaAluno) {
			
			//comparando strings
			//String aux = alunoAtual.getNome();
			//aux.equals(nome);//equals retorna true ou false
			
			//utilizando o if par comparar valores de string
			if(alunoAtual.getNome().equals(nome)) {
				alunoAtual.exibirdados();
				encontrou = true;
				return;
			}
		}
		
		if(!encontrou) {
			System.out.println("aluno nao encontrado\n");
		}
	}
	
	public void removerAluno(int matricula) {
		int i;
		
		for(i=0; i<listaAluno.size(); i++) {
			if(listaAluno.get(i).getMatricula() == matricula) {
				listaAluno.remove(i);
				System.out.println("Aluno removido!!!");
				return;
			}
			
		}
		System.out.println("falha na operacao!!");
	}
	
	public void atualizar(int matricula, String nome) {
		
		for(Aluno alunoAtual: listaAluno) {
			if (alunoAtual.getMatricula() == matricula) {
				alunoAtual.setNome(nome);
				System.out.println("Nome atualizado!!!");
				break;//ou return
			}
		}
		System.out.println("Falha na operação");
	}

}