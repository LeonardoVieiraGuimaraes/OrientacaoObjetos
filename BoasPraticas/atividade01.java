import java.util.ArrayList;
import java.util.List;

class Autor {
    private String nome;
    private String dataNascimento;
    private String cidadeNascimento;
    private String bibliografia;
    private List<Livro> livrosPublicados;

    // Construtor
    public Autor(String nome, String dataNascimento, String cidadeNascimento, String bibliografia) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cidadeNascimento = cidadeNascimento;
        this.bibliografia = bibliografia;
        this.livrosPublicados = new ArrayList<>();
    }

    // Métodos getters e setters
    // ...
}

class Livro {
    private String titulo;
    private Autor autor;
    private String dataPublicacao;
    private String editora;

    // Construtor
    public Livro(String titulo, Autor autor, String dataPublicacao, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
    }

    // Métodos getters e setters
    // ...
}
