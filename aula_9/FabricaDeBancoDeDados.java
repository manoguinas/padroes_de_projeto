public class FabricaDeBancoDeDados {
    public static BancoDeDados obterBancoDeDados(String perfil) {
        switch (perfil.toLowerCase()) {
            case "gratuito":
                return new ParadoxBancoDeDados();
            case "basico":
                return new FirebirdBancoDeDados();
            case "ultimate":
                return new MySQLBancoDeDados();
            default:
                throw new IllegalArgumentException("Perfil desconhecido: " + perfil);
        }
    }
}
