import java.util.Scanner;

class FabricaLacta implements FabricaOvoDePascoa {
    @Override
    public OvoDePascoa criarOvo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o produto da Lacta:");
        System.out.println("1) A Leite 170g");
        System.out.println("2) Oreo 257g");
        System.out.println("3) Sonho de Valsa 277g");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new ALeite();
            case 2:
                return new Oreo();
            case 3:
                return new SonhoDeValsa();
            default:
                System.out.println("Opção inválida, criando A Leite por padrão.");
                return new ALeite();
        }
    }
}