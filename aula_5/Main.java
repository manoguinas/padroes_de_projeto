import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você quer uma camiseta de qual time? [Brasil, Flamengo, Botafogo, Fluminense, Vasco]");
        String timeEscolhido = scanner.nextLine();

        EsportivaFactory fabrica = escolherFabrica(timeEscolhido);

        if (fabrica != null) {
            CamisaEsportiva camisa = fabrica.criarCamisa();
            System.out.println("-------------------------");
            camisa.exibirInformacoes();
            System.out.println("-------------------------");
        } else {
            System.out.println("Time não encontrado.");
        }

        scanner.close();
    }

    public static EsportivaFactory escolherFabrica(String time) {
        switch (time) {
            case "Brasil":
                return new NikeFactory();
            case "Flamengo":
                return new AdidasFactory();
            case "Botafogo":
                return new PumaFactory();
            case "Fluminense":
                return new UmbroFactory();
            case "Vasco":
                return new KappaFactory();
            default:
                return null;
        }
    }
}
