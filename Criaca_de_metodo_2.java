package CriacaodeMetodos;

import java.util.Scanner;

public class Criaca_de_metodo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a 1° nota");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a 2° nota");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a 3° nota");
        int nota3 = scanner.nextInt();

        int maiorNota = notaMaior(nota1,nota2,nota3);
        int menorNota = notaMenor(nota1,nota2,nota3);
        mostrarnotaMa(maiorNota);
        mostrarnotaMe(menorNota);


    }

    public static int notaMaior (int nota1, int nota2, int nota3) {
        int notaMa;
       if (nota1 > nota2 && nota1 > nota3){
           notaMa = nota1;
       } else if (nota2> nota1 && nota2 > nota3) {

           notaMa = nota2;
       }else {

           notaMa = nota3;
       }


        return notaMa;
    }

    public static int notaMenor (int nota1, int nota2, int nota3) {
        int notaMe;
        if (nota1 < nota2 && nota1 < nota3){
            notaMe = nota1;
        } else if (nota2 < nota1 && nota2 < nota3) {

            notaMe = nota2;
        }else {

            notaMe = nota3;
        }


        return notaMe;
    }

    public static void mostrarnotaMa(int maiorNota) {

        System.out.println("A maior nota é: "+maiorNota);

    }

    public static void mostrarnotaMe(int menorNota) {

        System.out.println("A menor nota é: "+menorNota);

    }
}
