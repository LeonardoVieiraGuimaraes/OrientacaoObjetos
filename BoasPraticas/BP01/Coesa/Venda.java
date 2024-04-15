//Java
public class Venda {
    private Cliente cliente;
    private Endereco endereco;
    private Debito pagamento;
    private Produto[] produtos;
    private Vendedor vendedor;

    public Venda(Cliente cliente, Endereco endereco, Debito pagamento, Produto[] produtos, Vendedor vendedor) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.pagamento = pagamento;
        this.produtos = produtos;
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Debito getPagamento() {
        return pagamento;
    }

    public void setPagamento(Debito pagamento) {
        this.pagamento = pagamento;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

}