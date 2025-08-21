package Desafio2_ZoologicoVirtual;

public class Leao extends Animal {
    public Leao() {
        nome = "Leão"; 
    }

    @Override
    public void emitirSom() {
        System.out.println("Rooooar!");
    }
}