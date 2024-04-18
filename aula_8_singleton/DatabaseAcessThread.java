class DatabaseAccessThread extends Thread {
  private DatabaseConnectionManager connectionManager;

  public DatabaseAccessThread(DatabaseConnectionManager connectionManager, String name) {
    super(name);
    this.connectionManager = connectionManager;
  }

  @Override
  public void run() {
    if (connectionManager.isConnectionOpen()) {
      System.out.println(getName() + " está acessando o banco de dados.");
    } else {
      System.out.println(getName() + " não pode acessar o banco de dados. Conexão fechada.");
    }
  }
}