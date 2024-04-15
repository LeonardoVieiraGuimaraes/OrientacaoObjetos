classDiagram
    class Venda {
        - String nomeCliente
        - String cpfCliente
        - String enderecoEntrega
        - int cep
        - Debito pagamento
        - Produto[] produtos
        - String nomeVendedor
        - double comissaoVendedor
    }


classDiagram
    class Venda {
        - Cliente cliente
        - Endereco endereco
        - Pagamento pagamento
        - Produto[] produtos
        - Vendedor vendedor
    }

    class Cliente
    class Endereco
    class Pagamento
    class Produto
    class Vendedor

    Venda --> Cliente
    Venda --> Endereco
    Venda --> Pagamento
    Venda --> Produto
    Venda --> Vendedor



classDiagram
    class Venda {
        - Cliente cliente
        - Endereco endereco
        - Pagamento pagamento
        - Produto[] produtos
        - Vendedor vendedor
    }

    class Cliente
    class Endereco
    class Pagamento
    class Produto
    class Vendedor
    interface FormaPagamento
    class Debito
    class Cartao
    class Financiamento

    Venda --> Cliente
    Venda --> Endereco
    Venda --> Pagamento
    Venda --> Produto
    Venda --> Vendedor
    Pagamento <|.. Debito
    Pagamento <|.. Cartao 
    Pagamento <|.. Financiamento
