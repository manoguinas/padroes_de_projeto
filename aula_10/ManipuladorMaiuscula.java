import java.util.regex.Pattern;

class ManipuladorMaiuscula extends Manipulador {
  @Override
  public boolean verificar(String login, String senha) {
    if (Pattern.compile("[A-Z]").matcher(senha).find()) {
      if (proximo != null) {
        return proximo.verificar(login, senha);
      }
      return true;
    }
    System.out.println("A senha deve conter pelo menos um caractere maiúsculo.");
    return false;
  }
}