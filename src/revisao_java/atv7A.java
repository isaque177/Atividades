package revisao_java;
import java.util.Scanner;

public class atv7A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um horário ");
        String horario = scanner.nextLine();

        String[] partes = horario.split(":");

        if (partes.length == 2) {
            try {
                int hora = Integer.parseInt(partes[0]);
                int minuto = Integer.parseInt(partes[1]);

                if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60) {
                    System.out.println("Horário válido.");
                } else {
                    System.out.println("Horário inválido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de horário inválido.");
            }
        } else {
            System.out.println("Formato de horário inválido.");
        }

        scanner.close();
    }
}
