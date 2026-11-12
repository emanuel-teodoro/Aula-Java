package models;
//classe filha
public class Gerente extends Funcionario {
	
	//metodo construtor
	public Gerente(String nome) {
		//puxando NOME da classe pai
		super(nome);
	}
	
	//informação vindo de outra classe e sobre escrevendo
	@Override
	public void calcularSalario() {
		System.out.println("Gerente ganha R$ 18 mil por mes");
	}
	
}
