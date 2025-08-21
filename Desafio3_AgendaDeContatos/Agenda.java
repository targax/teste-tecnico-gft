package Desafio3_AgendaDeContatos;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato c) {
        contatos.add(c);
        System.out.println("Contato adicionado!");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
            return;
        }
        for (Contato c : contatos) {
            c.mostrarContato();
        }
    }

    public void buscarContato(String nome) {
        boolean encontrado = false;
        for (Contato c : contatos) {
            if (c.nome.equalsIgnoreCase(nome)) {
                c.mostrarContato();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado: " + nome);
        }
    }
}
