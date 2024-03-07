class PumaFactory implements EsportivaFactory {
  @Override
  public CamisaEsportiva criarCamisa() {
      return new BotafogoCamisa();
  }
}