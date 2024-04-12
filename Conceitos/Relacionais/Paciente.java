package Relacionais;

public class Paciente {
    private String nome;
    private int idade;

    // Construtor
    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para solicitar procedimento
    public void solicitarProcedimento(Medico medico) {
        System.out.println("O paciente " + this.nome + " solicitou um procedimento ao médico " + medico.getNome());
        medico.realizarProcedimento();
    }
}