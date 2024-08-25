public class LoggingDatabaseServiceDecorator extends DatabaseServiceDecorator {

    public LoggingDatabaseServiceDecorator(DatabaseService decoratedService) {
        super(decoratedService);
    }

    @Override
    public void saveUser(User user) {
        System.out.println("Log: Salvando usuário...");
        super.saveUser(user);
    }

    @Override
    public User getUserById(int id) {
        System.out.println("Log: Obtendo usuário por ID...");
        return super.getUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        System.out.println("Log: Deletando usuário...");
        super.deleteUser(id);
    }

    @Override
    public void listUsers() {
        System.out.println("Log: Listando usuários...");
        super.listUsers();
    }
}
