package CriacaodeMetodos;

import java.util.Scanner;

public class Criacao_de_metodo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota:");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a nota:");
        int nota2 = scanner.nextInt();

        int mediaA = media(nota1,nota2);
         String status = verificacao(mediaA);

        mostrarStatus(status);

        scanner.close();
    }

    public static  int media (int nota1, int nota2) {

        return (nota1 + nota2) / 2;

    }

    public static String verificacao ( int mediaA) {
        String status;


        if (mediaA >= 7){
            status= "Aprovado";
        } else if (mediaA >=5) {
            status= "Recuperação";

        }else {
            status= "Reprovado";
        }

        return status;
    }

    public static void mostrarStatus(String status) {

        System.out.print("O aluno está: "+status);
    }

}

