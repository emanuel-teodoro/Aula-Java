package cadastro;

import java.util.LinkedList;
import java.util.Queue;

public class GerenciadorPacientes {
	
	private LinkedList<Paciente> listaPacientes;
	private Queue<Integer> filaAtendimento;
	private int id;
	
	public GerenciadorPacientes() {
		listaPacientes = new LinkedList<Paciente>();
		filaAtendimento = new LinkedList<Integer>();
		id = 1;
	}
	
	public void cadastrarPaciente(String nome, String cpf, int idade, String sexo, boolean pcd, boolean gestLacCrian) {
		
		Paciente paciente = new Paciente(id, nome, cpf, idade, sexo, pcd, gestLacCrian);
		id++;
		
		listaPacientes.add(paciente);
	}
	
	public void listarPacientes() {
		
		if (listaPacientes.isEmpty()) {
			System.out.println("Nao ha pacientes cadastrados.");
			return;
		}
		
		for (Paciente pacienteAtual: listaPacientes) {
			pacienteAtual.exibirDados();
			System.out.println("----------------------");
		}
	}
	
	private boolean isPrioritario(Paciente paciente) {
		
		return (paciente.getIdade() >= 60 || paciente.isPcd() || paciente.isGestLacCrian());
		
	}
	
	public void gerarFilaAtendimento() {
		
		for (Paciente pacienteAtual: listaPacientes) {
			if (isPrioritario(pacienteAtual)) {
				filaAtendimento.add(pacienteAtual.getId());
			}
		}
		
		for (Paciente pacienteAtual: listaPacientes) {
			if (!isPrioritario(pacienteAtual)) {
				filaAtendimento.add(pacienteAtual.getId());
			}
		}
		
		System.out.println(filaAtendimento);	
	}
}
