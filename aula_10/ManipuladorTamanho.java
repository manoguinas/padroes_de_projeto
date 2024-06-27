class ManipuladorTamanho extends Manipulador {
    @Override
    public boolean verificar(String login, String senha) {
        if (senha.length() >= 8 && senha.length() <= 16) {
            if (proximo != null) {
                return proximo.verificar(login, senha);
            }
            return true;
        }
        System.out.println("A senha deve ter entre 8 e 16 caracteres.");
        return false;
    }
}