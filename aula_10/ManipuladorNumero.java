import java.util.regex.Pattern;

class ManipuladorNumero extends Manipulador {
    @Override
    public boolean verificar(String login, String senha) {
        if (Pattern.compile("[0-9]").matcher(senha).find()) {
            if (proximo != null) {
                return proximo.verificar(login, senha);
            }
            return true;
        }
        System.out.println("A senha deve conter pelo menos um número.");
        return false;
    }
}