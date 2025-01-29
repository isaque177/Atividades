package revisao_java;
import java.util.Scanner;

public class atv4A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.print("Digite um número:");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        if (soma > 100){
            System.out.println("A soma de "+num1+" + "+num2+" é maior que 100");
        }else {
            System.out.println("A soma de "+num1+" + "+num2+" Não é maior que 100");
        }

        scanner.close();
    }
}
