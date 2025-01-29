package revisao_java;
import java.util.Scanner;

public class atv1E {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:"); int
                num1 = scanner.nextInt();
        System.out.println("digite um número"); int
                num2 = scanner.nextInt();
        System.out.println("digite um número"); int
                num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println(num1+ " É o número maior"); }else if
        (num2 > num1 && num2 > num3) { System.out.println(num2+
                " É o número maior"); }else {
            System.out.println(num3+ " É o número maior"); }
        scanner.close();
    }
}
