package Relacional1;

// Classe que herda de Pessoa e representa um Paciente
class Paciente extends Pessoa {
    private String historicoMedico;

    // Construtor
    public Paciente(String nome, int idade, String historicoMedico) {
        super(nome, idade);
        this.historicoMedico = historicoMedico;
    }

    // Métodos getter e setter
    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}