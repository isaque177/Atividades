package revisao_java;

import java.util.Scanner;

public class atv9D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("esta pessoa está apta para doar sangue.");
        } else {
            System.out.println("esta pessoa não está apta para doar sangue.");
        }

        scanner.close();
    }
}
