package Aula4Atv2;

class OlympikusFactory implements EsportivaFactory {
  @Override
  public Tenis criarTenis() {
      return new OlympikusTenis();
  }

  @Override
  public Camiseta criarCamiseta() {
      return new OlympikusCamiseta();
  }
}
