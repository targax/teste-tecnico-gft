package Desafio2_ZoologicoVirtual;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal leao = new Leao();
        Animal macaco = new Macaco();
        Animal elefante = new Elefante();

        System.out.println("Escolha um animal (1 - Leão, 2 - Macaco, 3 - Elefante, 0 - Sair):");

        while (true) {
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (escolha) {
                case 1:
                    leao.emitirSom();
                    break;
                case 2:
                    macaco.emitirSom();
                    break;
                case 3:
                    elefante.emitirSom();
                    break;
                default:
                    System.out.println("Escolha inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}