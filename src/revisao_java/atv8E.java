package revisao_java;
import java.util.Random;
import java.util.Scanner;

public class atv8E {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1;

        System.out.print("Adivinhe o número sorteado entre 1 e 10: ");
        int tentativa = scanner.nextInt();

        if (tentativa == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número sorteado.");
        } else {
            System.out.println("Você errou. O número sorteado era " + numeroSorteado);
        }

        scanner.close();
    }
}
