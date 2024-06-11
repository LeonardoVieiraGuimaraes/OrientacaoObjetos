package Relacional1;

// Classe que herda de Pessoa e representa um Funcionario
class Funcionario extends Pessoa {
    private double salario;

    // Construtor
    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    // Métodos getter e setter
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método polimórfico
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
    }
}
