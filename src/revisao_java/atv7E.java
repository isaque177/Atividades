package revisao_java;
import java.util.Scanner;

public class atv7E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataInicio = "2025-01-01";
        String dataFim = "2025-12-31";

        System.out.print("Digite a data (aaaa-mm-dd): ");
        String data = scanner.nextLine();

        // Verificar se a data fornecida está no intervalo
        if (data.compareTo(dataInicio) >= 0 && data.compareTo(dataFim) <= 0) {
            System.out.println("A data está dentro do período.");
        } else {
            System.out.println("A data está fora do período.");
        }

        scanner.close();

        scanner.close();

    }
}
