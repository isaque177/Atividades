package revisao_ternaria;

import java.util.Scanner;

public class Atvd9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a > b)? a+" É maior que "+b : b+" É maior que "+a  );
    }
}
