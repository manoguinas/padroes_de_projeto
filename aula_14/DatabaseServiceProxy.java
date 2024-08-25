public class DatabaseServiceProxy implements DatabaseService {
    private RealDatabaseService realService;
    
    public DatabaseServiceProxy(RealDatabaseService realService) {
        this.realService = realService;
    }

    @Override
    public void saveUser(User user) {
        System.out.println("Proxy: Salvando usuário...");
        realService.saveUser(user);
    }

    @Override
    public User getUserById(int id) {
        System.out.println("Proxy: Obtendo usuário por ID...");
        return realService.getUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        System.out.println("Proxy: Deletando usuário...");
        realService.deleteUser(id);
    }

    @Override
    public void listUsers() {
        System.out.println("Proxy: Listando usuários...");
        realService.listUsers();
    }
}
