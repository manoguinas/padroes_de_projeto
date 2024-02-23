package Aula4Atv2;

class NikeFactory implements EsportivaFactory {
  @Override
  public Tenis criarTenis() {
      return new NikeTenis();
  }

  @Override
  public Camiseta criarCamiseta() {
      return new NikeCamiseta();
  }
}
