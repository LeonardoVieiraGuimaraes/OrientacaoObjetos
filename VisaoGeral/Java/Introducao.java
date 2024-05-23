public class Introducao {
    public static void main(String[] args) {
        char[][] imagem = {
            {' ', ' ', ' ', '{', ' ', ' ', ' '},
            {' ', ' ', '/', ' ', '\\', ' ', ' '},
            {' ', '/', ' ', ' ', ' ', '\\', ' '},
            {'{', '-', '-', '-', '-', '-', '}'},
            {' ', '\\', ' ', ' ', ' ', '/', ' '},
            {' ', ' ', '\\', ' ', '/', ' ', ' '},
            {' ', ' ', ' ', '}', ' ', ' ', ' '}
        };

        for (char[] linha : imagem) {
            for (char c : linha) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
} 