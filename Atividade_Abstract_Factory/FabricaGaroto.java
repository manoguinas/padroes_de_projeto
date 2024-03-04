import java.util.Scanner;

class FabricaGaroto implements FabricaOvoDePascoa {
    @Override
    public OvoDePascoa criarOvo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o produto da Garoto:");
        System.out.println("1) Crocante 215g");
        System.out.println("2) Talento 350g");
        System.out.println("3) Baton ao Leite 172g");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new Crocante();
            case 2:
                return new Talento();
            case 3:
                return new BatonAoLeite();
            default:
                System.out.println("Opção inválida, criando Crocante por padrão.");
                return new Crocante();
        }
    }
}