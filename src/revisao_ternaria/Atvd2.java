package revisao_ternaria;

import java.util.Scanner;

public class Atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println((idade >= 18) ? "Maior de idade" : "Menor de idade");
    }
}
