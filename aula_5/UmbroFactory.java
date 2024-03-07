class UmbroFactory implements EsportivaFactory {
  @Override
  public CamisaEsportiva criarCamisa() {
      return new FluminenseCamisa();
  }
}