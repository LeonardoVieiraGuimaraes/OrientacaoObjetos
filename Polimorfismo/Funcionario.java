package Polimorfismo;
// Sobreposição (Override) e Polimorfismo de Inclusão
class Funcionario extends Pessoa {
    @Override
    void apresentar() {
        System.out.println("Sou um funcionário.");
    }

    @Override
    void trabalhar() {
        System.out.println("Estou trabalhando como um funcionário.");
    }
}