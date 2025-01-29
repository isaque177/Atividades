package revisao_java;

import java.util.Scanner;

public class atv8B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > 2 * num2) {
            System.out.println(num1 + " é maior que o dobro de " + num2);
        } else if (num2 > 2 * num1) {
            System.out.println(num2 + " é maior que o dobro de " + num1);
        } else {
            System.out.println("Nenhum número é maior que o dobro do outro.");
        }

        scanner.close();
    }
}
