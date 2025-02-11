package revisao_ternaria;

import java.util.Scanner;

public class atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        System.out.println((n % 2 == 0) ? "Par" : "Impar");


    }
}
