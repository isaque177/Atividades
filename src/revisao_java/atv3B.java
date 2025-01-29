package revisao_java;
import java.util.Scanner;

public class atv3B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha :");

        int senha = scanner.nextInt();

        if (senha == 1234){
            System.out.println("senha correta !");
        }else {
            System.out.println("senha incorreta !");
        }

        scanner.close();
    }
}
