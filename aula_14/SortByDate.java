import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByDate implements SortStrategy {

    @Override
    public void sort(List<User> users) {
        // Suponha que a classe User tenha uma data de criação para ordenar.
        Collections.sort(users, Comparator.comparing(User::getId)); // Usando ID como proxy para a data aqui.
    }
}
