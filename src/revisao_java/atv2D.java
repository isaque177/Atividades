package revisao_java;

import java.util.Scanner;

public class atv2D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota: ");
        int nota = scanner.nextInt();

        if (nota == 10) {
            System.out.println("você tirou nota máxima ! :)");

        }else if(nota >= 7) {
            System.out.println("você está aprovado !");
        }else {
            System.out.println("você está Reprovado ! :(");
        }

        scanner.close();
    }
}
