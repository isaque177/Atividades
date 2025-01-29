package revisao_java;
import java.util.Scanner;

public class atv3D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
                String palavra = scanner.nextLine();

        if (palavra.length() > 5) {
            System.out.println("A palavra contém mais de 5 caracteres.");
        } else {
            System.out.println("A palavra NÃO contém mais de 5 caracteres.");
        }

        scanner.close();
    }
}
