import java.util.concurrent.atomic.AtomicBoolean;

class DatabaseConnectionManager {
  private static DatabaseConnectionManager instance;
  private AtomicBoolean isConnectionOpen;

  private DatabaseConnectionManager() {
    isConnectionOpen = new AtomicBoolean(false);
    System.out.println("Conexão com o banco de dados aberta.");
  }

  public static synchronized DatabaseConnectionManager getInstance() {
    if (instance == null) {
      instance = new DatabaseConnectionManager();
    }
    return instance;
  }

  public void openConnection() {
    isConnectionOpen.set(true);
  }

  public void closeConnection() {
    isConnectionOpen.set(false);
    System.out.println("Conexão com o banco de dados fechada.");
  }

  public boolean isConnectionOpen() {
    return isConnectionOpen.get();
  }
}