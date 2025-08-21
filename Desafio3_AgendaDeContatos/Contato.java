package Desafio3_AgendaDeContatos;

public class Contato {
    String nome;
    String telefone;
    String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void mostrarContato() {
        System.out.println("Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email);
    }
}