package revisao_java;

import java.util.Scanner;

public class atv9E {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuarioValido = "usuario123";
        String senhaValida = "senha123";

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioValido) && senha.equals(senhaValida)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }

        scanner.close();
    }
}
