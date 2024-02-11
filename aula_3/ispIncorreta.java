interface Trabalhador {
  void trabalhar();

  void comer();

  void dormir();
}

class Programador implements Trabalhador {
  @Override
  public void trabalhar() {
      System.out.println("Programador trabalhando...");
  }

  @Override
  public void comer() {
      System.out.println("Programador comendo...");
  }

  @Override
  public void dormir() {
      System.out.println("Programador dormindo...");
  }
}

class Gerente implements Trabalhador {
  @Override
  public void trabalhar() {
      System.out.println("Gerente trabalhando...");
  }

  @Override
  public void comer() {
      System.out.println("Gerente comendo...");
  }

  @Override
  public void dormir() {
      System.out.println("Gerente dormindo...");
  }
}

public class ispIncorreta {
  public static void main(String[] args) {
      Trabalhador programador = new Programador();
      programador.trabalhar();
      programador.comer();
      programador.dormir();

      Trabalhador gerente = new Gerente();
      gerente.trabalhar();
      gerente.comer();
      gerente.dormir();
  }
}

/*
 * A interface Trabalhador contém métodos que não são relevantes para
 * todas as classes. Por exemplo, a classe Programador não precisa do método dormir,
 * mas ainda é forçada a implementá-lo.
 */