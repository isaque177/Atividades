package revisao_java;
import java.util.Scanner;

public class atv3C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        if (!nome.isEmpty() && nome.toUpperCase().charAt(0) == 'A') {
            System.out.println("O nome começa com a letra 'A'.");
        } else {
            System.out.println("O nome NÃO começa com a letra 'A'.");
        }

        scanner.close();
    }
}
