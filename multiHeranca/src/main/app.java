package main;

import models.carro;
import models.suv;

public class app {

	public static void main(String[] args) {
		carro c1 = new carro("ABC-123", "ABC2345", "Azul", 2016,4);
		c1.exibirDetalhes();
		
		suv c2 = new suv("QWE-456", "OIU098", "PRATA", 2026, 2, true);
		c2.exibirDetalhes();//suv herda metodo carro
		c2.ativar4X4();//metodo proprio da classe suv
	}

}
