package Desafio2_ZoologicoVirtual;

public class Elefante extends Animal {
    public Elefante() {
        nome = "Elefante";
    }

    @Override
    public void emitirSom() {
        System.out.println("Paaah!");
    }
}
