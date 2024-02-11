interface Database {
  void conectar();
  void desconectar();
  void executarQuery(String query);
}

class MySqlDatabase implements Database {
  @Override
  public void conectar() {
      System.out.println("Conectando ao MySQL database...");
  }

  @Override
  public void desconectar() {
      System.out.println("Desconectando do MySQL database...");
  }

  @Override
  public void executarQuery(String query) {
      System.out.println("Executando query no MySQL database: " + query);
  }
}

class ProdutoService {
  private Database database;

  public ProdutoService(Database database) {
      this.database = database;
  }

  public void salvarProduto(String nome) {
      database.conectar();
      database.executarQuery("INSERT INTO produtos (nome) VALUES ('" + nome + "')");
      database.desconectar();
  }
}

public class dipCorreta {
  public static void main(String[] args) {
      Database mySqlDatabase = new MySqlDatabase();
      ProdutoService produtoService = new ProdutoService(mySqlDatabase);
      produtoService.salvarProduto("Notebook");
  }
}
