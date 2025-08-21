package Desafio3_AgendaDeContatos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato por nome");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contato contato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(contato);
                    break;

                case 2:
                    agenda.listarContatos();
                    break;

                case 3:
                    System.out.print("Nome para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    agenda.buscarContato(nomeBusca);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
