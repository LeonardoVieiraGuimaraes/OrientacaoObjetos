package Estrutural;

public class Paciente {
    // Atributos
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

    // Método para solicitar consulta
    public void solicitarConsulta(Medico medico) {
        System.out.println("O paciente " + this.nome +
                " solicitou uma consulta com o médico " + medico.getNome());
        medico.realizarConsulta(this);
    }
}
