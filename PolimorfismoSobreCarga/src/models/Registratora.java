package models;

public class Registratora {
	
	
	//criando metodos overload criando varios metodos e alterando quantidade de parametros
	public void registrarVenda(String produto) {
		System.out.println("Venda registrada " + produto);
	}
	
	public void registrarVenda(String produto, int quantidade) {
		System.out.println("Venda registrada " + produto + quantidade);
	}
	
	public void registrarVenda(String produto, int quantidade, double desconto) {
		System.out.println("Venda registrada " + produto + desconto);
	}
	
	public void informacao(int Crm, String nomeMedico, int dataEmissao, int CPF, String endereco, boolean reterReceita) {
		System.out.println("informação sobre a venda" + Crm + nomeMedico + dataEmissao + CPF + endereco +reterReceita);
	}
}
