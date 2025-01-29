package revisao_java;
import java.util.Scanner;

public class atv7D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (0-23): ");
        int hora = scanner.nextInt();

        if (hora >= 5 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora inválida.");
        }

        scanner.close();
    }
}
