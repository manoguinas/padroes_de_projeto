interface Trabalhador {
  void trabalhar();
}

interface Comedor {
  void comer();
}

interface Dormidor {
  void dormir();
}

class Programador implements Trabalhador, Comedor {
  @Override
  public void trabalhar() {
      System.out.println("Programador trabalhando...");
  }

  @Override
  public void comer() {
      System.out.println("Programador comendo...");
  }
}

class Gerente implements Trabalhador, Comedor, Dormidor {
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

public class ispCorreta {
  public static void main(String[] args) {
      Trabalhador programador = new Programador();
      programador.trabalhar();
      ((Comedor) programador).comer();

      Trabalhador gerente = new Gerente();
      gerente.trabalhar();
      ((Comedor) gerente).comer();
      ((Dormidor) gerente).dormir();
  }
}
