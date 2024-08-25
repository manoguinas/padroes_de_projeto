import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RealDatabaseService realService = new RealDatabaseService();
        DatabaseServiceProxy proxyService = new DatabaseServiceProxy(realService);
        LoggingDatabaseServiceDecorator loggedService = new LoggingDatabaseServiceDecorator(proxyService);

        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        loggedService.saveUser(user1);
        loggedService.saveUser(user2);

        loggedService.listUsers();
    }
}
