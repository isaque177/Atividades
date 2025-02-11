package revisao_ternaria;

import java.util.Scanner;

public class Atvd13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println((n > n2) ? n+" É maior que "+n2 : n2+" É maior que "+n);
        sc.close();
    }


}






