package Polimorfismo;

// Sobrecarga (Overload)
class Calculadora {
    int adicionar(int a, int b) {
        return a + b;
    }

    double adicionar(double a, double b) {
        return a + b;
    }

    int adicionar(int a, int b, int c) {
        return a + b + c;
    }
}

