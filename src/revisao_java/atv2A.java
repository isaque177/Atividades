package revisao_java;
import java.util.Scanner;

public class atv2A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua 1° nota: ");

        int nota1 = scanner.nextInt();
        System.out.println("digite sua 2° nota: ");
        int nota2 = scanner.nextInt();

        int soma = nota1 + nota2;
        int media = soma / 2;

        if (media >= 7) {
            System.out.println("você foi aprovado ! :)");

        }else {
            System.out.println("você não foi aprovado !:(");
        }

        scanner.close();
    }
}
