
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Subscription mySubscription = new BasicSubscription();

        while (true) {
            System.out.println("Escolha um pacote adicional para adicionar (digite o número correspondente):");
            System.out.println("1. Assistir vídeos em vários dispositivos (R$19,99)");
            System.out.println("2. Frete Grátis em produtos (R$9,99)");
            System.out.println("3. Caixa surpresa com produtos relacionados a filmes e séries (R$29,99)");
            System.out.println("4. Cartão de crédito Platinum (R$49,99)");
            System.out.println("5. Compra com Cash Back (R$19,99)");
            System.out.println("6. Finalizar e exibir assinatura");
            System.out.println("0. Sair");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mySubscription = new MultiDevicePackage(mySubscription);
                    break;
                case 2:
                    mySubscription = new FreeShippingPackage(mySubscription);
                    break;
                case 3:
                    mySubscription = new SurpriseBoxPackage(mySubscription);
                    break;
                case 4:
                    mySubscription = new PlatinumCardPackage(mySubscription);
                    break;
                case 5:
                    mySubscription = new CashBackPackage(mySubscription);
                    break;
                case 6:
                    System.out.println("\nDescrição da assinatura: " + mySubscription.getDescription());
                    System.out.println("Custo total: R$" + String.format("%.2f", mySubscription.getCost()));
                    return;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha inválida, por favor selecione uma opção válida.");
            }
        }
    }
}
