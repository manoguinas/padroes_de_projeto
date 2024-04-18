public class Main {
  public static void main(String[] args) {
    DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();

    for (int i = 1; i <= 5; i++) {
      DatabaseAccessThread thread = new DatabaseAccessThread(connectionManager, "Thread " + i);
      thread.start();
    }
  }
}
