class Onibus implements Transporte {
  private final int capacidade;
  private final String metodoPagamento;
  private final String rota;

  public Onibus(int capacidade, String metodoPagamento, String rota) {
      this.capacidade = capacidade;
      this.metodoPagamento = metodoPagamento;
      this.rota = rota;
  }

  @Override
  public void exibirInformacoes() {
      System.out.println("Ônibus - Capacidade: " + capacidade + ", Método de Pagamento: " + metodoPagamento + ", Rota: " + rota);
  }
}