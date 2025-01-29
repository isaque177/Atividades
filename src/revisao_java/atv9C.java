package revisao_java;
import java.util.Scanner;

public class atv9C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Celsius para Kelvin");
        System.out.print("Digite a opção (1 ou 2): ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C é igual a " + fahrenheit + "°F.");
        } else if (opcao == 2) {
            double kelvin = celsius + 273.15;
            System.out.println(celsius + "°C é igual a " + kelvin + "K.");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
