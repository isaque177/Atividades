package revisao_ternaria;

import java.util.Scanner;

public class Atvd11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().toLowerCase().charAt(0);

        String resultado = (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') ? "Vogal" : "Consoante";

        System.out.println(resultado);

        scanner.close();
    }
}
