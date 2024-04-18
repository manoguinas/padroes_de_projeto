import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Escolha o tipo de sanduíche:");
      System.out.println("1. Padrão");
      System.out.println("2. Personalizado");

      int escolha = scanner.nextInt();
      ConstrutorSanduiche construtor;

      if (escolha == 1) {
        construtor = new ConstrutorSanduichePadrao();
      } else if (escolha == 2) {
        construtor = new ConstrutorSanduichePersonalizado();
      } else {
        System.out.println("Escolha inválida. Saindo do programa.");
        return;
      }

      DiretorSanduiche diretor = new DiretorSanduiche(construtor);
      diretor.construirSanduiche();
      Sanduiche sanduiche = diretor.getSanduiche();

      System.out.println("\nSanduíche finalizado:");
      System.out.println(sanduiche);
    }
  }
}
