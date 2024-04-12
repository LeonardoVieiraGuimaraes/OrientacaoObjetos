package Conceitos.Relacionais;

// Classe base Médico
class Medico {
    private String nome;

    // Construtor
    public Medico(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void realizarProcedimento() {
        System.out.println("Realizando uma ação Clinica de um médico...");
    }
}

// Subclasse Anestesista
class Anestesista extends Medico {
    public Anestesista(String nome) {
        super(nome);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void realizarProcedimento() {
        System.out.println("Aplicando uma injeção anestésica...");
    }
}

// Subclasse Obstetra
class Obstetra extends Medico {
    public Obstetra(String nome) {
        super(nome);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void realizarProcedimento() {
        System.out.println("Preparando e retirando o bebê durante o parto...");
    }
}

// Subclasse Pediatra
class Pediatra extends Medico {
    public Pediatra(String nome) {
        super(nome);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void realizarProcedimento() {
        System.out.println("Verificando a saúde do recém-nascido...");
    }
}
