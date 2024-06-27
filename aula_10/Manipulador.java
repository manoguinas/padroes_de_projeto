import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

abstract class Manipulador {
    protected Manipulador proximo;

    public void setProximo(Manipulador proximo) {
        this.proximo = proximo;
    }

    public abstract boolean verificar(String login, String senha);
}