import java.util.regex.Pattern;

class ManipuladorNumeroConsecutivo extends Manipulador {
    @Override
    public boolean verificar(String login, String senha) {
        if (!Pattern.compile(".*\\d{3,}.*").matcher(senha).find()) {
            if (proximo != null) {
                return proximo.verificar(login, senha);
            }
            return true;
        }
        System.out.println("A senha não deve conter três números consecutivos.");
        return false;
    }
}