class NikeFactory implements EsportivaFactory {
  @Override
  public CamisaEsportiva criarCamisa() {
      return new BrasilCamisa();
  }
}