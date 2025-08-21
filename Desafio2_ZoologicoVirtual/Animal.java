package Desafio2_ZoologicoVirtual;

public class Animal {
    String nome;

    public Animal(){
        
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som de animal");
    }
}
