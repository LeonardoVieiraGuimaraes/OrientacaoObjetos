package Relacionais.Polimorfismo;

// Classe base Medico
public class Medico {
    public void realizarParto() {
        System.out.println("Realizando parto...");
    }
}

// Subclasse Anestesista
public class Anestesista extends Medico {
    @Override
    public void realizarParto() {
        System.out.println("Aplicando injeção anestésica...");
        System.out.println("Realizando parto...");
    }
}

// Subclasse Obstetra
public class Obstetra extends Medico {
    @Override
    public void realizarParto() {
        System.out.println("Preparando e retirando o bebê...");
        System.out.println("Realizando parto...");
    }
}

// Subclasse Pediatra
public class Pediatra extends Medico {
    @Override
    public void realizarParto() {
        System.out.println("Verificando a saúde do recém-nascido...");
        System.out.println("Realizando parto...");
    }
}
