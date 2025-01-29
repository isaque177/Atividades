package revisao_java;
import java.util.Scanner;

public class atv4C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 % num2 == 0){
            System.out.println(num1+ " É divisivel por "+num2);
        }else {
            System.out.println(num1+ " Não é divisivel por "+num2);
        }
        scanner.close();
    }
}
