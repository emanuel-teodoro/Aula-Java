package main;
import models.Registratora;

public class Main {

	public static void main(String[] args) {
		Registratora caixa = new Registratora();
		
		caixa.registrarVenda("dipirona ");
		caixa.registrarVenda("remedio ", 2);
		caixa.registrarVenda("outro remedio ", 3, 4.5);
	}

}
