package revisao_java;

import java.util.Scanner;

public class atv1I {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");

        int num = scanner.nextInt();

        if (num >10 && num <50){
            System.out.println("este número está entre 10 e 50");
        }else {
            System.out.println("este número não está entre 10 e 50");
        }

        scanner.close();
    }
}
