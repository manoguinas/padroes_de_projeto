import java.util.Random;

class LoginSystem {
  private static LoginSystem instance;
  private String username;
  private String password;
  public String botVerificationCode;

  private LoginSystem() {
    username = "admin";
    password = "password123";
    botVerificationCode = generateVerificationCode();
  }

  public static LoginSystem getInstance() {
    if (instance == null) {
      instance = new LoginSystem();
    }
    return instance;
  }

  public boolean login(String username, String password, String verificationCode) {
    if (this.username.equals(username) && this.password.equals(password)
        && this.botVerificationCode.equals(verificationCode)) {
      System.out.println("Login bem-sucedido!");
      return true;
    } else {
      System.out.println("Login falhou. Verifique suas credenciais e o código de verificação.");
      return false;
    }
  }

  private String generateVerificationCode() {
    Random random = new Random();
    StringBuilder code = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      char c = (char) (random.nextInt(94) + 33);
      code.append(c);
    }
    return code.toString();
  }
}