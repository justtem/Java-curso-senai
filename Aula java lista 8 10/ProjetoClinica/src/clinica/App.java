package clinica;

public class App {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		Medico medico = new Medico();
		
		paciente.setnome("Tião");
		paciente.setidade(83);
		paciente.setPeso(60.6);
		
		medico.setnome("Roeberto carlos");
		medico.setEspecialidade("Ortopedista");
		medico.setvalorConsulta(199.98);
		
		System.out.println("=== Ficha do paciente ===");
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Idade: " + paciente.getIdade());
		System.out.println("Peso: " + paciente.getPeso());
		
		System.out.println(" ");
		
		System.out.println("=== Ficha do Medico ===");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Especialidade: " + medico.getEspecialidade());
		System.out.println("Valor da consulta: " + medico.getValorConsulta());

	}

}
