import java.util.Scanner;

public class DistribuidoraDeOvosDePascoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Distribuidora de Ovos de Páscoa!");
        System.out.println("Escolha a marca de ovos de Páscoa desejada:");
        System.out.println("1) Nestle");
        System.out.println("2) Garoto");
        System.out.println("3) Lacta");
        System.out.println("4) Hershey's");
        System.out.println("5) Ferrero Rocher");

        int escolhaMarca = scanner.nextInt();
        FabricaOvoDePascoa fabrica = null;

        switch (escolhaMarca) {
            case 1:
                fabrica = new FabricaNestle();
                break;
            case 2:
                fabrica = new FabricaGaroto();
                break;
            case 3:
                fabrica = new FabricaLacta();
                break;
            case 4:
                fabrica = new FabricaHersheys();
                break;
            case 5:
                fabrica = new FabricaFerreroRocher();
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                return;
        }

        OvoDePascoa ovo = fabrica.criarOvo();
        if (ovo != null)
            ovo.exibirInfo();
        else
            System.out.println("Ovo de Páscoa indisponível para esta marca.");
    }
}
