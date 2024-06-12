package Relacional1;
// Classe principal para executar o exemplo
public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Dr. João", 45, 12000, "Cardiologia");
        Paciente paciente = new Paciente("Carlos", 50, "Histórico de hipertensão");
        Consulta consulta = new Consulta(medico, paciente);

        consulta.realizarProcedimento();

        // Demonstrando polimorfismo
        Funcionario funcionario = new Medico("Dr. Ana", 38, 15000, "Neurologia");
        funcionario.trabalhar();
    }
}