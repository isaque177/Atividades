package CriacaodeMetodos;

import java.util.Scanner;

public class Criacao_de_metodo_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

    }

    public static void voto(int idade) {

        if (idade >= 16){

        }else {
            System.out.println("Você ainda não pode votar!!");
        }

    }
}
