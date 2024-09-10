import java.util.List;

public interface UserDAO {
    void addUser(User user);
    User getUser(int id);
    List<User> getAllUsers();
}
