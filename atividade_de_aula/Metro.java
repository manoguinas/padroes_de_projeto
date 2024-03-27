class Metro implements Transporte {
  private final int capacidade;
  private final int velocidadeMedia;
  private final String linha;

  public Metro(int capacidade, int velocidadeMedia, String linha) {
      this.capacidade = capacidade;
      this.velocidadeMedia = velocidadeMedia;
      this.linha = linha;
  }

  @Override
  public void exibirInformacoes() {
      System.out.println("Metrô - Capacidade: " + capacidade + ", Velocidade Média: " + velocidadeMedia + ", Linha: " + linha);
  }
}