package revisao_java;

import java.util.Scanner;

public class atv5D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da pressão sistólica: ");
        int sistolica = scanner.nextInt();
        System.out.print("Digite o valor da pressão diastólica: ");
        int diastolica = scanner.nextInt();
        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Pressão arterial baixa.");
        } else if ((sistolica >= 120 && sistolica <=
                139) || (diastolica >= 80 && diastolica <= 89)) {
            System.out.println("Pressão arterial moderada.");

        } else {
            System.out.println("Pressão arterial alta.");
        }
        scanner.close();
    }
}
