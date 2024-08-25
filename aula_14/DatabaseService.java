public interface DatabaseService {
    void saveUser(User user);
    User getUserById(int id);
    void deleteUser(int id);
    void listUsers();
}
