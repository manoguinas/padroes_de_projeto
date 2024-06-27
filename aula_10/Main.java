public class Main {
    public static void main(String[] args) {
        String login = "usuario1";
        String senha = "Abc@12cba";

        Manipulador loginManipulador = new ManipuladorLogin();
        Manipulador maiusculaManipulador = new ManipuladorMaiuscula();
        Manipulador minusculaManipulador = new ManipuladorMinuscula();
        Manipulador caractereEspecialManipulador = new ManipuladorCaractereEspecial();
        Manipulador numeroManipulador = new ManipuladorNumero();
        Manipulador numeroConsecutivoManipulador = new ManipuladorNumeroConsecutivo();
        Manipulador tamanhoManipulador = new ManipuladorTamanho();

        loginManipulador.setProximo(maiusculaManipulador);
        maiusculaManipulador.setProximo(minusculaManipulador);
        minusculaManipulador.setProximo(caractereEspecialManipulador);
        caractereEspecialManipulador.setProximo(numeroManipulador);
        numeroManipulador.setProximo(numeroConsecutivoManipulador);
        numeroConsecutivoManipulador.setProximo(tamanhoManipulador);

        if (loginManipulador.verificar(login, senha)) {
            System.out.println("Login e senha válidos.");
        } else {
            System.out.println("Falha na validação do login ou senha.");
        }
    }
}