package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Funcionario();
        pessoa.apresentar();  // Saída: Sou um funcionário.
        pessoa.trabalhar();  // Saída: Estou trabalhando como um funcionário.

        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.adicionar("Olá, mundo!");
        System.out.println(caixaDeTexto.obter());  // Saída: Olá, mundo!

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.adicionar(1, 2));  // Saída: 3
        System.out.println(calculadora.adicionar(1.0, 2.0));  // Saída: 3.0
        System.out.println(calculadora.adicionar(1, 2, 3));  // Saída: 6
    }
}
