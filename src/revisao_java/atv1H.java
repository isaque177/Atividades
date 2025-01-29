package revisao_java;
import java.util.Scanner;

public class atv1H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        caractere = Character.toLowerCase(caractere);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            System.out.println(caractere + " é uma vogal.");
        } else {
            System.out.println(caractere + " não é uma vogal.");
        }

        scanner.close();
    }
}



