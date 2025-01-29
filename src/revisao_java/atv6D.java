package revisao_java;
import java.util.Scanner;

public class atv6D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Valor mínimo de compra para ganhar o brinde
        double valorMinimo = 500.0;

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= valorMinimo) {
            System.out.println("Parabéns! Você ganhou um brinde!");
        } else {
            System.out.println("Gaste mais para ganhar um brinde!.");
        }

        scanner.close();
    }
}
