package revisao_java;
import java.util.Scanner;

public class atv2B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua 1° nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("digite sua 2° nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("digite sua 3° nota: ");
        int nota3 = scanner.nextInt();

        int soma = nota1 + nota2 + nota3;
        int media = soma / 3;
        if (media >= 7) {
            System.out.println("você foi Aprovado ! :)");
        }else if(media < 7 && media >= 5) {
            System.out.println("Recuperação !");
        }else {
            System.out.println("você está Reprovado !:(");
        }
        scanner.close();
    }
}
