package Estrutural;

public class Medico {
    private String nome;
    private String especialidade;

    // Construtor
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Método para realizar consulta
    public void realizarConsulta(Paciente paciente) {
        System.out.println("O médico "
                + this.nome +
                " realizou uma consulta do paciente " +
                paciente.getNome());
    }
}
