package revisao_ternaria;

import java.util.Scanner;

public class Atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        System.out.println((n > 0)? "Positivo": (n < 0)? "Negativo" : "Zero");

        sc.close();
    }
}
