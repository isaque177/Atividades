package revisao_ternaria;

import java.util.Scanner;

public class Atvd12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String resultado = par_impar_PN(numero);
        mostrar_resultado(resultado);



        scanner.close();

    }

    public static String par_impar_PN(int numero) {  // retorna se o número é par/impar  positivo/negativo
        String resultado = (numero % 2 == 0) ?
                ((numero >= 0) ? "Par e Positivo" : "Par e Negativo") :
                ((numero >= 0) ? "Ímpar e Positivo" : "Ímpar e Negativo");

        return resultado;
    }

    public static void mostrar_resultado(String resultado) {

        System.out.println("Resultado: " + resultado);

    }
}
