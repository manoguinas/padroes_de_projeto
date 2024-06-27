import java.util.Arrays;
import java.util.List;

class ManipuladorLogin extends Manipulador {
  private List<String> loginsValidos = Arrays.asList("usuario1", "usuario2", "usuario3");

  @Override
  public boolean verificar(String login, String senha) {
    if (loginsValidos.contains(login)) {
      if (proximo != null) {
        return proximo.verificar(login, senha);
      }
      return true;
    }
    System.out.println("Login não cadastrado.");
    return false;
  }
}