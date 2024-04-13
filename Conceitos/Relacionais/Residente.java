package Relacionais;

// Classe Residente que herda de Funcionario e implementa Medico
public class Residente extends Funcionario implements Medico {
    private String especialidade;

    public Residente(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo);
        this.especialidade = especialidade;
    }

    @Override
    public void realizarProcedimento() {
        // implementação do procedimento
    }

    // getters e setters
}