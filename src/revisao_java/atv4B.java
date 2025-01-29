package revisao_java;
import java.util.Scanner;

public class atv4B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int diferenca = num1 - num2;

        if (diferenca < 0) {
            System.out.println("A diferença entre " + num1 + " e " + num2 + " é negativa.");
        } else {
            System.out.println("A diferença entre " + num1 + " e " + num2 + " NÃO é negativa.");
        }

        scanner.close();
    }
}
