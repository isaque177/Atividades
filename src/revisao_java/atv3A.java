package revisao_java;
import java.util.Scanner;

public class atv3A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" [sim/não]");
        String s_n = scanner.next();
        if (s_n.equals("sim")){
            System.out.println("sim");
        }else {
            System.out.println("não");
        }
        scanner.close();
    }
}
