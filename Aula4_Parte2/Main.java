package Aula4Atv2;

public class Main {
  public static void main(String[] args) {
      EsportivaFactory nikeFactory = new NikeFactory();
      Tenis nikeTenis = nikeFactory.criarTenis();
      Camiseta nikeCamiseta = nikeFactory.criarCamiseta();
      nikeTenis.exibirInfo();
      nikeCamiseta.exibirInfo();

      EsportivaFactory adidasFactory = new AdidasFactory();
      Tenis adidasTenis = adidasFactory.criarTenis();
      Camiseta adidasCamiseta = adidasFactory.criarCamiseta();
      adidasTenis.exibirInfo();
      adidasCamiseta.exibirInfo();

      EsportivaFactory olympikusFactory = new OlympikusFactory();
      Tenis olympikusTenis = olympikusFactory.criarTenis();
      Camiseta olympikusCamiseta = olympikusFactory.criarCamiseta();
      olympikusTenis.exibirInfo();
      olympikusCamiseta.exibirInfo();
  }
}
