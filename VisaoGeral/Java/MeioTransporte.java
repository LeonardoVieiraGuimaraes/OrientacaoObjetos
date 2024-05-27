// Declaração da classe MeioTransporte
public class MeioTransporte {
    // Atributos privados da classe, para armazenar o tipo e a velocidade do meio de transporte
    private String tipo; 
    private int velocidade; 
    // Método para acelerar o meio de transporte
    public void acelerar(int quantidade) {
        this.velocidade += quantidade;
    }
    // Método getter e setter para os atributos
    public String getTipo() {
        // Retorna o valor atual do tipo
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}