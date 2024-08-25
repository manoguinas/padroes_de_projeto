public abstract class DatabaseServiceDecorator implements DatabaseService {
    protected DatabaseService decoratedService;

    public DatabaseServiceDecorator(DatabaseService decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public void saveUser(User user) {
        decoratedService.saveUser(user);
    }

    @Override
    public User getUserById(int id) {
        return decoratedService.getUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        decoratedService.deleteUser(id);
    }

    @Override
    public void listUsers() {
        decoratedService.listUsers();
    }
}
