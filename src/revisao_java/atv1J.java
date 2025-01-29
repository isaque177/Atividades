package revisao_java;
import java.util.Scanner;

public class atv1J {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");

        int num = scanner.nextInt();

        if (num >100 && num <200){
            System.out.println("este número está entre 100 e 200");
        }else {
            System.out.println("este número não está entre 100 e 200");
        }

        scanner.close();
    }
}
