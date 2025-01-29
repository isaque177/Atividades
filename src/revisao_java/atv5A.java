package revisao_java;
import java.util.Scanner;

public class atv5A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 65) {
            System.out.println("O senhor já é um idoso ");
        } else if(idade >= 18) {
            System.out.println("você já é um adulto");
        } else if (idade >= 14) {
            System.out.println("você é um adolescente");
        }else {
            System.out.println("você é uma criança");
        }

        scanner.close();
    }
}
