public class ProgramacaoOrientadaObjetos {

    public static class Carro {
        private String modelo;
        private String cor;

        public Carro(String modelo, String cor) {
            this.modelo = modelo;
            this.cor = cor;
        }

        public void imprimirDetalhes() {
            System.out.println("Carro: " + modelo + ", Cor: " + cor);
        }
    }

    public static void main(String[] args) {
        // Criar e gerenciar um carro
        Carro carro1 = new Carro("Modelo A", "Vermelho");
        carro1.imprimirDetalhes();

        // Criar e gerenciar outro carro
        Carro carro2 = new Carro("Modelo B", "Azul");
        carro2.imprimirDetalhes();
    }
}