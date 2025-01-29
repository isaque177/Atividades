package revisao_java;
import java.util.Scanner;

public class atv4D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");

        int num3 = scanner.nextInt();
        if (num1 == num2 && num1 == num3){
            System.out.println("estes numeros formam um triângulo !");
        }else {
            System.out.println("estes numeros não formam um triângulo !");
        }
        scanner.close();
    }
}
