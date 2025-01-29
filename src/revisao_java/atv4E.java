package revisao_java;
import java.util.Scanner;

public class atv4E {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        double raizQuadrada = Math.sqrt(numero);
        if (raizQuadrada == (int) raizQuadrada) {
            System.out.println("O número " + numero +
                    " é um quadrado perfeito.");
        } else {
            System.out.println("O número " + numero +
                    " NÃO é um quadrado perfeito.");
        }
        scanner.close();
    }
}
