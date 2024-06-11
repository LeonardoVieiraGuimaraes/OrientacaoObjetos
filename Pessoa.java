public class Pessoa {
    private String atributoPrivado;
    protected int atributoProtegido;
    public int atributoPublico;

    private void metodoPrivado() {
        // implementação do método privado
    }

    protected void metodoProtegido() {
        // implementação do método protegido
    }

    public void metodoPublico() {
        // implementação do método público
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}