package revisao_java;

import java.util.Scanner;

public class atv9A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número final da placa do veículo: ");
        int numeroPlaca = scanner.nextInt();

        if (numeroPlaca % 2 == 0) {
            System.out.println("O veículo pode passar no pedágio (placa com número par).");
        } else {
            System.out.println("O veículo pode passar no pedágio (placa com número ímpar).");
        }

        scanner.close();
    }
}
