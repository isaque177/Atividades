package CriacaodeMetodos;

import java.util.Scanner;

public class Criacao_de_metodos_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int soma = ssoma(num1,num2);
        boolean vrf = soma_Maior_que_100(soma);
        resultado(vrf,num1,num2,soma);
    }

    public static  int ssoma(int num1, int num2) {

        return (num1+num2);

    }

    public static boolean soma_Maior_que_100(int soma) {

        boolean vrf;

        if (soma > 100){
            vrf = true;
        }else {
            vrf =false;
        }
        return  vrf;
    }

    public static void resultado(boolean vrf,int num1,int num2,int soma) {

        System.out.println(num1+" + "+num2+" = "+soma);
        System.out.print("soma maior que 100 = "+vrf);

    }
}
