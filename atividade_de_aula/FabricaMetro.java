class FabricaMetro implements FabricaTransporte {
  @Override
  public Transporte criarTransporte() {
      return new Metro(200, 80, "Linha 1");
  }
}