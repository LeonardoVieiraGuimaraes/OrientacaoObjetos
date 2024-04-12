// Classe Autor representa o conceito de um autor de livro (Abstração)
class Autor {
    // Encapsulamento é usado aqui para esconder os detalhes de implementação dos
    // atributos de um Autor
    private String nome;
    private String nacionalidade;

    // Construtor da classe Autor
    // Este é um método especial que é chamado quando um objeto é instanciado a
    // partir desta classe
    public Autor(String nome, String nacionalidade) {
        // A palavra-chave 'this' é usada para se referir à instância atual do objeto
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // Métodos getters (Encapsulamento) para acessar os atributos privados da classe
    // Autor
    // Estes são métodos que permitem ler o valor dos atributos privados
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}

// Classe Livro representa o conceito de um livro (Abstração)
// A classe Livro estende a classe Autor, demonstrando o conceito de Herança
// Herança é um princípio que permite que uma classe herde os atributos e
// métodos de outra classe
class Livro extends Autor {
    // Encapsulamento é usado aqui para esconder os detalhes de implementação dos
    // atributos de um Livro
    private String titulo;
    private int numeroPaginas;

    // Construtor da classe Livro
    // Este é um método especial que é chamado quando um objeto é instanciado a
    // partir desta classe
    public Livro(String titulo, String nomeAutor, String nacionalidadeAutor, int numeroPaginas) {
        // A palavra-chave 'super' é usada para chamar o construtor da classe pai
        // (Autor)
        super(nomeAutor, nacionalidadeAutor);
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos getters (Encapsulamento) para acessar os atributos privados da classe
    // Livro
    // Estes são métodos que permitem ler o valor dos atributos privados
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}

// Classe Cliente representa o conceito de um cliente de biblioteca (Abstração)
class Cliente {
    // Encapsulamento é usado aqui para esconder os detalhes de implementação dos
    // atributos de um Cliente
    private String nome;
    private String endereco;

    // Construtor da classe Cliente
    // Este é um método especial que é chamado quando um objeto é instanciado a
    // partir desta classe
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos getters (Encapsulamento) para acessar os atributos privados da classe
    // Cliente
    // Estes são métodos que permitem ler o valor dos atributos privados
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}

// Classe Biblioteca representa o conceito de uma biblioteca (Abstração)
// A classe Biblioteca tem uma associação com as classes Livro e Cliente
// (Associação)
// Associação é um princípio que permite que uma classe tenha uma referência a
// outra classe
// Classe Biblioteca representa o conceito de uma biblioteca (Abstração)
class Biblioteca {
    private Livro livro;
    private Cliente cliente;

    public Biblioteca(Livro livro, Cliente cliente) {
        this.livro = livro;
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Método para exibir as informações do livro e do cliente
    public void exibirInformacoes() {
        System.out.println("Livro: " + getLivro().getTitulo());
        System.out.println("Autor: " + getLivro().getNome());
        System.out.println("Nacionalidade do Autor: " + getLivro().getNacionalidade());
        System.out.println("Número de páginas: " + getLivro().getNumeroPaginas());
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Endereço do Cliente: " + getCliente().getEndereco());
    }
}

// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("George Orwell", "Britânico");
        Livro livro = new Livro("1984", autor.getNome(), autor.getNacionalidade(), 328);
        Cliente cliente = new Cliente("João", "Rua Principal, 123");
        Biblioteca biblioteca = new Biblioteca(livro, cliente);

        // Chamar o método para exibir as informações
        biblioteca.exibirInformacoes();
    }
}