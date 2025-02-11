package CriacaodeMetodos;

import java.util.Scanner;

public class Criacao_de_metodo_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("O grupo do número é: " + grupo(num));


        scanner.close();

    }

    public static String grupo (int num) {

        return (num >= 1 && num <= 10) ? "A" : (num >= 11 && num <= 20) ? "B" : "C";

    }
}
