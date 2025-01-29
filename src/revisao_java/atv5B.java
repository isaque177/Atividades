package revisao_java;
import java.util.Scanner;

public class atv5B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número: ");
        int num = scanner.nextInt();

        if (num >= 1 && num <=10) {
            System.out.println("grupa A : de 1 a 10");
        }
        else if (num >= 11 && num <=20) {
            System.out.println("grupa b : de 11 a 20");
        }
        else {
            System.out.println("grupa C : de 21 a 30");
        }
        scanner.close();
    }
}
