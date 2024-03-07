class AdidasFactory implements EsportivaFactory {
  @Override
  public CamisaEsportiva criarCamisa() {
      return new FlamengoCamisa();
  }
}