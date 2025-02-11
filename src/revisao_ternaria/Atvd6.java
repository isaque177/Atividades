package revisao_ternaria;

import java.util.Scanner;

public class Atvd6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.print("Possui carteira de habilitação? : [s/n]");
        char carteira = sc.next().charAt(0);
        permissao_para_dirigir(carteira, idade);


    }

    public static void permissao_para_dirigir(int idade,int carteira) {

        System.out.println ((idade >= 18 && ( carteira == 's')) ? "Você já dirigir" : "Você ainda não pode dirigir");

    }
}
