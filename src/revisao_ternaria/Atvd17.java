package revisao_ternaria;

import java.util.Scanner;

public class Atvd17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = sc.nextInt();

        System.out.print("Você ainda é estudante? [s/n]: ");
        char opcao = sc.next().charAt(0);

        boolean direito_a_desconto = desconto(idade, opcao);

        System.out.println(direito_a_desconto ? "Você tem direito a desconto!" : "Você não tem direito a desconto.");

        sc.close();
    }

    public static boolean desconto(int idade, char opcao) { // analisa se o usuário tem direito a desconto

        return (idade >= 60 || opcao == 's' || opcao == 'S');
    }
}
