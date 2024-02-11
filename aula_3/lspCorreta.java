interface FormaGeometrica {
  int calcularArea();
}

class Retangulo implements FormaGeometrica {
  protected int largura;
  protected int altura;

  public Retangulo(int largura, int altura) {
      this.largura = largura;
      this.altura = altura;
  }

  public void setAltura(int altura) {
      this.altura = altura;
  }

  public void setLargura(int largura) {
      this.largura = largura;
  }

  @Override
  public int calcularArea() {
      return largura * altura;
  }
}

class Quadrado implements FormaGeometrica {
  private int lado;

  public Quadrado(int lado) {
      this.lado = lado;
  }

  @Override
  public int calcularArea() {
      return lado * lado;
  }
}

public class lspCorreta {
  public static void main(String[] args) {
      FormaGeometrica forma1 = new Retangulo(5, 10);
      System.out.println("Área do retângulo: " + forma1.calcularArea());

      FormaGeometrica forma2 = new Quadrado(5);
      System.out.println("Área do quadrado: " + forma2.calcularArea());
  }
}
