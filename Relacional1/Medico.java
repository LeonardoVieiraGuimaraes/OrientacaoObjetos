package Relacional1;

// Classe que herda de Funcionario e representa um Medico
class Medico extends Funcionario {
    private String especialidade;
    // Construtor
    public Medico(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }
    // Métodos getter e setter
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    // Sobrescrita do método polimórfico
    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está atendendo pacientes como médico especializado em " + especialidade + ".");
    }
}
