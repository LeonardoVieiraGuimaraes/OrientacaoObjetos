public class MainMedicoPaciente {
    public static void main(String[] args) {
    // Criando um médico
    Medico medico = new Medico("Dr. João", "Cardiologia");

    // Criando um paciente
    Paciente paciente = new Paciente("Maria", 30);

    // Paciente solicita uma consulta com o médico
    System.out.println(paciente.solicitarConsulta(medico));

    // Médico realiza a consulta com o paciente
    System.out.println(medico.realizarConsulta(paciente.getNome()));
    }
}