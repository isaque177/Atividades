package revisao_java;
import java.util.Scanner;

public class atv1F {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um ano:"); int
                ano = scanner.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0){
            System.out.println("Este ano é bissexto !");

        }else {
            System.out.println("Este ano não é bissexto !"); }
        scanner.close();
    }
}
