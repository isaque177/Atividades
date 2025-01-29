package revisao_java;

import java.util.Scanner;

public class atv6C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 3000.0;
        double limiteParcelas = salario * 0.10;

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        int numParcelas = scanner.nextInt();

        double valorParcela = valorProduto / numParcelas;

        if (valorParcela <= limiteParcelas) {
            System.out.println("A compra pode ser realizada. Valor da parcela: R$ " + valorParcela);
        } else {
            System.out.println("A compra não pode ser realizada. O valor da parcela excede 10% do salário.");
        }

        scanner.close();
    }
}
