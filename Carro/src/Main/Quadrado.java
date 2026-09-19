package Main;

public class Quadrado {
	//atributo
	double altura;
	double largura;
	
	//função calcular area do quadrado
	public double area(double altura, double largura) {
		return altura * largura;
	}

	public static void main(String[] args) {
		//inserindo informações de altura e quadrado
		Quadrado q1 = new Quadrado();
		q1.altura = 5;
		q1.largura = 8;
		//imprimindo area
		System.out.println("area é: " + q1.area(q1.altura, q1.largura));
	}

}
