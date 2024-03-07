class Camisa implements CamisaEsportiva {
  private String time;
  private String fabricante;
  
  public Camisa(String time, String fabricante) {
      this.time = time;
      this.fabricante = fabricante;
  }
  
  @Override
  public void exibirInformacoes() {
      System.out.println("Time: " + time);
      System.out.println("Fabricante: " + fabricante);
  }
}