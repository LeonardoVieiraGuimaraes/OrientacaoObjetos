import java.util.Arrays;
import java.util.List;

class Cliente {
    String nome;
    String endereco;

    Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    static class Venda {
        int codigo;
        double valor;

        Venda(int codigo, double valor) {
            this.codigo = codigo;
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria", "Av. B, 456");

        List<Cliente.Venda> vendasCliente1 = Arrays.asList(new Cliente.Venda(1, 100.0), new Cliente.Venda(2, 150.0));
        List<Cliente.Venda> vendasCliente2 = Arrays.asList(new Cliente.Venda(3, 200.0));

        System.out.println("Cliente: " + cliente1.nome);
        vendasCliente1.forEach(venda -> System.out.println("Venda #" + venda.codigo + ": R$" + venda.valor));

        System.out.println("\nCliente: " + cliente2.nome);
        vendasCliente2.forEach(venda -> System.out.println("Venda #" + venda.codigo + ": R$" + venda.valor));
    }
}