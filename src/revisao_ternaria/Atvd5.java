package revisao_ternaria;

import java.util.Scanner;

public class Atvd5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um ano: ");
         int ano = sc.nextInt();

        ano_bissexto(ano);

        sc.close();
    }

    public static void ano_bissexto(int ano) {
        System.out.println((ano % 4 == 0 && ano % 100 != 0)? ano+" É um ano bissexto !": ano+"Não é um ano bissexto !" );

    }
}
