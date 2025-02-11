package revisao_ternaria;

import java.util.Scanner;

public class Atvd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        System.out.println((n % 5 == 0)? "O número é múltiplo de 5":  "O número não é múltiplo de 5");

        sc.close();

    }
}
