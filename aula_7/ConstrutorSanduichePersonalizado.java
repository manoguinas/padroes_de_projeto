import java.util.Scanner;

class ConstrutorSanduichePersonalizado implements ConstrutorSanduiche {
  private Sanduiche sanduiche;

  public ConstrutorSanduichePersonalizado() {
    this.sanduiche = new Sanduiche();
  }

  @Override
  public void construirPao() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Escolha o tipo de pão:");
      System.out.println("1. Pão Integral");
      System.out.println("2. Pão Francês");
      int escolha = scanner.nextInt();
      if (escolha == 1) {
        sanduiche.setPao("Pão Integral");
      } else if (escolha == 2) {
        sanduiche.setPao("Pão Francês");
      } else {
        System.out.println("Escolha inválida. Pão padrão será usado.");
        sanduiche.setPao("Pão Francês");
      }
    }
  }

  @Override
  public void construirCarne() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Escolha o tipo de carne:");
      System.out.println("1. Presunto");
      System.out.println("2. Frango");
      int escolha = scanner.nextInt();
      if (escolha == 1) {
        sanduiche.setCarne("Presunto");
      } else if (escolha == 2) {
        sanduiche.setCarne("Frango");
      } else {
        System.out.println("Escolha inválida. Presunto será usado.");
        sanduiche.setCarne("Presunto");
      }
    }
  }

  @Override
  public void construirQueijo() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Escolha o tipo de queijo:");
      System.out.println("1. Queijo Suíço");
      System.out.println("2. Queijo Cheddar");
      int escolha = scanner.nextInt();
      if (escolha == 1) {
        sanduiche.setQueijo("Queijo Suíço");
      } else if (escolha == 2) {
        sanduiche.setQueijo("Queijo Cheddar");
      } else {
        System.out.println("Escolha inválida. Queijo Suíço será usado.");
        sanduiche.setQueijo("Queijo Suíço");
      }
    }
  }

  @Override
  public void construirIngredientesExtras() {
    try (Scanner scanner = new Scanner(System.in)) {
      String ingrediente;
      while (true) {
        System.out.println("Adicione ingredientes extras (digite 'fim' para parar):");
        System.out.println("1. Alface");
        System.out.println("2. Tomate");
        System.out.println("3. Maionese");
        System.out.print("Escolha o ingrediente ou digite 'fim': ");
        ingrediente = scanner.nextLine();
        if (ingrediente.equalsIgnoreCase("fim")) {
          break;
        }
        switch (ingrediente) {
          case "1":
            sanduiche.getIngredientesExtras().add("Alface");
            break;
          case "2":
            sanduiche.getIngredientesExtras().add("Tomate");
            break;
          case "3":
            sanduiche.getIngredientesExtras().add("Maionese");
            break;
          default:
            System.out.println("Ingrediente inválido. Tente novamente.");
            break;
        }
      }
    }
  }

  @Override
  public Sanduiche getSanduiche() {
    return sanduiche;
  }
}