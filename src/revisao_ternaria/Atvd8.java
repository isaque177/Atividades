package revisao_ternaria;

import java.util.Scanner;

public class Atvd8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        int nota = sc.nextInt();

        System.out.println((nota >= 7)? "Aprovado" : "Reprovado");
    }
}
