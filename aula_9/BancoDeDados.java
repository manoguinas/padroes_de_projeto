public interface BancoDeDados {
  void conectar();

  void desconectar();

  void executarConsulta(String consulta);
}
