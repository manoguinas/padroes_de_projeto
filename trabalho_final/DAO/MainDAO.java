public class MainDAO {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();

        userDAO.addUser(new User(1, "João"));
        userDAO.addUser(new User(2, "Maria"));

        for (User user : userDAO.getAllUsers()) {
            System.out.println(user);
        }

        User user = userDAO.getUser(1);
        if (user != null) {
            System.out.println("Usuário obtido: " + user);
        }
    }
}
