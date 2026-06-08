package hospital;

public class App {

	public static void main(String[] args) {
		Medico medico = new Medico();
		
		medico.setNome("Dr. Cleber");
		medico.setRegistro("CRM-02070");
		medico.setTurno("Noite");
		medico.setEspecialidade("Neurologia");
		
		
		Enfermeiro enfermeiro = new Enfermeiro();
		
		enfermeiro.setNome("Felipe");
		enfermeiro.setRegistro("COREN-12345");
		enfermeiro.setSetor("UTI");
		enfermeiro.setTurno("Manhã");
        
		Consulta C1 = new Consulta();
		C1.setPaciente("Neia");
		C1.setResponsavel(enfermeiro);
		C1.getConsulta();
		
		Consulta C2 = new Consulta();
		C2.setPaciente("Milena");
		C2.setResponsavel(medico);
		C2.getConsulta();
		
	}

}
