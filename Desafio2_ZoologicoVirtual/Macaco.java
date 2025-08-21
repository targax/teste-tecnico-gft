package Desafio2_ZoologicoVirtual;

public class Macaco extends Animal {
    public Macaco() {
        nome = "Macaco";
    }

    @Override
    public void emitirSom() {
        System.out.println("Uh uh ah ah!");
    }
}
