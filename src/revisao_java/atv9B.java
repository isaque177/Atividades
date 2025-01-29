package revisao_java;

import java.util.Scanner;

public class atv9B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senha = 1234;

        System.out.print("Digite o código de acesso: ");
        int codigo = scanner.nextInt();

        if (codigo == senha) {
            System.out.println("Código de acesso correto!");
        } else {
            System.out.println("Código de acesso incorreto.");
        }

        scanner.close();
    }
}
