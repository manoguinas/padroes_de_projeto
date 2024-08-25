import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByDate implements SortStrategy {

    @Override
    public void sort(List<User> users) {
        Collections.sort(users, Comparator.comparing(User::getId));
    }
}
