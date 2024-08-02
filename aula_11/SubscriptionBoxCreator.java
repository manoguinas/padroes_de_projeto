import java.util.Scanner;

public class SubscriptionBoxCreator {
    public static Box createSubscriptionBox(String level) {
        switch (level) {
            case "Bronze":
                return new Box(level, 3);
            case "Prata":
                return new Box(level, 5);
            case "Ouro":
                return new Box(level, 7);
            case "Platina":
                return new Box(level, 10);
            default:
                throw new IllegalArgumentException("Nível inválido. Escolha entre Bronze, Prata, Ouro ou Platina.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o nível da assinatura (Bronze, Prata, Ouro, Platina): ");
        String level = scanner.nextLine();

        try {
            Box box = createSubscriptionBox(level);
            System.out.println(box);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
