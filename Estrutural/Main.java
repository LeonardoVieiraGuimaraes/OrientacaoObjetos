package Estrutural;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância da classe Medico
        Medico medico = new Medico("Dr. João", "Cardiologista");

        // Cria uma instância da classe Paciente
        Paciente paciente = new Paciente("Maria", 30);

        // Paciente solicita uma consulta ao médico
        paciente.solicitarConsulta(medico);
    }
}