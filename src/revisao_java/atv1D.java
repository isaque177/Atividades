package revisao_java;

import java.util.Scanner;

public class atv1D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é sua idade ?"); int
                idade = scanner.nextInt();

        if (idade >= 16){
            System.out.println("você já possui idade para votar !");
        }else {
            System.out.println("você ainda não possui idade para votar :( ");

        }
        scanner.close();
    }
}


