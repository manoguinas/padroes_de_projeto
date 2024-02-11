class Retangulo {
  protected int largura;
  protected int altura;

  public void setAltura(int altura) {
      this.altura = altura;
  }

  public void setLargura(int largura) {
      this.largura = largura;
  }

  public int getArea() {
      return largura * altura;
  }
}

class Quadrado extends Retangulo {
  @Override
  public void setAltura(int altura) {
      super.setAltura(altura);
      super.setLargura(altura);
  }

  @Override
  public void setLargura(int largura) {
      super.setLargura(largura);
      super.setAltura(largura);
  }
}

public class lspIncorreta {
  public static void main(String[] args) {
      Retangulo retangulo = new Quadrado();
      retangulo.setLargura(5);
      retangulo.setAltura(10);

      System.out.println("Área do retângulo: " + retangulo.getArea());
  }
}

/*
 * A relação "é um" entre Quadrado e Retangulo está sendo comprometida porque as precondições
 * da classe base não estão sendo preservadas pela classe derivada.
 */