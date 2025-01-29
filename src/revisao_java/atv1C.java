package revisao_java;
import java.util.Scanner;

public class atv1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: "); int
                num1 = scanner.nextInt();
        System.out.println("Digite outro número: "); int
                num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1+" É maior que "+num2); }else {
            System.out.println(num2+" É maior que "+num1); }
        scanner.close();
    }
}

