package ConversorTemp;

public class App {

	public static void main(String[] args) {
		double temperatura = 50.5;
		convertertemp t1 = new convertertemp(temperatura);
		
		t1.exibir();
		
		System.out.println(convertertemp.celsiusKelvin(temperatura));

	}

}