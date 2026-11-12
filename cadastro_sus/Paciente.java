package cadastro;

public class Paciente extends Pessoa {
	
	private boolean pcd;
	private boolean gestLacCrian;
	
	public Paciente(int id, String nome, String cpf, int idade, String sexo, boolean pcd, boolean gestLacCrian) {
		super(id, nome, cpf, idade, sexo);
		this.pcd = pcd;
		this.gestLacCrian = gestLacCrian;
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
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		
		if (pcd) {
			System.out.println("Pessoa com deficiencia");
		}
		
		if (gestLacCrian) {
			System.out.println("Gestante/Lactante/Criança de colo");
		}
	}
}
