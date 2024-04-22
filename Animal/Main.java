
public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerBarulho(); // Imprime "Au au!"
        meuGato.fazerBarulho(); // Imprime "Miau!"
    }
}