import java.util.ArrayList;
import java.util.List;

public class RealDatabaseService implements DatabaseService {
    private List<User> users = new ArrayList<>();

    @Override
    public void saveUser(User user) {
        users.add(user);
        System.out.println("Usuário salvo: " + user.getName());
    }

    @Override
    public User getUserById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(u -> u.getId() == id);
        System.out.println("Usuário removido: " + id);
    }

    @Override
    public void listUsers() {
        users.forEach(u -> System.out.println(u.getId() + ": " + u.getName()));
    }
}
