package revisao_java;
import java.util.Scanner;

public class atv7B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("Mês válido.");
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }
}
