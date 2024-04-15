public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // O método equals é necessário para que o método containsValue do HashMap
    // funcione corretamente
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Aluno aluno = (Aluno) obj;
        return nome.equals(aluno.nome);
    }

    // O método hashCode é necessário para que o método containsValue do HashMap
    // funcione corretamente
    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}