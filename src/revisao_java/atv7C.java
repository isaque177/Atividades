package revisao_java;

import java.util.Scanner;

public class atv7C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        boolean valido = false;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia >= 1 && dia <= 31) valido = true;
                break;
            case 4: case 6: case 9: case 11:
                if (dia >= 1 && dia <= 30) valido = true;
                break;
            case 2:
                if (dia >= 1 && dia <= 28) valido = true; //  ano não bissexto
                break;
        }

        if (valido) {
            System.out.println("Dia válido.");
        } else {
            System.out.println("Dia inválido para o mês informado.");
        }

        scanner.close();
    }
}
