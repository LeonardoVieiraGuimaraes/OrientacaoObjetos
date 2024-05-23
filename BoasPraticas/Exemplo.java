public class Exemplo {
    public static void main(String[] args) {
        MinhaClasseFinal objeto = new MinhaClasseFinal();
        objeto.meuMetodo(); // Saída: "Este é o método da classe final."

        Subclasse subObjeto = new Subclasse();
        subObjeto.meuMetodo(); // Saída: "Este é o método sobrescrito da subclasse."
    }
}
