package revisao_java;
import java.util.Scanner;

public class atv1G {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:"); int
                num = scanner.nextInt();
        if (num % 5 == 0){
            System.out.println(num+" É multiplo por 5 !"); }else {
            System.out.println(num+" Não é multiplo por 5 !");
        }
        scanner.close();
    }
}
