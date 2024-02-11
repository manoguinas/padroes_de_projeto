class MySqlDatabase {
  public void conectar() {
      System.out.println("Conectando ao MySQL database...");
  }

  public void desconectar() {
      System.out.println("Desconectando do MySQL database...");
  }

  public void executarQuery(String query) {
      System.out.println("Executando query no MySQL database: " + query);
  }
}

class ProdutoService {
  private MySqlDatabase mySqlDatabase;

  public ProdutoService() {
      this.mySqlDatabase = new MySqlDatabase();
  }

  public void salvarProduto(String nome) {
      mySqlDatabase.conectar();
      mySqlDatabase.executarQuery("INSERT INTO produtos (nome) VALUES ('" + nome + "')");
      mySqlDatabase.desconectar();
  }
}

public class dipIncorreta {
  public static void main(String[] args) {
      ProdutoService produtoService = new ProdutoService();
      produtoService.salvarProduto("Notebook");
  }
}

/*
 * A classe de alto nível depende da classe de baixo nível.
 * Isso viola o DIP porque de mais alto nível deveria depender de abstrações,
 * não de implementações concretas. 
 */