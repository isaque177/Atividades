package revisao_java;
import java.util.Scanner;

public class atv5C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("sua altura ");
        int altura = scanner.nextInt();
        if (altura <= 1.60){
            System.out.println("você é baixo(a)");
        } else if (altura >=1.61 && altura < 1.80){
            System.out.println("você tem altura média");
        }else {
            System.out.println("você é alto");
        }
        scanner.close();
    }
}
