import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.println("Código de verificação: " + loginSystem.botVerificationCode);
        System.out.print("Digite o código de verificação: ");
        String verificationCode = scanner.nextLine();

        loginSystem.login(username, password, verificationCode);

        scanner.close();
    }
}
