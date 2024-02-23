package Aula4Atv2;

class AdidasFactory implements EsportivaFactory {
  @Override
  public Tenis criarTenis() {
      return new AdidasTenis();
  }

  @Override
  public Camiseta criarCamiseta() {
      return new AdidasCamiseta();
  }
}
