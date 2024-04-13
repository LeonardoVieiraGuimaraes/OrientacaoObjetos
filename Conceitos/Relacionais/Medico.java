package Relacionais;

// Classe base Médico
class Medico extends Funcionario {
    private String especialidade;

    public Medico(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo);
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void realizarProcedimento() {
        System.out.println("Realizando uma ação Clinica de um médico...");
    }
}

// Subclasse Anestesista
class Anestesista extends Medico {
    public Anestesista(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo, especialidade);
    }

    @Override
    public void realizarProcedimento() {
        System.out.println("Aplicando uma injeção anestésica...");
    }
}

// Subclasse Obstetra
class Obstetra extends Medico {
    public Obstetra(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo, especialidade);
    }

    @Override
    public void realizarProcedimento() {
        System.out.println("Preparando e retirando o bebê durante o parto...");
    }
}

// Subclasse Pediatra
class Pediatra extends Medico {
    public Pediatra(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo, especialidade);
    }

    @Override
    public void realizarProcedimento() {
        System.out.println("Verificando a saúde do recém-nascido...");
    }
}

// Subclasse Residente
class Residente extends Medico {
    public Residente(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo, especialidade);
    }

    @Override
    public void realizarProcedimento() {
        System.out.println("Em Treinamento para realizar procedimentos...");
    }
}