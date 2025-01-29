package revisao_java;
import java.util.Scanner;

public class atv6B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário :");
        double salario = scanner.nextDouble();
        if (salario >= 3000){
            System.out.println("você pode financiar o imóvel");
        }else {
            System.out.println("você NÃO pode financiar o imóvel");
        }
        scanner.close();
    }
}
