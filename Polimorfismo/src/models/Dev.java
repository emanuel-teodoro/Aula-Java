package models;
//classe filha
public class Dev extends Funcionario {
	
	//metodo construtor
	public Dev(String nome) {
		//puxando NOME da classe pai
		super(nome);
	}
	
	//informação vindo de outra classe e sobre escrevendo
	@Override
	public void calcularSalario() {
		System.out.println("Dev ganha uma coca e uma coxinha!!!");
	}
	
}
