package revisao_java;
import java.util.Scanner;

public class atv6A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra:");
        double compra = scanner.nextDouble();

        double saldo = 500.00;
        double desconto = compra * 0.10;
        double valor_total = compra - desconto;

        if (valor_total > saldo){
            System.out.println("valor compra : "+compra);
                    System.out.println("desconto : "+
                            desconto);
            System.out.println("saldo : "+saldo);
            System.out.println("Valor total : "+valor_total);
                    System.out.println("você não possui saldo suficiente !");
        } else {
            System.out.println("valor compra : "+compra);
                    System.out.println("desconto : "+ desconto);

            System.out.println("saldo : "+saldo);
            System.out.println("Valor total : "+valor_total);

        }

        scanner.close();
    }
}
