package revisao_java;
import java.util.Scanner;

public class atv8D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};
        java.util.Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente: ");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
