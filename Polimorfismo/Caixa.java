package Polimorfismo;

// Polimorfismo Paramétrico
class Caixa<T> {
    private T conteudo;

    void adicionar(T conteudo) {
        this.conteudo = conteudo;
    }

    T obter() {
        return conteudo;
    }
}
