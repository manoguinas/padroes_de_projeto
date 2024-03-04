import java.util.Scanner;

class FabricaNestle implements FabricaOvoDePascoa {
    @Override
    public OvoDePascoa criarOvo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o produto da Nestle:");
        System.out.println("1) Classic 185g");
        System.out.println("2) Kit Kat 227g");
        System.out.println("3) Alpino 337g");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new Classic();
            case 2:
                return new KitKat();
            case 3:
                return new Alpino();
            default:
                System.out.println("Opção inválida, criando Classic por padrão.");
                return new Classic();
        }
    }
}