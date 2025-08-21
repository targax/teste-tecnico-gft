import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        String fraseCriptografada = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'A' || c == 'a') {
                fraseCriptografada += "@";
            } else if (c == 'E' || c == 'e') {
                fraseCriptografada += "#";
            } else if (c == 'I' || c == 'i') {
                fraseCriptografada += "!";
            } else if (c == 'O' || c == 'o') {
                fraseCriptografada += "$";
            } else if (c == 'U' || c == 'u') {
                fraseCriptografada += "%";
            } else {
                fraseCriptografada += c;
            }
        }

        System.out.println("Frase criptografada:");
        System.out.println(fraseCriptografada);
        scanner.close();
    }
}
