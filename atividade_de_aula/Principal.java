public class Principal {
  public static void main(String[] args) {
      FabricaTransporte fabrica = new FabricaOnibus();
      FabricaTransporte fabrica1 = new FabricaMetro();
      Transporte transporte = fabrica.criarTransporte();
      Transporte transporte1 = fabrica1.criarTransporte();
      transporte.exibirInformacoes();
      transporte1.exibirInformacoes();
  }
}
