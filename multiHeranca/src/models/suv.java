package models;

//classe filha de carro
public class suv extends carro{
	private boolean tracao4x4;
	
	public suv(String placa, String chasis, String cor, int ano, int numPortas, boolean tracao4x4) {
		super(placa, chasis, cor, ano, numPortas);
		this.tracao4x4 = tracao4x4;
	}
	
	public void ativar4X4() {
		if(tracao4x4) {
			System.out.println("Moto 4x4 ativado");
		}else {
			System.out.println("Esse SUV é de shopping");
		}
	}
}
