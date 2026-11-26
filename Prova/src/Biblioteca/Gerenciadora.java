package Biblioteca;

import java.util.Deque;
import java.util.LinkedList;

public class Gerenciadora {
	
	//declarando atribuos da classe
	private LinkedList<Livro> lista;
	private Deque<String> pilha;
	
	//contrutor	
	public Gerenciadora() {
		lista = new LinkedList<Livro>();
		pilha = new LinkedList<String>();
	}
	
	//metodo de cadastro recebendo informação de titulo e autor
	public void cadastro(String titulo, String autor) {
		Livro livro = new Livro(titulo, autor);
		
		lista.add(livro);
		System.out.println("Livro cadastrado com sucesso!!");
	}
	
	//pesquisar pelo titulo
	private boolean pesquisar(String titulo) {
		for(Livro livroAtual: lista) {
			//comparar strings
			if(livroAtual.getAutor().equals(titulo)) {
				return true;
			}
		}		
		return false;
	}
	
	//metodo devolução do livro utilizando pilha
	public void devolucao(String titulo) {
		//verificar se livro existe
		if(pesquisar(titulo)) {
			//empilhando na pilha de devolução
			pilha.push(titulo);
			System.out.println("livro devolvido");
			return;
		}
		
		System.out.println("livro nao encontrado");
	}
	
	//revertendo ultima devolucao - removendo elemento da pilha
	public void desfazerUltimaDevolucao() {
		//verificando se a pilha esta vazia
		if(!pilha.isEmpty()) {
			String titulo = pilha.pop();
			System.out.println("Última devolução removida: " + titulo);
			return;
		}
		
		System.out.println("Não há devoluções para desfazer");
	}
	
	//metodo para listar livros na lista
	public void listar() {
		String titulo;
		String autor;
		
		if(lista.isEmpty()) {
			System.out.println("Nem um livro cadastrado");
			return;
		}
		
		//percorrendo lista
		for(Livro livroAtual: lista) {
			//pegando titulo
			titulo = livroAtual.getTitulo();
			//pegando autor
			autor = livroAtual.getAutor();
			
			System.out.println("titulo: " + titulo);
			System.out.println("\nautor: " + autor);
			
			/*opcao mais curta
			System.out.println("titulo: " + livroAtual.getTitulo());
			System.out.println("\nautor: " + livroAtual.getAutor());*/
		}
	}
}
