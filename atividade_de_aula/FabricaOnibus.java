class FabricaOnibus implements FabricaTransporte {
  @Override
  public Transporte criarTransporte() {
      return new Onibus(50, "Cartão", "Rota A");
  }
}