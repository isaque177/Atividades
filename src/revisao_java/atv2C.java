package revisao_java;
import java.util.Scanner;

public class atv2C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o 1° numero");
        int num1 = scanner.nextInt();
        System.out.println("digite o 2° numero ");
        int num2 = scanner.nextInt();
        System.out.println("digite 3° numero: ");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println(num1+ " É o maior número !");
        }else if (num1 < num2 && num1 < num3){
            System.out.println(num1+ " É o menor número");
        }
        if (num2 > num1 && num2 > num3){
            System.out.println(num2+ " É o maior número !");
        }else if (num2 < num1 && num2 < num3){
            System.out.println(num2+ " É o menor número");
        }
        if (num3 > num2 && num3 > num1){
            System.out.println(num3+ " É o maior número !");
        }else if (num3 < num2 && num3 < num1){
            System.out.println(num3+ " É o menor número");
        }
        scanner.close();
    }
}
