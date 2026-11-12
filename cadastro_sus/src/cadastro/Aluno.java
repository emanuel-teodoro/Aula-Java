package cadastro;

public class Aluno {
	//metodo construtor
	private int Matricula;
	private String Nome;
	private String Curso;
	
	//declarando atributos
	public Aluno(int Matricula, String Nome, String Curso) {
		this.Matricula = Matricula;
		this.Nome = Nome;
		this.Curso = Curso;
	}
	
	//metodo get para consultar valor de atributos
	public int getMatricula() {
		return Matricula;
	}
	
	//metodo get para consultar valor de atributos
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	//metodo get para consultar valor de atributos
	public String getCurso() {
		return Curso;
	}
	
	public void exibirdados() {
		System.out.println("Numero de matricula: " + Matricula);
		System.out.println("Nome: " + Nome);
		System.out.println("Disciplina: " + Curso + "\n");
	}
	
}
