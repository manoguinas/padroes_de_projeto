import java.util.Scanner;

class FabricaFerreroRocher implements FabricaOvoDePascoa {
    @Override
    public OvoDePascoa criarOvo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o produto da Ferrero Rocher:");
        System.out.println("1) Ferrero Rocher 137g");
        System.out.println("2) Ferrero Rocher 255g");
        System.out.println("3) Ferrero Rocher 366g");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new FerreroRocher137g();
            case 2:
                return new FerreroRocher255g();
            case 3:
                return new FerreroRocher366g();
            default:
                System.out.println("Opção inválida, criando Ferrero Rocher 137g por padrão.");
                return new FerreroRocher137g();
        }
    }
}