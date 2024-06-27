import java.util.regex.Pattern;

class ManipuladorMinuscula extends Manipulador {
    @Override
    public boolean verificar(String login, String senha) {
        if (Pattern.compile("[a-z]").matcher(senha).find()) {
            if (proximo != null) {
                return proximo.verificar(login, senha);
            }
            return true;
        }
        System.out.println("A senha deve conter pelo menos um caractere minúsculo.");
        return false;
    }
}