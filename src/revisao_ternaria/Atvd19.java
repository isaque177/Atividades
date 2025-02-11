package revisao_ternaria;

import java.util.Scanner;

public class Atvd19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        divisivel(n);

        sc.close();
    }

    public static void divisivel (int n) {
        System.out.println((n % 2 == 0 || n % 3 == 0)? n+" É divisivel!": n+"Não é divisivel !" );

    }
}
