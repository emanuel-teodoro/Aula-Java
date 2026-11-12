package CADASTRO;

public class Paciente extends Pessoa {
	private boolean pcd;
	private boolean gestLacCrian;
	
	public Paciente(int id, String nome, String cpf, int idade, String sexo) {
		super(id,nome,cpf,idade,sexo);
		this.pcd = false;
		this.gestLacCrian = false;
	}

	public boolean isPcd() {
		return pcd;
	}

	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}

	public boolean isGestLacCrian() {
		return gestLacCrian;
	}

	public void setGestLacCrian(boolean gestLacCrian) {
		this.gestLacCrian = gestLacCrian;
	}
	
	//sobreescrita
	@Override
	public void imprime() {
		super.imprime();
		
		if(pcd) {
			System.out.println("PCD " + pcd);
		}
		
		if (gestLacCrian) {
			System.out.println("gestante/Lactante/Crianca " + gestLacCrian);
		}
	}
}
