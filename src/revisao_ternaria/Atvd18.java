package revisao_ternaria;

import java.util.Scanner;

public class Atvd18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho dos 3 lados do triângulo: ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        System.out.println((lado1 == lado2 && lado2 == lado3) ? "Equilátero" : (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) ? "Isósceles" : "Escaleno");


    }
}
