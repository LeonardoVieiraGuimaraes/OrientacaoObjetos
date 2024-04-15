package BP01.NaoCoesa;

// Java
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Debito
        Debito debito = new Debito();
        // Criação de um array de objetos da classe Produto
        Produto[] produtos = new Produto[10];

        // Criação de um objeto da classe Venda
        Venda venda = new Venda("João", "123.456.789-00", "Rua das Flores, 123", 12345678, debito, produtos, "Maria",
                0.05);

        // Aqui você pode adicionar o código para manipular o objeto venda
    }
}