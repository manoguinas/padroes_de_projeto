import java.util.Scanner;

class FabricaHersheys implements FabricaOvoDePascoa {
    @Override
    public OvoDePascoa criarOvo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o produto da Hershey's:");
        System.out.println("1) Hershey's 137g");
        System.out.println("2) Hershey's 225g");
        System.out.println("3) Hershey's 336g");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                return new Hersheys137g();
            case 2:
                return new Hersheys225g();
            case 3:
                return new Hersheys336g();
            default:
                System.out.println("Opção inválida, criando Hershey's 137g por padrão.");
                return new Hersheys137g();
        }
    }
}