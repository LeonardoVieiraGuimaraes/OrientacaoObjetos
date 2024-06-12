// Classe Medico
public class Medico {
    // Atributos
    private String nome;
    private String especialidade;
    // Métodos
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
    public String realizarConsulta(String nomePaciente) {
        return "O médico " + this.nome + " realizou uma consulta com o paciente " + nomePaciente;
    }
}

