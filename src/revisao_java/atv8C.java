package revisao_java;
import java.util.Random;
import java.util.Scanner;

public class atv8C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(10) + 1;

        System.out.print("Adivinhe o número entre 1 e 10: ");
        int tentativa = scanner.nextInt();

        if (tentativa == num) {
            System.out.println("Parabéns! Você acertou o número!");
        } else {
            System.out.println("Você errou. O número secreto era " + num);
        }

        scanner.close();
    }
}
