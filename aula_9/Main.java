public class Main {
  public static void main(String[] args) {
    String perfilDoUsuario = "ultimate";

    BancoDeDados bancoDeDados = FabricaDeBancoDeDados.obterBancoDeDados(perfilDoUsuario);

    bancoDeDados.conectar();
    bancoDeDados.executarConsulta("SELECT * FROM usuarios");
    bancoDeDados.desconectar();
  }
}
