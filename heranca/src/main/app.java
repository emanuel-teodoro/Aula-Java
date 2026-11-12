package main;
import entity.gato;
import entity.cachorro;
import entity.animal;

public class app {

	public static void main(String[] args) {
		//instanciando objetos
		cachorro dog = new cachorro(true, "pililico", "caramelo");
		
		gato cat = new gato(10, "mingau", "persa");
		
		dog.fazerSom();//metodo herdado
		dog.latir();//metodo herdado
		
		cat.fazerSom();//metodo herdado
		cat.miar();//metodo herdado
		
		//instanciando animal novo
		animal cavalo = new animal("josnei", "arabe");
		//metodo da classe animal
		cavalo.fazerSom();
		

	}

}
